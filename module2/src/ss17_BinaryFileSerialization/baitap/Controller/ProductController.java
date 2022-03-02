package ss17_BinaryFileSerialization.baitap.Controller;

import ss17_BinaryFileSerialization.baitap.Servise.ProductServise;
import ss17_BinaryFileSerialization.baitap.Servise.ProductserviseImp;
import ss17_BinaryFileSerialization.baitap.module.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        ProductserviseImp productServiseImp = new ProductserviseImp();
        List<Product> products = new ArrayList<>();
        productServiseImp.writerProduct(products);
        int chose;

        do {
            System.out.println("1.All....");
            System.out.println("2.Add....");
            System.out.println("3.Search...");
            System.out.println("4.Readfile...");
            System.out.println("5.Exit");
            chose = Integer.parseInt(scanner.nextLine());
            switch (chose){
                case 1:
                    productServiseImp.all();
                    break;
                case 2:
                    productServiseImp.add();
                    break;
                case 3:
                    productServiseImp.Seach();
                    break;
                case 4:
                   productServiseImp.readProduct();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Error.....");

            }

        }while (chose!=5);
        System.out.println("End to be Contninue.....");





    }
}
