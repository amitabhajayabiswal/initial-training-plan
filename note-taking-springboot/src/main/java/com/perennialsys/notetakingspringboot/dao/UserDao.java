package com.perennialsys.notetakingspringboot.dao;

import com.perennialsys.notetakingspringboot.model.Login;
import com.perennialsys.notetakingspringboot.model.User;

public interface UserDao {
    public void register(User user);
    public boolean validateUser(Login login);
}
