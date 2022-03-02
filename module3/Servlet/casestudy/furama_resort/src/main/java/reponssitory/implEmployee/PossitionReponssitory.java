package reponssitory.implEmployee;

import model.customer.CustomerType;
import model.employee.Possition;
import reponssitory.CreateReponssitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PossitionReponssitory implements ServicePossition{
    private static final String SELECT_ALL_POSSITION = "SELECT * FROM position";

    CreateReponssitory createReponssitory = new CreateReponssitory();
    @Override
    public List<Possition> selectAll() {
        Connection connection = createReponssitory.getConnection();
        List<Possition> possitionList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_POSSITION);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int position_id = resultSet.getInt("position_id");
                    String position_name = resultSet.getString("position_name");
                    possitionList.add(new Possition(position_id,position_name));
                }

            } catch ( SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return possitionList;
    }
}
