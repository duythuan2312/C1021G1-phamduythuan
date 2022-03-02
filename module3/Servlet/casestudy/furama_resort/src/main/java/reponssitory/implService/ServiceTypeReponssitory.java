package reponssitory.implService;

import model.service.RentType;
import model.service.ServiceType;
import reponssitory.CreateReponssitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceTypeReponssitory implements ReponsitoryServiceType{
    private static final String SELECT_ALL_SERVICE_TYPE="SELECT * from service_type;";
    CreateReponssitory createReponssitory = new CreateReponssitory();
    @Override
    public List<ServiceType> selectAll() {
        Connection connection = createReponssitory.getConnection();
        List<ServiceType> serviceTypeList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_SERVICE_TYPE);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int serviceTypeId = resultSet.getInt("service_type_id");
                    String serviceTypeName = resultSet.getString("service_type_name");
                    serviceTypeList.add( new ServiceType(serviceTypeId,serviceTypeName));
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
        return serviceTypeList;
    }
}
