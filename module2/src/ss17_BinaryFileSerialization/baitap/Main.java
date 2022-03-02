package ss17_BinaryFileSerialization.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String File_Text = "D:\\codegym1\\module2\\src\\ss17_BinaryFileSerialization\\baitap\\test.txt";

    public static void  writerFroduct(String path , List<ProductManagement> product) throws IOException {
        FileOutputStream fio = new FileOutputStream(path);
        ObjectOutputStream obo = new ObjectOutputStream(fio);
        obo.writeObject(product);
        obo.close();
    }


    public static List<ProductManagement> readFroduct(String path) throws IOException, ClassNotFoundException {
        List<ProductManagement> list = new ArrayList<>();
        FileInputStream fip = new FileInputStream(path);
        ObjectInputStream obj = new ObjectInputStream(fip);
        list = (List<ProductManagement>) obj.readObject();
        obj.close();
        return list;
    }


    public static void main(String[] args) throws IOException {
        List<ProductManagement> product = new ArrayList<>();
        product.add(new ProductManagement(1,"Bánh mì","CodeGym",15.000,"Bánh mì thịt"));
        product.add(new ProductManagement(2,"Vịt quay","CodeGym",20.000,"Vịt quay bắc kinh"));
        writerFroduct(File_Text,product);
        for (ProductManagement productManagement : product){
            System.out.println(productManagement);
        }

    }
}
