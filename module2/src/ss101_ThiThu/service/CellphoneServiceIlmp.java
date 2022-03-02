package ss101_ThiThu.service;

import ss101_ThiThu.model.Cellphone;
import ss101_ThiThu.model.Phone;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CellphoneServiceIlmp implements PhoneService{
    public static final String CELLPHONE_CSV = "D:\\codegym1\\module2\\src\\ss101_Dethi\\data\\cellphone.csv";
    Scanner scanner = new Scanner(System.in);
    public static List<Cellphone> cellphoneList = new ArrayList<>();

   public static void CellphoneServiceIlmp(){
       cellphoneList = readFile();
   }



    @Override
    public void addNew() {
        boolean check;
       String regexPortableCountry = "[A-Z]{3}";
        System.out.println("Input a phoneName");
        String phoneName = scanner.nextLine();
        double prince = 0;
      do {
          check = false;
          try {
              check = false;
              System.out.println("Input a price");
              prince = Double.parseDouble(scanner.nextLine());
          }catch (NumberFormatException e){
              System.out.println("Hãy nhập số");
          }if (prince < 0){
              check = true;
              continue;
          }
      }while (check);

        int quantilyti = 0;
        do {
            check = false;
            try {
                check = false;
                System.out.println("Input a quantilyti");
                 quantilyti = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Hãy nhập số");
            }if (quantilyti < 0){
                check = true;
                continue;
            }
        }while (check);

        System.out.println("Input a producre");
        String producer = scanner.nextLine();

        String portableCountry = null;
       do {
           check = false;
           System.out.println("Input a portableCountry");
            portableCountry = scanner.nextLine();
            if (!portableCountry.matches(regexPortableCountry)){
                check = true;
                System.out.println("Nhập sai định dạng ....");
            }

       }while (check);


        String status;
        do {
            check = true;
            System.out.println("Input  a status.");
            status = scanner.nextLine();
            if (status.equals("Đã sữa chữa")|| status.equals("Chưa sữa chữa")){
                break;
            }
        }while (check);

        Cellphone cellphone = new Cellphone(phoneName,prince,quantilyti,producer,portableCountry,status);
        cellphoneList.add(cellphone);
        writeFile();

    }

    @Override
    public void remove() {
        System.out.println("Input id a delete");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i=0 ; i<cellphoneList.size();i++){
            if (cellphoneList.get(i).getId()==id){
                System.out.println("Yes or No");
                String yes = scanner.nextLine();
                if (yes.equals("yes")){
                    cellphoneList.remove(i);
                    System.out.println("Bạn đã xóa thành công.");
                    writeFile();
                }else {
                    System.out.println("Không xóa đc...");

                }

            }
        }

    }

    @Override
    public void displayPhone() {
       List<Phone> phoneList = new ArrayList<>(cellphoneList);
       phoneList.addAll(GenuinePhoneSerImpl.displayAll());
        Collections.sort(phoneList);
       for (Phone phone : phoneList){
           System.out.println(phone);
       }
//        for(Cellphone cellphone : cellphoneList){
//            System.out.println(cellphone);
//        }
//        List<GenuinePhone> genuinePhoneList = GenuinePhoneSerImpl.displayAll();
//        for (GenuinePhone genuinePhone : genuinePhoneList){
//            System.out.println(genuinePhone);
//        }

    }

    @Override
    public void seach() {
        System.out.println("Input id a seach");
        int id = Integer.parseInt(scanner.nextLine());
        for(int i=0; i<cellphoneList.size();i++){
            if (cellphoneList.get(i).getId() == id){
                System.out.println(cellphoneList.get(i));
            }
        }


    }
    public static void writeFile(){
        try {
            FileWriter fileWriter = new FileWriter(CELLPHONE_CSV);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Cellphone cellphone : cellphoneList){
                bufferedWriter.write(cellphone.getId()+","+cellphone.getPhoneName()+","+cellphone.getPrice()+","+
                                cellphone.getQuantily()+","+cellphone.getProducer()+","+
                                 cellphone.getPortableCountry()+","+cellphone.getStatus());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static List<Cellphone> readFile(){
        List<Cellphone> cellphoneList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(CELLPHONE_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine())!=null){
                String[] dataA = data.split(",");
                Cellphone cellphone = new Cellphone(dataA[0],Double.parseDouble(dataA[1]),
                        Integer.parseInt(dataA[2]),dataA[3],dataA[4],dataA[5]);
                cellphoneList.add(cellphone);

            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cellphoneList;

    }
}
