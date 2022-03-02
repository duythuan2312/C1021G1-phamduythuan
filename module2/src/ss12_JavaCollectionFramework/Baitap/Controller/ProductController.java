package ss12_JavaCollectionFramework.Baitap.Controller;

import ss12_JavaCollectionFramework.Baitap.Model.ProductModel;
import ss12_JavaCollectionFramework.Baitap.Service.ProductServiceImp;
import ss12_JavaCollectionFramework.Baitap.Service.ProductService;

import java.util.Scanner;

public class ProductController  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductService productService = new ProductServiceImp();
        int chose;
        do {
            System.out.println("1.All...");
            System.out.println("2.Add...");
            System.out.println("3.Remove..");
            System.out.println("4.Seach....");
            System.out.println("5.Update...");
            System.out.println("6.Ascending....");
            System.out.println("7.Descending...");
            System.out.println("8.Exit");
            chose = Integer.parseInt(scanner.nextLine());
            switch (chose){
                case 1:
                    productService.all();
                    break;
                case 2:
                    productService.add();
                    break;
                case 3:
                    productService.delete();
                    break;
                case 4:
                    productService.Seach();
                    break;
                case 5:
                    productService.upDate();
                    break;
                case 6:
                    productService.ascenDing();
                    break;
                case 7:
                    productService.descenDing();
                case 8:
                    break;
                default:
                    System.out.println("Error....");
            }
        }while (chose != 8);





    }
}
