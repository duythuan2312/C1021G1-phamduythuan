package ss0_ObjectDirection.baitap3.Controller;

import ss0_ObjectDirection.baitap3.Model.Manage;
import ss0_ObjectDirection.baitap3.Service.ManageService;
import ss0_ObjectDirection.baitap3.Service.ManageServiceImp;

import java.util.Scanner;

public class Managecontroller {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        ManageService manageService = new ManageServiceImp();
        Manage[] managenew  = null;
        int chose;
        do {
            System.out.println("1.All ");
            System.out.println("2.Add");
            System.out.println("3.Gender");
            System.out.println("7.Exit");
            chose = Integer.parseInt(scanner.nextLine());
            managenew = manageService.all();
            switch (chose){
                case 1:
                    for (Manage manage : managenew){
                        if (manage == null){
                            continue;
                        }
                        System.out.println(manage);
                    }
                    break;
                case 2:
                    System.out.println("Input id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input name");
                    String name = scanner.nextLine();
                    System.out.println("Input yearofBirth");
                    String birth = scanner.nextLine();
                    System.out.println("Input gender");
                    String gender = scanner.nextLine();
                    System.out.println("Input homeTown");
                    String homeTown = scanner.nextLine();
                    System.out.println("Input speciaLize");
                    String speciaLize = scanner.nextLine();
                    System.out.println("Input leVel");
                    int level = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input coefficientsSalary");
                    double coeficientsSalary = Integer.parseInt(scanner.nextLine());
                    System.out.println("Input alloWance ");
                    double alloWance = Integer.parseInt(scanner.nextLine());
                    Manage newmanage = new Manage(id,name,birth,gender,homeTown,speciaLize,level,coeficientsSalary,alloWance );
                    manageService.add(newmanage);
                    break;
                case 3:
                    System.out.println("Input gender");
                    String genDer = scanner.nextLine();
                    manageService.testGender(genDer);
                 case 7:
                    break;
                default:
                    System.out.println("Error:");
            }


        }while (chose != 7);

    }
}
