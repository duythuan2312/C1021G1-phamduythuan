package service.implEmployee;

import model.employee.Employee;
import reponssitory.implEmployee.EmployeeReponssitory;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeReponssitory employeeReponssitory = new EmployeeReponssitory();
    @Override
    public List<Employee> finAll() {
        return employeeReponssitory.selectAll();
    }

    @Override
    public void createEmployee(Employee employee) {
        employeeReponssitory.createEmployee(employee);
    }

    @Override
    public void remove(int id) {
        employeeReponssitory.remove(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeReponssitory.update(employee);
    }

    @Override
    public Employee selectId(int id) {
        Employee employee1 = this.employeeReponssitory.selectID(id);
        return employee1;
    }

    @Override
    public List<Employee> searchName(String name) {
        List<Employee> search = employeeReponssitory.searchName(name);
        return search;
    }
}
