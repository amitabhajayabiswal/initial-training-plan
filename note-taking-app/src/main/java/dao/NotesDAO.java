package dao;

import org.hibernate.Transaction;
import org.hibernate.exception.DataException;
import org.hibernate.query.Query;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entities.Note;
import helper.FactoryProvider;

public class NotesDAO {
    
    //SessionFactory databaseSession = FactoryProvider.getFactory();
    Session noteDatabaSession;
    Transaction databaseTransaction;

    //Check fornaming convention for crud operations
    public void addNotes(Note notes){
        
        noteDatabaSession = FactoryProvider.getFactory().openSession();

        try{
            databaseTransaction = noteDatabaSession.beginTransaction();
            noteDatabaSession.save(notes);
            databaseTransaction.commit();
            noteDatabaSession.close();
        }
        catch(DataException dataException){
            dataException.printStackTrace();
        }
        catch(HibernateException hibernateException){
            try{
                databaseTransaction.rollback();
            } catch(RuntimeException re){
                System.err.println("Couldnot rollback transaction");
            }
            hibernateException.printStackTrace();
        }
    }

    public void deleteNotes(int noteId){

        noteDatabaSession = FactoryProvider.getFactory().openSession();
        databaseTransaction = noteDatabaSession.beginTransaction();
        Note note=(Note)noteDatabaSession.get(Note.class, noteId);
        
        noteDatabaSession.delete(note);
        databaseTransaction.commit();
        noteDatabaSession.close();
    }

    public void updateNotes(int noteId, String content, String title){

        //check for update method on internet for hibernate
        noteDatabaSession = FactoryProvider.getFactory().openSession();
        databaseTransaction = noteDatabaSession.beginTransaction();
        Note note = noteDatabaSession.get(Note.class, noteId);
        note.setId(noteId);
        note.setContent(content);
        note.setTitle(title);
        noteDatabaSession.update(note);
        databaseTransaction.commit();
        noteDatabaSession.close();
        
    }
    
    protected EntityManager manager;

    public List<Note> getNotesList(){
        //try to use lazy loading
        //check for fetching in hibernate
        List<Note> list;

            noteDatabaSession = FactoryProvider.getFactory().openSession();
            databaseTransaction = noteDatabaSession.beginTransaction();
            list = noteDatabaSession.createQuery("SELECT a FROM a", Note.class).getResultList();
                
            System.out.println(list.toString());
            databaseTransaction.commit();
            noteDatabaSession.close();
        /*
        }
        catch (Exception e){
            databaseTransaction.rollback();
            e.printStackTrace();
        }*/
        return list;
        //return s.getClass();
    }
}
