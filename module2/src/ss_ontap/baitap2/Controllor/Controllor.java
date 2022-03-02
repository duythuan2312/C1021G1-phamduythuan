package ss_ontap.baitap2.Controllor;

import ss_ontap.baitap2.service.ServiceIlmp;

import java.util.Scanner;

public class Controllor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chosse = 0 ;
        ServiceIlmp serviceIlmp = new ServiceIlmp();
        do {
            System.out.println("1.Add new...");
            System.out.println("2.Seach....");
            System.out.println("3.Remove....");
            System.out.println("4.Display....");
            System.out.println("5.Sắp xếp..");
            System.out.println("6.Exit....");
           try {
               chosse = Integer.parseInt(scanner.nextLine());
           }catch (NumberFormatException e){
               System.out.println("Hãy nhập số");
           }
            switch (chosse){
                case 1:
                    serviceIlmp.addNew();
                    break;
                case 2:
                    serviceIlmp.seach();
                    break;
                case 3:
                    serviceIlmp.remove();
                    break;
                case 4:
                    serviceIlmp.display();
                    break;
                case 5:
                    serviceIlmp.sort();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Error...");


            }
        }while (chosse!=6);
        System.out.println("Kết thúc chương trình..");
    }
}
