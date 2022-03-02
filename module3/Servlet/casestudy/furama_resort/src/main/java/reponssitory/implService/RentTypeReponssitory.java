package reponssitory.implService;

import model.service.RentType;
import reponssitory.CreateReponssitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RentTypeReponssitory implements ReponssitoryRentType {
    private static final String SELECT_ALL_RENT_TYPE ="SELECT * from rent_type;";
    CreateReponssitory createReponssitory = new CreateReponssitory();
    @Override
    public List<RentType> selectAll() {
        Connection connection = createReponssitory.getConnection();
        List<RentType> rentTypeArrayList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_RENT_TYPE);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int rentTypeId = resultSet.getInt("rent_type_id");
                    String rentTypeNameypeName = resultSet.getString("rent_type_name");
                    double rentTypeCost = resultSet.getDouble("rent_type_cost");
                    rentTypeArrayList.add( new RentType(rentTypeId,rentTypeNameypeName,rentTypeCost));
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
        return rentTypeArrayList;
    }
}
