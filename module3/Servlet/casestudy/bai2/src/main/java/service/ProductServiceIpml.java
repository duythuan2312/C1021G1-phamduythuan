package service;

import model.Product;
import reponssitory.ReponsitoriImpl;

import java.util.List;

public class ProductServiceIpml implements ProductService{
    ReponsitoriImpl reponsitori = new ReponsitoriImpl();
    @Override
    public List<Product> listALL() {
       List<Product> listProduct = this.reponsitori.listProduct();
        return listProduct;
    }
}
