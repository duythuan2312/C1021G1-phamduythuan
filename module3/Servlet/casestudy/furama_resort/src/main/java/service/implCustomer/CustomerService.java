package service.implCustomer;

import model.customer.Customer;
import model.employee.Employee;

import java.util.List;

public interface CustomerService {
    List<Customer>  findAll();
    void create(Customer customer);
    void  removeCustomer(int id);
    Customer findByID(int id);
    void updateCustomer(Customer customer);
    List<Customer> searchName(String name);
}
