package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;
import model.Notes;

public interface NotesDAO {

    public void fetchNotes();
    public void editNotes();
    public void addNotes();
    public void deleteNotes();
}
