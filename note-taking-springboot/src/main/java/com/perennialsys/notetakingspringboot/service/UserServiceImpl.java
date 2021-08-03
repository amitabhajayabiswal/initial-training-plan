package com.perennialsys.notetakingspringboot.service;

import com.perennialsys.notetakingspringboot.dao.UserDao;
import com.perennialsys.notetakingspringboot.dao.impl.UserDaoImpl;
import com.perennialsys.notetakingspringboot.model.Login;
import com.perennialsys.notetakingspringboot.model.User;

public class UserServiceImpl implements UserService{

    UserDao userDao = new UserDaoImpl();
    public void registerUser(User user){
        userDao.register(user);
    }

    public boolean validateUser(Login login){
        return userDao.validateUser(login);
    }
}
