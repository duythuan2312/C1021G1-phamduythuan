package service;

import model.User;
import reponssitory.UserServiceDBIpml;

import java.sql.SQLException;
import java.util.List;

public class UserServiceIpml implements UserService {
    UserServiceDBIpml userServiceDBIpml = new UserServiceDBIpml();

    @Override
    public List<User> listUser() throws SQLException {
        List<User> userList = this.userServiceDBIpml.selectAllUser();
        return userList;
    }

    @Override
    public void addNew(User user) {
    userServiceDBIpml.insertUser(user);
    }

    @Override
    public void remove(int id) {
        userServiceDBIpml.removeUser(id);

    }

    @Override
    public void updateUser(User user) {
     userServiceDBIpml.updateUser(user);
    }

    @Override
    public User select(int id) {
       User user1 = userServiceDBIpml.selectUser(id);

        return user1;
    }

    @Override
    public List<User> searchUser(String country) {
        List<User> userList = this.userServiceDBIpml.searchCountry(country);
        return userList;
    }


}
