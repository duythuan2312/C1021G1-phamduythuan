package ss17_BinaryFileSerialization.baitap.Servise;

import ss17_BinaryFileSerialization.baitap.module.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ProductserviseImp implements ProductServise{

    public static final String FILE_PRODUCT = "D:\\codegym1\\module2\\src\\ss17_BinaryFileSerialization\\baitap\\Controller\\Product.txt";
    public static List<Product> productlist = new ArrayList<>();

    public  void writerProduct(List<Product> products) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(FILE_PRODUCT);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(productlist);
        objectOutputStream.close();

    }
    public void readProduct() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(FILE_PRODUCT);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        productlist = (List<Product>) objectInputStream.readObject();
        objectInputStream.close();
        for (Product product : productlist){
            System.out.println(product);
        }

    }
    @Override
    public void Seach() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input productname Seach...");
        String productname = scanner.nextLine();
        for (int i = 0 ; i<productlist.size() ;i++){
            if (productlist.get(i).getProdoctName().equals(productname)){
                System.out.println(productlist.get(i));
            }
        }


    }
    public  static  int random(){
        Random random = new Random();
        int id = 0;
        id = random.nextInt(10);
        return id;
    }
    public static String randumId(){
        String result = "";
        for (int i =0 ; i < 5 ;i++){
          result += random() + "";
        }
        return result;
    }
    @Override
    public void add() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a productname");
        String str = scanner.nextLine();
        System.out.println("Input a productionKhan");
        String string = scanner.nextLine();
        System.out.println("Input a Price");
        double prince = Double.parseDouble(scanner.nextLine());
        System.out.println("Input a description");
        String description = scanner.nextLine();
        Product product = new Product(randumId(),str,string,prince,description);
        productlist.add(product);
        writerProduct(productlist);
    }

    @Override
    public void all() {
        for (Product product : productlist){
            System.out.println(product);
        }

    }
}
