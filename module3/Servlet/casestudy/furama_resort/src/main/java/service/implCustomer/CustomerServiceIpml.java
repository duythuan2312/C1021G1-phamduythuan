package service.implCustomer;

import model.customer.Customer;
import reponssitory.ipml.CusromerReponssitory;
import service.implCustomer.CustomerService;

import java.util.List;

public class CustomerServiceIpml implements CustomerService {
    private CusromerReponssitory  cusromerReponssitory = new CusromerReponssitory();
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = this.cusromerReponssitory.selectAll();
        return customerList;
    }

    @Override
    public void create(Customer customer) {
        cusromerReponssitory.create(customer);

    }

    @Override
    public void removeCustomer(int id) {
        cusromerReponssitory.remove(id);
    }

    @Override
    public Customer findByID(int id) {
        Customer customer = this.cusromerReponssitory.selectID(id);
        return customer;
    }

    @Override
    public void updateCustomer(Customer customer) {
        cusromerReponssitory.update(customer);
    }

    @Override
    public List<Customer> searchName(String name) {
        List<Customer> search = cusromerReponssitory.searchName(name);
        return search;
    }
}
