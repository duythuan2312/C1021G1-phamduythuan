package ss30000_Dethimodule2.Service;

import ss30000_Dethimodule2.model.ImportedProducts;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ImportedProductsServiceIpml implements ServiceProducts{
    public static final String IMPORTED_PRODUCTS_CSV = "D:\\codegym1\\module2\\src\\ss30000_Dethimodule2\\data\\ImportedProducts.csv";

    static List<ImportedProducts> importedProductsList = new ArrayList<>();


    public ImportedProductsServiceIpml(){
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
        for (int i = 0; i < 1; i++) {
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
        double importPrices = 0;
        String producer = null;
        String importProvince = null;
        double importTax = 0;
        boolean check;

        System.out.println("Nhập tên sản phẩm nhập khẩu.");
        nameProduct = scanner.nextLine();
       do {
           check = false;
           try {
               check = false;
               System.out.println("Nhập vào giá bán");
               prince = Double.parseDouble(scanner.nextLine());
           }catch (NumberFormatException e){
               System.out.println("Hãy nhập số");
               check = true;
               continue;
           }if (prince < 0){
               System.out.println("Giá tiền phải lớn hơn 0");
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
                System.out.println("Nhập giá nhập khẩu");
                importPrices = Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Hãy nhập số");
                check = true;
                continue;
            }if (importPrices < 0){
                System.out.println("Không được nhập số âm hãy nhập lại");
                check = true;
                continue;
            }
        }while (check);
        System.out.println("Nhập tỉnh thành nhập");
        importProvince = scanner.nextLine();

        do {
            check = false;
            try {
                check = false;
                System.out.println("Nhập thuế nhập khẩu");
                importTax = Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Hãy nhập số");
                check = true;
                continue;
            }if (importTax < 0){
                System.out.println("Hãy nhập số dương");
                check = true;
                continue;
            }
        }while (check);

        ImportedProducts importedProducts = new ImportedProducts("SP0000"+randumMsp(),nameProduct,prince,quantilyti,producer,importPrices,importProvince,importTax);
        importedProductsList.add(importedProducts);
        writeFile();

    }

    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm mà bạn muốn xóa.");
        String productCode = scanner.nextLine();
        for (int i=0 ; i< importedProductsList.size() ; i++){
            if (importedProductsList.get(i).getProductCode().equals(productCode)){
                System.out.println("Yes or No");
                String check = scanner.nextLine();
                if (check.equals("yes")){
                    importedProductsList.remove(i);
                    writeFile();
                    System.out.println("Xóa thành công");
                }
            }
        }

    }

    @Override
    public void displays() {
        for (ImportedProducts importedProducts : importedProductsList){
            System.out.println(importedProducts);
        }

    }

    @Override
    public void seach() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm bạn muốn tìm.");
        String nameProduct = scanner.nextLine();
        for (int i=0 ; i<importedProductsList.size() ; i++){
            if (importedProductsList.get(i).getNameProduct().contains(nameProduct)){
                System.out.println(importedProductsList.get(i));
            }
        }

    }
    public static void writeFile(){
        try {
            FileWriter fileWriter = new FileWriter(IMPORTED_PRODUCTS_CSV,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (ImportedProducts importedProducts : importedProductsList){
                bufferedWriter.write(importedProducts.getId()+","+importedProducts.getProductCode()
                                      +","+importedProducts.getNameProduct()+","+importedProducts.getPrice()
                                      +","+importedProducts.getQuantily()+","+importedProducts.getProducer()
                                      +","+importedProducts.getImportPrices()+","+importedProducts.getImportProvince()
                                       +","+importedProducts.getImportTax());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void readFile(){
        importedProductsList.clear();
        try {
            FileReader fileReader = new FileReader(IMPORTED_PRODUCTS_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine())!=null){
                String[] newData = data.split(",");
                ImportedProducts importedProducts = new ImportedProducts(newData[1],newData[2],
                                                                         Double.parseDouble(newData[3]),Integer.parseInt(newData[4]),
                                                                         newData[5],Double.parseDouble(newData[6]),
                                                                         newData[7],Double.parseDouble(newData[8]));
//                importedProducts.setId(0);
                importedProductsList.add(importedProducts);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
