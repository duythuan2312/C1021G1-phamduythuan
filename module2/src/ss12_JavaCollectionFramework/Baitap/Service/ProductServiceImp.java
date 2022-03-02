package ss12_JavaCollectionFramework.Baitap.Service;


import ss12_JavaCollectionFramework.Baitap.Model.ProductModel;

import java.sql.Connection;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class  ProductServiceImp implements ProductService{
  public static List<ProductModel> product = new ArrayList<ProductModel>();



    @Override
    public void add() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Input id");
      int id = Integer.parseInt(scanner.nextLine());
      System.out.println("Input product Name");
      String name = scanner.nextLine();
      System.out.println("Input price.");
      double price = scanner.nextDouble();
      ProductModel productModel1 = new ProductModel(id,name,price);
      product.add(productModel1);
    }

    @Override
    public void delete() {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Input id muốn xóa");
      int id = Integer.parseInt(scanner.nextLine());
      for (int i=0; i < product.size() ; i++){
        if (product.get(i).getId() == id){
          product.remove(i);

        }
      }

    }

  @Override
  public void all() {
    for (ProductModel productModel1 : product){
      System.out.println(productModel1);
    }
  }


  @Override
    public void Seach() {
      Scanner scanner = new Scanner(System.in);
    System.out.println("Tìm kiếm name :");
    String name = scanner.nextLine();
    for (int i=0 ; i < product.size() ;i++){
         if (product.get(i).getProductName().equals(name)){
           System.out.println(product.get(i));
         }else {
           System.out.println("Không có sản phẩm này..");
         }
    }

    }

  @Override
  public void upDate() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input id muốn update");
    int id = Integer.parseInt(scanner.nextLine());
    for (int i=0 ; i <product.size() ; i++){
      if (product.get(i).getId()==id){
        System.out.println("Update lại.");
        String name = scanner.nextLine();
        product.get(i).setProductName(name);
      }
    }
  }

  @Override
  public void ascenDing() {
    PriceComparator priceComparator = new PriceComparator();
    Collections.sort(product,priceComparator);
    System.out.println("Sắp xếp tăng dần.");
    for (ProductModel productModel : product){
      System.out.println(productModel.toString());
    }
  }

  @Override
  public void descenDing() {
    PricenComparator pricenComparator = new PricenComparator();
    Collections.sort(product,pricenComparator);
    System.out.println("Sắp xếp giảm dần.");
    for (ProductModel productModel : product){
      System.out.println(productModel.toString());
    }
  }

}
