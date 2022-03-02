package service.implCustomer;

import model.customer.CustomerType;
import reponssitory.ipml.CustomerTypeRepon;
import service.implCustomer.CustomerTypeService;

import java.util.List;

public class CustomerTypeServiceIpml implements CustomerTypeService {
    private CustomerTypeRepon customerTypeRepon = new CustomerTypeRepon();
    @Override
    public List<CustomerType> findAll() {
        List<CustomerType> customerList = this.customerTypeRepon.selectAll();
        return customerList;
    }
}
