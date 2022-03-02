package ss101_ThiThu.Controllor;

import ss101_ThiThu.service.CellphoneServiceIlmp;
import ss101_ThiThu.service.GenuinePhoneSerImpl;

import java.util.Scanner;

public class PhoneControllor {
     Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMenu();

    }
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int chosse = 0;
        do {
            System.out.println("-----------------MENU------------");
            System.out.println("1.Genuine phone.");
            System.out.println("2.Cell phone.");
            System.out.println("3.Exit...");
           try {
               chosse = Integer.parseInt(scanner.nextLine());
           }catch (NumberFormatException e){
               System.out.println("Hãy nhập số");
           }
            switch (chosse) {
                case 1:
                    genuinePhone();
                    break;
                case 2:
                    cellPhone();
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error....");
            }
        } while (true);

    }
    public static void genuinePhone(){
        Scanner scanner = new Scanner(System.in);
        GenuinePhoneSerImpl genuinePhoneSer = new GenuinePhoneSerImpl();
        int chose = 0;
        do {
            System.out.println("1.Add Genuine phone.");
            System.out.println("2.Delete Genuine phone.");
            System.out.println("3.Display Genunie phone.");
            System.out.println("4.Seach Genunie phone.");
            System.out.println("5.To Back Menu");
          try {
              chose = Integer.parseInt(scanner.nextLine());
          }catch (NumberFormatException e){
              System.out.println("Hãy nhập số");
          }
            switch (chose){
                case 1:
                    genuinePhoneSer.addNew();
                    break;
                case 2:
                    genuinePhoneSer.remove();
                    break;
                case 3:
                    genuinePhoneSer.displayPhone();
                    break;
                case 4:
                    genuinePhoneSer.seach();
                    break;
                case 5:
                    displayMenu();
                default:
                    System.out.println("Errror");

            }

        }while (true);
    }
    public static void cellPhone(){
        Scanner scanner = new Scanner(System.in);
        CellphoneServiceIlmp cellphoneServiceIlmp = new CellphoneServiceIlmp();
        int chosse = 0;
        do {
            System.out.println("1.Add Cell phone.");
            System.out.println("2.Delete Cell phone.");
            System.out.println("3.Display Cell phone.");
            System.out.println("4.Seach Cell phone.");
            System.out.println("5.To Back menu");
          try {
              chosse = Integer.parseInt(scanner.nextLine());
          }catch (NumberFormatException e){
              System.out.println("Hãy nhập số..");
          }
            switch (chosse){
                case 1:
                    cellphoneServiceIlmp.addNew();
                    break;
                case 2:
                    cellphoneServiceIlmp.remove();
                    break;
                case 3:
                    cellphoneServiceIlmp.displayPhone();
                    break;
                case 4:
                    cellphoneServiceIlmp.seach();
                    break;
                case 5:
                    displayMenu();
                    break;
                default:
                    System.out.println("Error...");
            }

        }while (true);
    }
}

