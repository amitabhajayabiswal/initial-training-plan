package com.perennialsys.notetakingspringboot.dao;

import com.perennialsys.notetakingspringboot.model.Notes;

import java.util.List;

public interface NotesDao {
    public List<Notes> fetchNotes();
    public void editNotes(String id);
    public void addNotes(Notes notes);
    public void deleteNotes(Notes notes);
}
