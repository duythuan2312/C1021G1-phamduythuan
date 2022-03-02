package service.implEmployee;

import model.employee.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> finAll();
    void createEmployee(Employee employee);
    void remove(int iXd);
    void updateEmployee(Employee employee);
    Employee selectId(int id);
    List<Employee> searchName(String name);
}
