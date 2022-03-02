package ss_ontap.controllor;

import ss_ontap.service.CandidexServiceIlmp;

import java.util.Scanner;

public class CandidesControllor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CandidexServiceIlmp candidexServiceIlmp = new CandidexServiceIlmp();

        int chosse = 0;

        do {
            System.out.println("1.Add...");
            System.out.println("2.Display ...");
            System.out.println("3.EXits...");
            try {
                chosse = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException  e){
                System.out.println("Hãy nhập số");
            }
            switch (chosse){
                case 1:
                    candidexServiceIlmp.addNew();
                    break;
                case 2:
                    candidexServiceIlmp.display();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("ERROR.....");
            }

        }while (chosse!=3);
        System.out.println("Kết thúc chương trình...");
    }
}
