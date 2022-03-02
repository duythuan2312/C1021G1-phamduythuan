package ss101_ThiThu.service;

import ss101_ThiThu.model.GenuinePhone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenuinePhoneSerImpl implements PhoneService{
    public static final String MOBILES_CSV = "D:\\codegym1\\module2\\src\\ss101_Dethi\\data\\genuine.csv";
    public static List<GenuinePhone> genuinePhoneList = new ArrayList<>();
    static {
        GenuinePhone genuinePhone = new GenuinePhone("SamSungA20",120000,
                2,"SamSung","3 năm","Toàn quốc");

        GenuinePhone genuinePhone1 = new GenuinePhone("Oppo",130000,
                10,"Oppo","2 năm","Trong nước");
        GenuinePhone genuinePhone2 = new GenuinePhone("Iphone",1000,
                3,"Apple","1 năm","Trong nước");

        genuinePhoneList.add(genuinePhone);
        genuinePhoneList.add(genuinePhone1);
        genuinePhoneList.add(genuinePhone2);

    }
    public void GenuinePhoneSerImpl(){
        genuinePhoneList = readFile();
    }

    public static List<GenuinePhone> displayAll(){

        return genuinePhoneList;
    }

    @Override
    public void addNew() {
        boolean check;
        Scanner scanner = new Scanner(System.in);
        double prince = 0;
        int quantilyti = 0;
        String warrantyOerriod;
        String warrantyCoverage = null;
        System.out.println("Input a phoneName");
        String phoneName = scanner.nextLine();

      do {
          check = false;
          try {
              check = false;
              System.out.println("Input a price");
              prince = Double.parseDouble(scanner.nextLine());
          }catch (NumberFormatException e){
              System.out.println("Hãy nhập số...");

          }if (prince < 0){
              check = true;
              continue;
          }
      }while (check);

       do {
           check = false;
           try {
               check = false;
               System.out.println("Input a quantilyti");
                quantilyti = Integer.parseInt(scanner.nextLine());
           }catch (NumberFormatException e){
               System.out.println("Hãy nhập số..");

           }if(quantilyti < 0){
               check = true;
               continue;
           }
       }while (check);

        System.out.println("Input a product");
        String product = scanner.nextLine();


       do {
           check = true;
           System.out.println("Input a WarrantyOerriod");
            warrantyOerriod = scanner.nextLine();
            if (warrantyOerriod.equals("1 năm")|| warrantyOerriod.equals("2 năm")){
                break;
            }
       }while (check);


        do {
            check = true;
             System.out.println("Input a warrantyCoverage");
              warrantyCoverage = scanner.nextLine();
              if (warrantyCoverage.equals("Toàn Quốc")||warrantyCoverage.equals("Trong Nước")){
                  break;
              }

     }while (check);

        GenuinePhone genuinePhone = new GenuinePhone(phoneName,prince,quantilyti,product,warrantyOerriod,warrantyCoverage);
        genuinePhoneList.add(genuinePhone);
        writeFile();
    }

    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input id a delete.");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i=0; i<genuinePhoneList.size() ; i++){
            if (genuinePhoneList.get(i).getId() == id){
                System.out.println("Yes or No");
                String yes = scanner.nextLine();
                if (yes.equals("yes")){
                    genuinePhoneList.remove(i);
                    System.out.println("Bạn đã xóa thành công");
                    writeFile();
                }else{
                    System.out.println("Xóa ko thành công.......");
                }

            }
        }

    }

    @Override
    public void displayPhone() {
        for(GenuinePhone genuinePhone : genuinePhoneList){
            System.out.println(genuinePhone);
        }

    }

    @Override
    public void seach() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input phone name a Seach.");
        try {
            String phoneName = scanner.nextLine();
            for (int i = 0; i < genuinePhoneList.size(); i++) {
                if (genuinePhoneList.get(i).getPhoneName().contains(phoneName)) {
                    System.out.println(genuinePhoneList.get(i));
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Hãy nhập cho đúng..");
        }
    }
    public static void writeFile(){
        try {
            FileWriter fileWriter = new FileWriter(MOBILES_CSV);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (GenuinePhone genuinePhone : genuinePhoneList){
                bufferedWriter.write(genuinePhone.getId()+","+genuinePhone.getPhoneName()+","+genuinePhone.getPrice()+
                        ","+genuinePhone.getProducer()+","+genuinePhone.getWarrantyPeriod()+","+genuinePhone.getWarrantyCoverage());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  static List<GenuinePhone> readFile(){
        List<GenuinePhone> genuinePhoneList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(MOBILES_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data=bufferedReader.readLine())!=null){
                String[] dataA = data.split(",");
                GenuinePhone genuinePhone = new GenuinePhone(dataA[0],Double.parseDouble(dataA[1]),
                                 Integer.parseInt(dataA[2]),dataA[3],dataA[4],dataA[5]);
                genuinePhoneList.add(genuinePhone);

            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return genuinePhoneList;
    }
}
