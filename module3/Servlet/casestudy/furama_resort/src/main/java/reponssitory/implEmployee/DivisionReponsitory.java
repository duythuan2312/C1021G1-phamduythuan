package reponssitory.implEmployee;

import model.customer.CustomerType;
import model.employee.Division;
import reponssitory.CreateReponssitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DivisionReponsitory implements ServiceDivision{
    private static final String SELECT_ALL_CUSTOMER_TYPE = "SELECT * FROM division";
    CreateReponssitory createReponssitory = new CreateReponssitory();
    @Override
    public List<Division> selectAll() {
        Connection connection = createReponssitory.getConnection();
        List<Division> divisionList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER_TYPE);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int division_id = resultSet.getInt("division_id");
                    String division_name = resultSet.getString("division_name");
                    divisionList.add(new Division(division_id, division_name));
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
        return divisionList;
    }
}
