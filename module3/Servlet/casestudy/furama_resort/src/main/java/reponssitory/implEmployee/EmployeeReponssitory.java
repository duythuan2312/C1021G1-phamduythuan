package reponssitory.implEmployee;

import model.customer.Customer;
import model.employee.Employee;
import reponssitory.CreateReponssitory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReponssitory implements ServiceEmployee{
    private static final String INSERT_EMPLOYEE = "insert into employee(employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id) values (?,?,?,?,?,?,?,?,?,?);";
    private static final String DELETE_EMPLOYEE = "DELETE from employee where employee_id = ?";
    private static final String SELECT_ALL_EMPLOYEE = "SELECT * FROM employee join position on employee.position_id = position.position_id join division on employee.division_id = division.division_id join education_degree on employee.education_degree_id = education_degree.education_degree_id;";
    private static final String SELECT_ID_EMPLOYEE = "select * from employee where employee_id =?;";
    private static final String UPDATE_EMPLOYEE = "UPDATE employee set employee_name = ?,employee_birthday= ?,employee_id_card=?,employee_salary=?,employee_phone=?,employee_email= ?, employee_address =?,position_id=?,education_degree_id=?,division_id=? where employee_id = ?;";

    public CreateReponssitory createReponssitory = new CreateReponssitory();
    @Override
    public List<Employee> selectAll() {
        List<Employee> employeeList = new ArrayList<>();
     Connection connection = createReponssitory.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int employee_id = resultSet.getInt("employee_id");
                String employee_name = resultSet.getString("employee_name");
                String employee_birthday = resultSet.getString("employee_birthday");
                String employee_id_card = resultSet.getString("employee_id_card");
                Double employee_salary = resultSet.getDouble("employee_salary");
                String employee_phone = resultSet.getString("employee_phone");
                String employee_email = resultSet.getString("employee_email");
                String employee_address = resultSet.getString("employee_address");
                int position_id = resultSet.getInt("position_id");
                String position_name = resultSet.getString("position_name");
                int education_degree_id = resultSet.getInt("education_degree_id");
                String education_degree_name = resultSet.getString("education_degree_name");
                int division_id = resultSet.getInt("division_id");
                String division_name = resultSet.getString("division_name");
                Employee employee = new Employee(employee_id, employee_name, employee_birthday, employee_id_card, employee_salary
                        , employee_phone, employee_email, employee_address, position_id, position_name, education_degree_id, education_degree_name, division_id, division_name);
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return employeeList;

    }

    @Override
    public void createEmployee(Employee employee) {
        Connection connection = createReponssitory.getConnection();
        PreparedStatement preparedStatement = null;
        if (connection != null) {
            try {
                preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE);
                preparedStatement.setString(1,employee.getEmployeeName());
                preparedStatement.setString(2,employee.getEmployeeBirthday());
                preparedStatement.setString(3,employee.getEmployeeIdCard());
                preparedStatement.setDouble(4,employee.getSalary());
                preparedStatement.setString(5,employee.getPhone());
                preparedStatement.setString(6,employee.getEmail());
                preparedStatement.setString(7, employee.getAddress());
                preparedStatement.setInt(8,employee.getPositioId());
                preparedStatement.setInt(9,employee.getEducationDegreeId());
                preparedStatement.setInt(10,employee.getDivisionId());
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
                preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE);
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
    public Employee selectID(int id) {
        Employee employee = null;
        Connection connection = createReponssitory.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ID_EMPLOYEE);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String employee_name = resultSet.getString("employee_name");
                String employee_birthday = resultSet.getString("employee_birthday");
                String employee_id_card = resultSet.getString("employee_id_card");
                Double employee_salary = resultSet.getDouble("employee_salary");
                String employee_phone = resultSet.getString("employee_phone");
                String employee_email = resultSet.getString("employee_email");
                String employee_address = resultSet.getString("employee_address");
                int position_id = resultSet.getInt("position_id");
                int education_degree_id = resultSet.getInt("education_degree_id");
                int division_id = resultSet.getInt("division_id");
                employee = new Employee(id,employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employee;
    }

    @Override
    public void update(Employee employee) {
        Connection connection = createReponssitory.getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE);
            preparedStatement.setString(1,employee.getEmployeeName());
            preparedStatement.setString(2 ,employee.getEmployeeBirthday());
            preparedStatement.setString(3,employee.getEmployeeIdCard());
            preparedStatement.setDouble(4,employee.getSalary());
            preparedStatement.setString(5,employee.getPhone());
            preparedStatement.setString(6,employee.getEmail());
            preparedStatement.setString(7,employee.getAddress());
            preparedStatement.setInt(8,employee.getPositioId());
            preparedStatement.setInt(9,employee.getEducationDegreeId());
            preparedStatement.setInt(10,employee.getDivisionId());
            preparedStatement.setInt(11,employee.getEmployeeId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Employee> searchName(String name) {
        List<Employee> employeeList = new ArrayList<>();
        String query = "{Call search_name(?)}";

        CreateReponssitory createReponssitory = new CreateReponssitory();
        Connection connection = createReponssitory.getConnection();

        try {
            CallableStatement callableStatement = connection.prepareCall(query);
            callableStatement.setString(1,"%"+name+"%");
            ResultSet resultSet = callableStatement.executeQuery();
            Employee employee = new Employee();
            while (resultSet.next()){
                employee.setEmployeeId(resultSet.getInt("employee_id"));
                employee.setEmployeeName(resultSet.getString("employee_name"));
                employee.setEmployeeBirthday(resultSet.getString("employee_birthday"));
                employee.setEmployeeIdCard(resultSet.getString("employee_id_card"));
                employee.setSalary(resultSet.getDouble("employee_salary"));
                employee.setPhone(resultSet.getString("employee_phone"));
                employee.setEmail(resultSet.getString("employee_email"));
                employee.setAddress(resultSet.getString("employee_address"));
                employee.setPositioId(resultSet.getInt("position_id"));
                employee.setEducationDegreeId(resultSet.getInt("education_degree_id"));
                employee.setDivisionId(resultSet.getInt("division_id"));
                employeeList.add(employee);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }


}

