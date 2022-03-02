package dethi1.service;

import dethi1.model.SavingAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SavingAccountServiceIpml implements Service {
    public static final String SAVVING_CSV = "D:\\codegym1\\module2\\src\\dethi1\\data\\savving.csv";
    static List<SavingAccount> savingAccountList = new ArrayList<>();
 static Scanner scanner = new Scanner(System.in);
    public static int ranDom() {
        Random random = new Random();
        int MTK = 0;
        MTK = random.nextInt(10);
        return MTK;
    }

    public static String randumMTK() {
        String result = "";
        for (int i = 0; i < 7; i++) {
            result += ranDom() + "";
        }
        return result;
    }
    public SavingAccountServiceIpml(){
        readFile();
    }
    @Override
    public void addNew() {
        String name ;
        String ngaytao = null;
        double sotienguiTk = 0.0;
        String ngaygui = null;
        String laixuat = null;
        int kihan = 0;
        boolean check;
        String regexDayOfBirth = "(((0[1-9]|[12][0-9]|30)[-\\/](0[13-9]|1[012])|31[-\\/](0[13578]|1[02])|(0[1-9]|1[0-9]|2[0-8])[-\\/]02)" +
                "[-\\/](19[0-9]{2}|200[012])|29[-\\/]02[-\\/]" +
                "([0-9]{2}(([2468][048]|[02468][48])|[13579][26])|([13579][26]|[02468][048]|0[0-9]|1[0-6])00))$";

        System.out.println("Nhập tên chủ tài khoản");
        name = scanner.nextLine();
        do {
            check = false;
            System.out.println("Nhập ngày tạo tài khoản");
            ngaytao = scanner.nextLine();
            if (ngaytao.matches(regexDayOfBirth)){
                break;
            }
        }while (check);

     do {
         check = false;
         try {
             System.out.println("Nhập số tiền gửi tiết kiệm");
             sotienguiTk = Double.parseDouble(scanner.nextLine());
         }catch (NumberFormatException e){
             System.out.println("Hãy nhập số");
             check = true;
             continue;
         }if (sotienguiTk < 0 ){
             System.out.println("Số tiefn gửi phải lớn hơn 0");
             check = true;
             continue;
         }
     }while (check);
        System.out.println("Nhập ngày gửi tiết kiệm");
        ngaygui = scanner.nextLine();
        System.out.println("Nhập lãi xuất");
        laixuat = scanner.nextLine();
       do {
           check = false;
           try {
               System.out.println("Nhập kì hạn ");
               kihan = Integer.parseInt(scanner.nextLine());
           }catch (NumberFormatException e){
               System.out.println("hãy nhập số");
               check = true;
               continue;
           }if (kihan < 0){
               System.out.println("Kì hạn phải lớn hơn 0");
               check = true;
               continue;
           }
       }while (check);
        SavingAccount savingAccount = new SavingAccount("00"+randumMTK(),name,ngaytao,sotienguiTk,ngaygui,laixuat,kihan);

        savingAccountList.add(savingAccount);
        writerFile();


    }


    @Override
    public void displays() {
        for (SavingAccount savingAccount : savingAccountList){
            System.out.println(savingAccount);
        }

    }

    @Override
    public void remove() {
        System.out.println("Nhập id cần muốn xóa");
        int id  = Integer.parseInt(scanner.nextLine());
        for (int i = 0 ; i<savingAccountList.size() ; i++){
            if (savingAccountList.get(i).getId() == id){
                System.out.println("Yes or No");
                String ok  = scanner.nextLine();
                if (ok.equals("yes")){
                    savingAccountList.remove(i);
                    writerFile();
                    System.out.println("Đã xóa thành công");
                }else {
                    System.out.println("Xóa ko thành công.");
                }
            }
        }

    }

    @Override
    public void seach() {
        System.out.println("Nhập tên mà bạn muốn tìm kiếm");
        String name = scanner.nextLine();
        for (int i=0 ; i< savingAccountList.size() ; i++){
            if (savingAccountList.get(i).getName().contains(name)){
                System.out.println(savingAccountList.get(i));
            }
        }

    }
    public  static void writerFile(){
        try {
            FileWriter fileWriter = new FileWriter(SAVVING_CSV);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (SavingAccount savingAccount : savingAccountList){
                bufferedWriter.write(savingAccount.getId()+","+savingAccount.getMTK()
                                     +","+savingAccount.getName()+","+savingAccount.getNgaytao()
                                     +","+savingAccount.getSotiengui()+","+savingAccount.getNgaygui()
                                     +","+savingAccount.getLaixuat()+","+savingAccount.getKihan());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile(){
        savingAccountList.clear();
        try {
            FileReader fileReader = new FileReader(SAVVING_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine())!=null){
                String[] newdata = data.split(",");
                SavingAccount savingAccount = new SavingAccount(newdata[0],newdata[1],newdata[2],
                        Double.parseDouble(newdata[3]),newdata[4],newdata[5],Integer.parseInt(newdata[6]));
                savingAccountList.add(savingAccount);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
