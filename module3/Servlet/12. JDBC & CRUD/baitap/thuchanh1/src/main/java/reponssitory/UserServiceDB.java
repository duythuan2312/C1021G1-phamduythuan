package reponssitory;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserServiceDB {
        void insertUser(User user);
        User selectUser(int id);
        List<User> selectAllUser() throws SQLException;
        boolean removeUser(int id);
        boolean updateUser(User user);
        List<User> searchCountry(String country);


}
