package com.perennialsys.notetakingspringboot.dao.impl;

import com.perennialsys.notetakingspringboot.dao.NotesDao;
import com.perennialsys.notetakingspringboot.model.Notes;
import com.perennialsys.notetakingspringboot.model.User;
import com.perennialsys.notetakingspringboot.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class NotesDaoImpl implements NotesDao {
    @Autowired
    NotesRepository notesRepository;
    @Override
    public List<Notes> fetchNotes() {
        return notesRepository.findAll();
    }

    @Override
    public void editNotes(String id) {
        Optional<Notes> notes = notesRepository.findById(id);
    }

    @Override
    public void addNotes(Notes notes) {
        notesRepository.save(notes);
    }

    @Override
    public void deleteNotes(Notes notes) {
        notesRepository.delete(notes);
    }
}
