package dao;

import model.Login;
import model.User;

public interface UserDao {
    public int register(User user);
    public User validateUser(Login login);
}
