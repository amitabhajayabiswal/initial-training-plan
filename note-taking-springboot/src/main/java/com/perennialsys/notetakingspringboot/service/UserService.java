package com.perennialsys.notetakingspringboot.service;

import com.perennialsys.notetakingspringboot.model.Login;
import com.perennialsys.notetakingspringboot.model.User;

public interface UserService {
    public void registerUser(User user);
    public boolean validateUser(Login login);
}
