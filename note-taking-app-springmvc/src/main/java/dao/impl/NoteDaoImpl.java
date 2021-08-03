package dao.impl;

import java.util.List;
import model.Notes;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;

import dao.NotesDAO;

public class NoteDaoImpl implements NotesDAO{
    
    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void addNotes(){
        String sql = "select * from notes";
        //List<Notes> notesList = jdbcTemplate.query(sql, new NotesMapper());
    }

    public void fetchNotes(){
        
    }

    public void editNotes(){
        
    }

    public void deleteNotes(){

    }
}

/*
class NotesMapper implements RowMapper<Notes>{

    @Override
    public int[] getRowsForPaths(TreePath[] path) {
        
        return null;
    }

}
*/