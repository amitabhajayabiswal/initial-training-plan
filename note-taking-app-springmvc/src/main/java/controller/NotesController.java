package controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.impl.NoteDaoImpl;

@Controller
public class NotesController {
    
    NoteDaoImpl noteDaoImpl = new NoteDaoImpl();

    @RequestMapping(value = "/notes", method= RequestMethod.GET)
    public void getNotes(){
        noteDaoImpl.fetchNotes();
    }
    @RequestMapping(value = "/notes" , method = RequestMethod.GET)
    public void addNotes(){
        noteDaoImpl.addNotes();
    }
    @RequestMapping(value = "/notes" , method = RequestMethod.PUT)
    public void editNotes(){
        noteDaoImpl.editNotes();
    }
    @RequestMapping(value = "/notes" , method = RequestMethod.DELETE)
    public void deleteNotes(){
        noteDaoImpl.deleteNotes();
    }
}
