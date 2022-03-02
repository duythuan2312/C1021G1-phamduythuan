package ss12_JavaCollectionFramework.Baitap.Service;

import ss12_JavaCollectionFramework.Baitap.Model.ProductModel;

import java.util.Comparator;

public class PricenComparator implements Comparator<ProductModel> {
    @Override
    public int compare(ProductModel product1, ProductModel product2) {
        if (product1.getPrice() > product2.getPrice()){
            return -1;
        }else if (product1.getPrice() == product2.getPrice()){
            return 0;
        }else {
            return 1;
        }

    }
}
