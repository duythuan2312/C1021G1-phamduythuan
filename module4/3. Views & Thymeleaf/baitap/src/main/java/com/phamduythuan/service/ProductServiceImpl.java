package com.phamduythuan.service;

import com.phamduythuan.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ProductServiceImpl implements ProductService{
    private static final Map<Integer, Product> productMap = new HashMap<>();
    static {
        productMap.put(1,new Product(1,"Iphone12",150000,"iphoneCustom","Apple"));
        productMap.put(2,new Product(2,"SamSungA20",100000,"Samsung","Samsung"));
        productMap.put(3,new Product(3,"Iphone13",200000,"iphoneCustom","Apple"));
        productMap.put(4,new Product(4,"Iphone14",250000,"iphoneCustom","Apple"));
        productMap.put(5,new Product(5,"Iphone15",3000000,"iphoneCustom","Apple"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void create(Product product) {
        productMap.put(product.getId(),product);

    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
           productMap.put(id,product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);

    }

    @Override
    public List<Product> search(String name) {
        List<Product> productList = new ArrayList<>();
        for (Product product1 : productMap.values()){
            if (product1.getNameProduct().equals("name")){
                productList.add(product1);
            }
        }
        return productList;
    }


}
