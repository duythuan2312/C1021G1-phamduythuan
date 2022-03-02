package ss30000_Dethimodule2.Service;

import ss30000_Dethimodule2.model.ExportProducts;
import ss30000_Dethimodule2.model.ImportedProducts;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ExportProductsServiceImlp implements ServiceProducts {
    public static final String EXPORT_PRODUCTS_CSV = "D:\\codegym1\\module2\\src\\ss30000_Dethimodule2\\data\\exportProducts.csv";
    static List<ExportProducts> exportProductsList = new ArrayList<>();

    public ExportProductsServiceImlp(){
        readFile();
    }

    public static int ranDom() {
        Random random = new Random();
        int productCode = 0;
        productCode = random.nextInt(10);
        return productCode;
    }

    public static String randumMsp() {
        String result = "";
        for (int i = 0; i < 2; i++) {
            result += ranDom() + "";
        }
        return result;
    }

    @Override
    public void addNew() {
        Scanner scanner = new Scanner(System.in);
        String nameProduct = null;
        double prince = 0.0;
        int quantilyti = 0;
        String producer = null;
        double exportPrice = 0;
        String nationProducts = null;
        boolean check;


        System.out.println("Nhập tên sản phẩm xuất khẩu.");
        nameProduct = scanner.nextLine();
       do {
           check = false;
          try {
              System.out.println("Nhập vào giá bán");
              prince = Double.parseDouble(scanner.nextLine());
          }catch (NumberFormatException e){
              System.out.println("Hãy nhập số");
              check = true;
              continue;
          }if (prince < 0){
               System.out.println("Hãy nhập số dương");
               check = true;
               continue;
           }
       }while (check);
        do {
            check = false;
            try {
                check = false;
                System.out.println("Nhập số lượng");
                quantilyti = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Hãy nhập số");
                check = true;
                continue;
            }if (quantilyti < 0){
                System.out.println("Số lượng phải lớn hơn 0");
                check = true;
                continue;
            }

        }while (check);

        System.out.println("Nhập nhà sản xuất");
        producer = scanner.nextLine();

        do {
            check = false;
            try {
                check = false;
                System.out.println("Nhập giá xuất khẩu");
                exportPrice = Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Hãy nhập số");
                check = true;
                continue;
            }if (exportPrice < 0){
                System.out.println("Phải nhập số lớn hơn 0 nha !!!");
                check = true;
                continue;
            }
        }while (check);

        System.out.println("Nhập quốc gia nhập sản phẩm");
        nationProducts = scanner.nextLine();
        ExportProducts exportProducts = new ExportProducts("SP000"+randumMsp(),nameProduct,prince,quantilyti,producer,exportPrice,nationProducts);
        exportProductsList.add(exportProducts);
        writeFile();

    }

    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm mà bạn muốn xóa.");
        String productCode = scanner.nextLine();
        for (int i=0 ; i< exportProductsList.size() ; i++){
            if (exportProductsList.get(i).getProductCode().equals(productCode)){
                System.out.println("Yes or No");
                String check = scanner.nextLine();
                if (check.equals("yes")){
                    exportProductsList.remove(i);
                    writeFile();
                    System.out.println("Xóa thành công");
                }
            }
        }

    }
    @Override
    public void displays() {
        for (ExportProducts exportProducts : exportProductsList){
            System.out.println(exportProducts);
        }

    }

    @Override
    public void seach() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm bạn muốn tìm.");
        String nameProduct = scanner.nextLine();
        for (int i=0 ; i<exportProductsList.size() ; i++){
            if (exportProductsList.get(i).getNameProduct().contains(nameProduct)){
                System.out.println(exportProductsList.get(i));
            }
        }

    }
    public static void writeFile(){
        try {
            FileWriter fileWriter = new FileWriter(EXPORT_PRODUCTS_CSV,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (ExportProducts exportProducts : exportProductsList){
                bufferedWriter.write(exportProducts.getId()+","+exportProducts.getProductCode()
                                       +","+exportProducts.getNameProduct()
                                      +","+exportProducts.getPrice()
                                      +","+exportProducts.getQuantily()+","+exportProducts.getProducer( )
                                      +","+exportProducts.getExportPrice()+","+exportProducts.getNationProducts());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile(){
        exportProductsList.clear();
        try {
            FileReader fileReader = new FileReader(EXPORT_PRODUCTS_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine())!=null){
                String[] newData = data.split(",");
                ExportProducts exportProducts = new ExportProducts(newData[1],newData[2],
                        Double.parseDouble(newData[3]),Integer.parseInt(newData[4]),
                        newData[5],Double.parseDouble(newData[6]),
                        newData[7]);
//                exportProducts.setId(0);
                exportProductsList.add(exportProducts);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
