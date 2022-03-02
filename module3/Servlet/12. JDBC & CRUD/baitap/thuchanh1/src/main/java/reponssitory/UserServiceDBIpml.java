package reponssitory;


import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserServiceDBIpml implements UserServiceDB {
    private static final String INSERT_USER_SQL = "INSERT INTO users(name,email,country) VALUES(?,?,?);";
    private static final String SELECT_ALL_USER = "SELECT * FROM users";
    private  static final String DELETE_USER = "DELETE FROM users where id =?;";
    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";
    private  static final  String SEARCH_USER = "select * from users.country where country=?;";

    

    @Override
    public void insertUser(User user) {
    CreateConnection createConnection = new CreateConnection();
        Connection connection = createConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public User selectUser(int id) {
        User user = null;
           CreateConnection createConnection = new CreateConnection();
           Connection connection = createConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                 user = new User(id,name,email,country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public List<User> selectAllUser() throws SQLException {
        List<User> userList = new ArrayList<>();
        CreateConnection createConnection = new CreateConnection();
        Connection connection = createConnection.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(SELECT_ALL_USER);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet resultSet = null;
        try {
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String country = resultSet.getString("country");
            userList.add( new User(id,name,email,country));

        }

        return userList;
    }

    @Override
    public boolean removeUser(int id) {
        boolean rowRemove = false;
        CreateConnection createConnection = new CreateConnection();
        Connection connection = createConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER);
            preparedStatement.setInt(1,id);
           rowRemove = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowRemove;
    }

    @Override
    public boolean updateUser(User user) {
        boolean rowUpdated = false;
        CreateConnection createConnection =new CreateConnection();
        Connection connection = createConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2 ,user.getEmail());
            preparedStatement.setString(3 ,user.getCountry());
            preparedStatement.setString(4, String.valueOf(user.getId()));
            rowUpdated = preparedStatement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rowUpdated;
    }

    @Override
    public List<User> searchCountry(String country) {
        List<User> userList = new ArrayList<>();
        String query = "{Call search_country(?)}";

        CreateConnection createConnection = new CreateConnection();
        Connection connection = createConnection.getConnection();

        try {
            CallableStatement callableStatement = connection.prepareCall(query);
            callableStatement.setString(1,"%"+country+"%");
            ResultSet resultSet = callableStatement.executeQuery();
            User user = new User();
            while (resultSet.next()){
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));
                userList.add(user);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
}
