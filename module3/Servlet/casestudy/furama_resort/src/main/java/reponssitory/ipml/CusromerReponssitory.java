package reponssitory.ipml;

import model.customer.Customer;
import reponssitory.CreateReponssitory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CusromerReponssitory implements CustomerReponsitory {
    private static final String SELECT_ALL_CUSTOMER = "SELECT * FROM customer join customer_type on customer.customer_type_id = customer_type.customer_type_id;";
    private static final String INSERT_CUSTOMER = "insert into customer(customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address,customer_type_id) values (?,?,?,?,?,?,?,?);";
    private static final String DELETE_CUSTOMER = "delete from customer where customer_id = ?";
    private static final String UPDATE_CUSTOMER = "UPDATE customer set customer_name = ?,customer_birthday= ?,customer_gender=?,customer_id_card=?,customer_phone=?,customer_email= ?, customer_address =?,customer_type_id=? where customer_id = ?;";
    private static final String SELECT_ID_CUSTOMER = "select * from customer where customer_id =?;";

    public CreateReponssitory createReponssitory = new CreateReponssitory();


    @Override
    public List<Customer> selectAll() {
        Connection connection = createReponssitory.getConnection();
        List<Customer> customerList = new ArrayList<>();
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int idCustomer = resultSet.getInt("customer_id");
                    String nameCustomer = resultSet.getString("customer_name");
                    String birthday = resultSet.getString("customer_birthday");
                    Boolean gender = resultSet.getBoolean("customer_gender");
                    String customerCode = resultSet.getString("customer_id_card");
                    String customerPhone = resultSet.getString("customer_phone");
                    String customerEmail = resultSet.getString("customer_email");
                    String customerAddress = resultSet.getString("customer_address");
                    int customerTypeId = resultSet.getInt("customer_type_id");
                    String customerNameType = resultSet.getString("customer_type_name");
                    Customer customer = new Customer(idCustomer,nameCustomer,birthday,gender,customerCode,customerPhone,customerEmail,customerAddress,customerTypeId,customerNameType);
                    customerList.add(customer);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return customerList;
    }

    @Override
    public Customer selectID(int id) {
        Customer customer = null;
        Connection connection = createReponssitory.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ID_CUSTOMER);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String nameCustomer = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                Boolean gender = resultSet.getBoolean("customer_gender");
                String customerCode = resultSet.getString("customer_id_card");
                String customerPhone = resultSet.getString("customer_phone");
                String customerEmail = resultSet.getString("customer_email");
                String customerAddress = resultSet.getString("customer_address");
                int customerType_Id = resultSet.getInt("customer_type_id");
                 customer = new Customer(id,nameCustomer,birthday,gender,customerCode,customerPhone,customerEmail,customerAddress, customerType_Id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customer;
    }

    @Override
    public void create(Customer customer) {
        Connection connection = createReponssitory.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(INSERT_CUSTOMER);
                preparedStatement.setString(1,customer.getNameCustomer());
                preparedStatement.setString(2,customer.getBirthday());
                preparedStatement.setBoolean(3,customer.isGender());
                preparedStatement.setString(4,customer.getCustomerCode());
                preparedStatement.setString(5,customer.getPhone());
                preparedStatement.setString(6,customer.getEmail());
                preparedStatement.setString(7,customer.getAddress());
                preparedStatement.setInt(8,customer.getIdCustomerType());
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

    @Override
    public void remove(int id) {
        Connection connection = createReponssitory.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(DELETE_CUSTOMER);
                preparedStatement.setInt(1,id);
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
    @Override
    public void update(Customer customer) {
        Connection connection = createReponssitory.getConnection();
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER);
                preparedStatement.setString(1, customer.getNameCustomer());
                preparedStatement.setString(2 ,customer.getBirthday());
                preparedStatement.setBoolean(3,customer.isGender());
                preparedStatement.setString(4,customer.getCustomerCode());
                preparedStatement.setString(5,customer.getPhone());
                preparedStatement.setString(6,customer.getEmail());
                preparedStatement.setString(7,customer.getAddress());
                preparedStatement.setInt(8,customer.getIdCustomerType());
                preparedStatement.setInt(9,customer.getIdCustomer());
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    @Override
    public List<Customer> searchName(String name) {
        List<Customer> customerList = new ArrayList<>();
        String query = "{Call search_name_customer(?)}";

        CreateReponssitory createReponssitory = new CreateReponssitory();
        Connection connection = createReponssitory.getConnection();

        try {
            CallableStatement callableStatement = connection.prepareCall(query);
            callableStatement.setString(1,"%"+name+"%");
            ResultSet resultSet = callableStatement.executeQuery();
            Customer customer = new Customer();
            while (resultSet.next()){
                customer.setIdCustomer(resultSet.getInt("customer_id"));
                customer.setNameCustomer(resultSet.getString("customer_name"));
                customer.setBirthday(resultSet.getString("customer_birthday"));
                customer.setGender(resultSet.getBoolean("customer_gender"));
                customer.setCustomerCode(resultSet.getString("customer_id_card"));
                customer.setPhone(resultSet.getString("customer_phone"));
                customer.setEmail(resultSet.getString("customer_email"));
                customer.setAddress(resultSet.getString("customer_address"));
                customer.setIdCustomerType(resultSet.getInt("customer_type_id"));
                customerList.add(customer);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
