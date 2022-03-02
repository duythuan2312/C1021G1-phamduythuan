package service;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    List<User> listUser() throws SQLException;
    void  addNew(User user);
    void remove(int id);
    void updateUser(User user);
    User select(int id);
    List<User> searchUser(String country);

}
