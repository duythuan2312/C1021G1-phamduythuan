package dethi1.Controllor;

import dethi1.model.SavingAccount;
import dethi1.service.SavingAccountServiceIpml;

import java.util.Scanner;

public class Controlor {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        displayMenu();

    }
    public  static  void displayMenu(){
        int chosse = 0;
        do {
            System.out.println("----CHUONG TRINH QUAN LI TAI KHOAN NGAN HANG----");
            System.out.println("1.Tài khoản tiết kiệm");
            System.out.println("2.Tài khoản thanh toán");
            System.out.println("3.Exit");
            chosse = Integer.parseInt(scanner.nextLine());
            switch (chosse){
                case 1:
                    SavingAccount();
                    break;
                case 2:
                    break;
                case 3:
                    break;

            }
        }while (chosse!=3);
    }
    public static void SavingAccount(){
        SavingAccountServiceIpml savingAccountServiceIpml = new SavingAccountServiceIpml();
        int chosse = 0;
        do {
            System.out.println("1.Thêm mới");
            System.out.println("2.Xóa");
            System.out.println("3.Seach");
            System.out.println("4.Hiển thị");
            System.out.println("5.Quay lại menu chính");
            chosse = Integer.parseInt(scanner.nextLine());
            switch (chosse){
                case 1:
                    savingAccountServiceIpml.addNew();
                    break;
                case 2:
                    savingAccountServiceIpml.remove();
                    break;
                case 3:
                    savingAccountServiceIpml.seach();
                    break;
                case 4:
                    savingAccountServiceIpml.displays();
                    break;
                case 5:
                    displayMenu();
                    break;
            }
        }while (true);
    }
}
