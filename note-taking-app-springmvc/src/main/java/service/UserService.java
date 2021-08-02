package service;

import model.Login;
import model.User;

public interface UserService {
    public int register(User user);
    public User validateUser(Login login);
}
