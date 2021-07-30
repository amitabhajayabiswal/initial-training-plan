package dao;

import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.hibernate.exception.DataException;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.QueryTimeoutException;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import entities.Note;
import exception.CustomException;
import helper.FactoryProvider;

public class NotesDAO {

    Session noteDatabaseConnection;
    Transaction databaseTransaction;
    protected EntityManager manager;

    public NotesDAO(){
        noteDatabaseConnection = FactoryProvider.getFactory().openSession();
    }

    public void addNotes(Note notes) throws CustomException{
        
        try{
            databaseTransaction = noteDatabaseConnection.beginTransaction();
            noteDatabaseConnection.save(notes);
            databaseTransaction.commit();
        }
        catch(DataException dataException){
            dataException.printStackTrace();
            databaseTransaction.rollback();
        }
        catch(ConstraintViolationException constraintViolationException){
            databaseTransaction.rollback();
            if(notes.getTitle() == null || notes.getContent() == null){
                throw new CustomException("Title or notes of the form cannot be null");
            }
            constraintViolationException.printStackTrace();
        }
        catch(HibernateException hibernateException){
            hibernateException.printStackTrace();
            databaseTransaction.rollback();
        }
        finally{
            noteDatabaseConnection.close();
        }
    }

    public void deleteNotes(int noteId){

        try{
            noteDatabaseConnection = FactoryProvider.getFactory().openSession();
            databaseTransaction = noteDatabaseConnection.beginTransaction();
            Note note=(Note)noteDatabaseConnection.get(Note.class, noteId);
        
            noteDatabaseConnection.delete(note);
            databaseTransaction.commit();
        }catch(Exception e){
            e.printStackTrace();
            databaseTransaction.rollback();
        }finally{
            noteDatabaseConnection.close();
        }
    }

    public void updateNotes(int noteId, String content, String title){

        try{
            databaseTransaction = noteDatabaseConnection.beginTransaction();
            Note note = noteDatabaseConnection.get(Note.class, noteId);
            note.setId(noteId);
            note.setContent(content);
            note.setTitle(title);
            noteDatabaseConnection.update(note);
            databaseTransaction.commit();
        }catch(Exception e){
            databaseTransaction.rollback();    
        }finally{
            noteDatabaseConnection.close();
        }
    }
    
    public List<Note> getNotesList(){
        
        List<Note> notesList=null;
        try{
            databaseTransaction = noteDatabaseConnection.beginTransaction();
            notesList = noteDatabaseConnection.createQuery("from note",Note.class).getResultList();  
            databaseTransaction.commit();
        }
        catch(QueryTimeoutException queryTimeoutException){
            queryTimeoutException.printStackTrace();
            noteDatabaseConnection.close();
        }finally{
            noteDatabaseConnection.close();
        }
        return notesList;
    }
}
