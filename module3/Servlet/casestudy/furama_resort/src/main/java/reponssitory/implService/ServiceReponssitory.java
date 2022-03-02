package reponssitory.implService;

import model.service.Service;
import reponssitory.CreateReponssitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceReponssitory implements ReponssitoryService{
    private static final String SELECT_ALL_SERVICE = "SELECT * FROM service join rent_type on service.rent_type_id = rent_type.rent_type_id join service_type on service.service_type_id = service_type.service_type_id;";
    private static final String INSERT_SERVICE = "insert into service(service_name, service_area,service_cost, service_max_people," +
            "standard_room,description_other_convenience,pool_area,number_of_floors,rent_type_id, service_type_id) values (?,?,?,?,?,?,?,?,?,?);";

    CreateReponssitory createReponssitory = new CreateReponssitory();
    @Override
    public List<Service> selectAll() {
        Connection connection = createReponssitory.getConnection();
        List<Service> serviceList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_SERVICE);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int service_id = resultSet.getInt("service_id");
                    String service_name = resultSet.getString("service_name");
                    int service_area = resultSet.getInt("service_area");
                    double service_cost = resultSet.getDouble("service_cost");
                    int service_max_people = resultSet.getInt("service_max_people");
                    String standard_room = resultSet.getString("standard_room");
                    String description_other_convenience = resultSet.getString("description_other_convenience");
                    double pool_area = resultSet.getDouble("pool_area");
                    int number_of_floors = resultSet.getInt("number_of_floors");
                    int rent_type_id = resultSet.getInt("rent_type_id");
                    int service_type_id = resultSet.getInt("service_type_id");
                    serviceList.add(new Service(service_id,service_name,service_area,service_cost,service_max_people,standard_room,description_other_convenience,pool_area,number_of_floors,rent_type_id,service_type_id));
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
        return serviceList;
    }

    @Override
    public void insertService(Service service) {
        Connection connection = createReponssitory.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(INSERT_SERVICE);
                preparedStatement.setString(1,service.getServiceName());
                preparedStatement.setInt(2,service.getServiceArea());
                preparedStatement.setDouble(3,service.getServiceCost());
                preparedStatement.setInt(4,service.getServiceMaxPeople());
                preparedStatement.setString(5,service.getStandardRom());
                preparedStatement.setString(6,service.getDescriptionOtherConveniece());
                preparedStatement.setDouble(7,service.getPoolArea());
                preparedStatement.setInt(8,service.getNumberOfFloors());
                preparedStatement.setInt(9,service.getRentTypeId());
                preparedStatement.setInt(10,service.getServiceTypeId());
                preparedStatement.executeUpdate();
            }catch (SQLException e){
                e.printStackTrace();
            }finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}
