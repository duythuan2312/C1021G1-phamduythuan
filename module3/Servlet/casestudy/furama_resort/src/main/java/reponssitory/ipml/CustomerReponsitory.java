package reponssitory.ipml;

import model.customer.Customer;

import java.util.List;

public interface CustomerReponsitory {
    List<Customer> selectAll();
    Customer selectID(int id);
    void create(Customer customer);
    void remove(int id);
    void update(Customer customer);
    List<Customer> searchName(String name);
}
