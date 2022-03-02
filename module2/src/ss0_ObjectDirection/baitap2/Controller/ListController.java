//package ss0_ObjectDirection.baitap2.Controller;
//
//import ss0_ObjectDirection.baitap2.Model.List;
//import ss0_ObjectDirection.baitap2.Service.ListService;
//import ss0_ObjectDirection.baitap2.Service.ListServiceImp;
//import ss101_Dethi.model.Phone;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ListController {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        ListService listService = new ListServiceImp();
//        List<Phone>[] listnew = null;
//        int selectec;
//        do {
//            System.out.println("1.All list >>>>");
//            System.out.println("2.Add list >>>>");
//            System.out.println("3.Delete list >>>>");
//            System.out.println("4.Delete index >>>>");
//            System.out.println("5.Sort ...");
//            System.out.println("6.Search...");
//            System.out.println("7.Exit.....");
//
//            selectec = Integer.parseInt(scanner.nextLine());
//            listnew = listService.All();
//            switch (selectec) {
//                case 1:
//                    for (List<Phone> list : listnew) {
//                        if (list == null) {
//                            continue;
//                        }
//                        System.out.println(list);
//                    }
//                    break;
//                case 2:
//                    System.out.println("Input MSSV:");
//                    int mssv = Integer.parseInt(scanner.nextLine());
//                    System.out.println("Input name :");
//                    String name = scanner.nextLine();
//                    System.out.println("Input dateBirth :");
//                    String dateBirth = scanner.nextLine();
//                    System.out.println("Input gender");
//                    String gender = scanner.nextLine();
//                    System.out.println("Input name class");
//                    String nameclass = scanner.nextLine();
//                    System.out.println("Input department:");
//                    int department = Integer.parseInt(scanner.nextLine());
//                    List<Phone> newlisst = new List<Phone>(mssv, name, dateBirth, gender, nameclass, department);
//                    listService.add(newlisst);
//                    break;
//                case 3:
//                    System.out.println("Input mssv :");
//                    int delete = Integer.parseInt(scanner.nextLine());
//                    listService.delete(delete);
//                    break;
//                case 4:
//                    System.out.println("Input index>>> :");
//                    int index = Integer.parseInt(scanner.nextLine());
//                    listService.remove(index);
//                    break;
//                case 5:
//                    Arrays.sort(listService.All());
//                    break;
//                case 6:
//                    System.out.println("Input mssv");
//                    String search = scanner.nextLine();
//                    listService.seach(search);
//                    break;
//                case 7:
//                    break;
//                default:
//                    System.out.println("Error...");
//            }
//        } while (selectec != 6);
//    }
//}
