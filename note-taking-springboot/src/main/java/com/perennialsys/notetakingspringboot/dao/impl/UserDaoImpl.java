package com.perennialsys.notetakingspringboot.dao.impl;

import com.perennialsys.notetakingspringboot.dao.UserDao;
import com.perennialsys.notetakingspringboot.model.Login;
import com.perennialsys.notetakingspringboot.model.User;
import com.perennialsys.notetakingspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl implements UserDao {

    @Autowired
    UserRepository userRepository;

    @Override
    public void register(User user) {
        userRepository.save(user);
    }

    @Override
    public boolean validateUser(Login login) {
        String username = login.getUsername();
        User user = userRepository.findByFirstName(username);
        //Turn this into optional

        if(user!= null){
            return true;
        }else{
            return false;
        }
    }
}
