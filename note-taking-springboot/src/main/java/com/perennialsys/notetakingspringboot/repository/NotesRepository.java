package com.perennialsys.notetakingspringboot.repository;

import com.perennialsys.notetakingspringboot.model.Login;
import com.perennialsys.notetakingspringboot.model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface NotesRepository extends JpaRepository<Notes, String> {

}
