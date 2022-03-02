package reponssitory.implEmployee;

import model.customer.CustomerType;
import model.employee.Education;
import reponssitory.CreateReponssitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EducationReponssitory implements ServiceEducation{
    private static final String SELECT_ALL_CUSTOMER_TYPE = "SELECT * FROM education_degree";

    CreateReponssitory createReponssitory = new CreateReponssitory();
    @Override
    public List<Education> selectAll() {
        Connection connection = createReponssitory.getConnection();
        List<Education> educationList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER_TYPE);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int education_degree_id = resultSet.getInt("education_degree_id");
                    String education_degree_name = resultSet.getString("education_degree_name");
                    educationList.add(new Education(education_degree_id, education_degree_name));
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
        return educationList;
    }
}
