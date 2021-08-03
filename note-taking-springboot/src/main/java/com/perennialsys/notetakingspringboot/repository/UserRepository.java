package com.perennialsys.notetakingspringboot.repository;

import com.perennialsys.notetakingspringboot.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
    User findByFirstName(String username);
}
