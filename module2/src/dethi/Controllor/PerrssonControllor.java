package dethi.Controllor;

import dethi.Service.StudentServiceIpml;
import dethi.Service.TeacherServiceIpml;

import java.util.Scanner;

public class PerrssonControllor {
    public static void main(String[] args) {
        displayMenu();

    }
    public static void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        int chosse = 0;

        do {
            System.out.println("1.Học viên...");
            System.out.println("2.Giảng viên...");
            System.out.println("3.Exit...");
          try {
              chosse = Integer.parseInt(scanner.nextLine());
          }catch (NumberFormatException e){
              System.out.println("Hãy nhập số...");
          }
          switch (chosse){
              case 1:
                  Student();
                  break;
              case 2:
                  Teacher();
                  break;
              case 3:
                  System.out.println("Kết thúc chương trình!!!!!!!!!");
                  System.exit(0);
          }

        }while (true);
    }
    public  static void Teacher(){
        Scanner scanner = new Scanner(System.in);
        TeacherServiceIpml teacherServiceIpml = new TeacherServiceIpml();

        int chosse = 0;
        do {
            System.out.println("1.Thêm mới giảng viên...");
            System.out.println("2.Xóa giảng viên.");
            System.out.println("3.Xem danh sách giảng viên ..");
            System.out.println("4.Tìm kiếm giảng viên.");
            System.out.println("5.Về lại menu chính..");
          try {
              chosse = Integer.parseInt(scanner.nextLine());
          }catch (NumberFormatException e){
              System.out.println("Hãy nhập số");
          }
          switch (chosse){
              case 1:
                  teacherServiceIpml.addNew();
                  break;
              case 2:
                  teacherServiceIpml.remove();
                  break;
              case 3:
                  teacherServiceIpml.displays();
                  break;
              case 4:
                  teacherServiceIpml.seach();
                  break;
              case 5:
                  displayMenu();
                  break;
          }

        }while (true);
    }
    public static void Student(){
        Scanner scanner = new Scanner(System.in);
        StudentServiceIpml studentServiceIpml = new StudentServiceIpml();
        int chosse = 0;
        do {
            System.out.println("1.Thêm mới học sinh...");
            System.out.println("2.Xóa học sinh.");
            System.out.println("3.Xem danh sách học sinh ..");
            System.out.println("4.Tìm kiếm học sinh.");
            System.out.println("5.Về lại menu chính..");
            try {
                chosse = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Hãy nhập số");
            }
            switch (chosse){
                case 1:
                    studentServiceIpml.addNew();
                    break;
                case 2:
                    studentServiceIpml.remove();
                    break;
                case 3:
                    studentServiceIpml.displays();
                    break;
                case 4:
                    studentServiceIpml.seach();
                    break;
                case 5:
                    displayMenu();
                    break;
            }

        }while (true);

    }
}
