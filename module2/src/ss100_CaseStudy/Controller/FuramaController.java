package ss100_CaseStudy.Controller;

import ss100_CaseStudy.Model.facility.Facility;
import ss100_CaseStudy.Servise.EmployeeService;
import ss100_CaseStudy.Servise.ImpServise.CustomerServiceImpl;
import ss100_CaseStudy.Servise.ImpServise.EmployeeServiceImpl;
import ss100_CaseStudy.Servise.ImpServise.FacilityServiceImpl;
import ss100_CaseStudy.Servise.mainService.PerssonService;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        Scanner scanner = new Scanner(System.in);
        int chosse = 0;
        do {
            System.out.println("-------Furama-------");
            System.out.println("1.Employee Management");
            System.out.println("2.Customer Management");
            System.out.println("3.Facility Management");
            System.out.println("4.Booking Management");
            System.out.println("5.Promotion Management");
            System.out.println("6.Exit.....");
            try {
                chosse = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Hãy là một người dùng thông minh.....");
            }
            switch (chosse){
                case 1:
                    empLoyee();
                    break;
                case 2:
                    cusTomer();
                    break;
                case 3:
                    faciLity();
                    break;
                case 4:
                    booKing();
                    break;
                case 5:
                    promoTion();
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình ...");
                   System.exit(0);
                default:
                    System.out.println("Error.....");
            }
        }while (chosse!=6);



    }

    public static void empLoyee(){
        Scanner  scanner = new Scanner(System.in);
        boolean check = true;

        EmployeeServiceImpl perssonService = new EmployeeServiceImpl();

        while (check){
            System.out.println("1.Display list employees");
            System.out.println("2.Add new employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Return main menu");
            int chose = 0;
           try {
                chose = Integer.parseInt(scanner.nextLine());
           }catch (NumberFormatException e){
               System.out.println("Hãy là người dùng thông minh...");
               check = true;
               continue;
           }
            switch (chose){
                case 1:
                    perssonService.display();
                    break;
                case 2:
                    perssonService.addNew();
                    break;
                case 3:
                    perssonService.edit();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Error......");

            }
        }
    }
    public static void cusTomer(){
        Scanner scanner = new Scanner(System.in);
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        boolean check = true;
        while (check){
            System.out.println("1.Display list customers");
            System.out.println("2.Add new customer");
            System.out.println("3.Edit customer");
            System.out.println("4.Return main menu");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose){
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.addNew();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Error....");

            }
        }
    }
    public static void faciLity(){
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        FacilityServiceImpl facilityService = new FacilityServiceImpl();

        while (check){
            System.out.println("1.Display list facility");
            System.out.println("2.Add new facility");
            System.out.println("3.Display list facility maintenance");
            System.out.println("4.Return main menu");

            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose){
                case 1:
                    check = false;
                    int chosse = 0;
                    do {
                        check = false;
                        System.out.println("1.Display villa..");
                        System.out.println("2.Display house..");
                        System.out.println("3.Display room...");
                        System.out.println("4.Back to Menu....");
                        try {
                            chosse = Integer.parseInt(scanner.nextLine());
                        }catch (NumberFormatException e){
                            System.out.println("Vui lòng nhập số....");
                            check = true;
                            continue;
                        }
                        switch (chosse){
                            case 1:
                                facilityService.disPlayVilla();
                               break;
                            case 2:
                                facilityService.disPlayHouse();
                                break;
                            case 3:
                                facilityService.disPlayRoom();
                                break;
                            case 4:
                                faciLity();
                                break;
                            default:
                                System.out.println("Error...");

                        }
                    }while (check);
                case 2:
                    check = false;
                    do {
                        System.out.println("1.Add New Villa");
                        System.out.println("2.Add New House");
                        System.out.println("3.Add New Room");
                        System.out.println("4.Back to menu");
                        chosse = Integer.parseInt(scanner.nextLine());
                        switch (chosse){
                            case 1:
                                facilityService.addNew(1);
                                break;
                            case 2:
                                facilityService.addNew(2);
                                break;
                            case 3:
                                facilityService.addNew(3);
                                break;
                            case 4:
                                faciLity();
                                break;
                            default:
                                System.out.println("Error......");
                        }
                    }while (!check);
                case 3:
                    facilityService.listMaintenanace();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.err.println("Error....");;



            }
        }
    }
    public  static void booKing(){
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check){
            System.out.println("1.Add new booking");
            System.out.println("2.Display list booking");
            System.out.println("3.Create new constracts");
            System.out.println("4.Display list contracts");
            System.out.println("5.Edit contracts");
            System.out.println("6.Return main menu");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Error...");

            }
        }
    }
    public static void promoTion(){
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check){
            System.out.println("1.Display list customers use service");
            System.out.println("2.Display list customers get voucher");
            System.out.println("3.Return main menu");
            int chose = Integer.parseInt(scanner.nextLine());
            switch (chose){
                case 1:

            }
        }
    }
}
