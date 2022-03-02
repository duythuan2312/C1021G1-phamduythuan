package reponssitory.implEmployee;

import model.employee.Employee;

import java.util.List;

public interface ServiceEmployee {
    List<Employee> selectAll();
    void createEmployee(Employee employee);
    void remove(int id);
    Employee selectID(int id);
    void update(Employee employee);
    List<Employee> searchName(String name);
}
