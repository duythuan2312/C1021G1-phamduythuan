package ss30000_Dethimodule2.Controllor;

import ss30000_Dethimodule2.Service.ExportProductsServiceImlp;
import ss30000_Dethimodule2.Service.ImportedProductsServiceIpml;


import java.util.Scanner;

public class ProductControllor {
    public static void main(String[] args) {
          displayMenu();
    }
    public static void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        int chosse = 0;
        do {
            System.out.println("-----QUẢN LÍ SẢN PHẨM-----");
            System.out.println("1.ExportProducts...");
            System.out.println("2.ImportedProducts...");
            System.out.println("3.Exit.....");
            try {
                chosse = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Hãy nhập số");
            }
            switch (chosse){
                case 1:
                    exportProducts();
                    break;
                case 2:
                    importedProducts();
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình xin cảm ơn và hãy cho tôi 1 đánh giá 5 sao nhé!!");
                    System.exit(0);
                    break;
            }
        }while (true);
    }
    public  static void importedProducts(){
        Scanner scanner = new Scanner(System.in);
        ImportedProductsServiceIpml importedProductsServiceIpml = new ImportedProductsServiceIpml();
        int chosse = 0;
        do {
            System.out.println("1.Thêm mới sản phẩm nhập khẩu.");
            System.out.println("2.Xóa sản phẩm nhập khẩu.");
            System.out.println("3.Xem danh sách sản phẩm nhập khẩu.");
            System.out.println("4.Tìm kiếm sản phẩm nhập khẩu.");
            System.out.println("5.Quay lại menu chính.");
            try {
                chosse = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Hãy nhập số");
            }
            switch (chosse){
                case 1:
                    importedProductsServiceIpml.addNew();
                    break;
                case 2:
                    importedProductsServiceIpml.remove();
                    break;
                case 3:
                    importedProductsServiceIpml.displays();
                    break;
                case 4:
                    importedProductsServiceIpml.seach();
                    break;
                case 5:
                    displayMenu();
                    break;

            }
        }while (true);
    }
    public  static void exportProducts(){
        Scanner scanner = new Scanner(System.in);
        ExportProductsServiceImlp exportProductsServiceImlp = new ExportProductsServiceImlp();
        int chosse = 0;
        do {
            System.out.println("1.Thêm mới sản phẩm xuất khẩu.");
            System.out.println("2.Xóa sản phẩm xuất khẩu.");
            System.out.println("3.Xem danh sách sản phẩm xuất khẩu..");
            System.out.println("4.Tìm kiếm sản phẩm xuất khẩu..");
            System.out.println("5.Quay lại menu chính.");
            try {
                chosse = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Hãy nhập số");
            }
            switch (chosse){
                case 1:
                    exportProductsServiceImlp.addNew();
                    break;
                case 2:
                    exportProductsServiceImlp.remove();
                    break;
                case 3:
                    exportProductsServiceImlp.displays();
                    break;
                case 4:
                    exportProductsServiceImlp.seach();
                    break;
                case 5:
                    displayMenu();
                    break;

            }
        }while (true);
    }
}
