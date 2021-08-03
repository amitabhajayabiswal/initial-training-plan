package com.perennialsys.notetakingspringboot.controller;

import com.perennialsys.notetakingspringboot.dao.NotesDao;
import com.perennialsys.notetakingspringboot.dao.impl.NotesDaoImpl;
import com.perennialsys.notetakingspringboot.model.Notes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class NotesController {

    NotesDao notesDao = new NotesDaoImpl();

    @RequestMapping(value = "/notes", method = RequestMethod.POST)
    public String addNotes(@RequestParam(name="title", required = true) String title, @RequestParam(name="content", required = true) String content, Model model){
        Notes notes = new Notes();
        //notes.setId(1); //Handling it later
        notes.setTitle(title);
        notes.setDescription(content);
        notesDao.addNotes(notes);
        return "addNotes.jsp";
    }
    @RequestMapping(value = "/notes", method = RequestMethod.PUT)
    public void editNotes(){

    }
    @RequestMapping(value = "/notes", method = RequestMethod.DELETE)
    public void deleteNotes(){
        //notesDao.deleteNotes(notes);
    }

    @RequestMapping(value = "/notes", method = RequestMethod.GET)
    public List<Notes> notesList(){
        NotesDao notesDao = new NotesDaoImpl();
        return notesDao.fetchNotes();
    }
}
