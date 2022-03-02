package ss12_JavaCollectionFramework.Baitap.Service;

import ss12_JavaCollectionFramework.Baitap.Model.ProductModel;

import java.util.Comparator;

public class PriceComparator implements Comparator<ProductModel> {

    @Override
    public int compare(ProductModel prince1, ProductModel prince2) {
        if (prince1.getPrice() > prince2.getPrice()){
            return 1;
        }else if (prince1.getPrice() == prince2.getPrice()){
            return 0;
        }else {
            return -1;
        }
    }


}
