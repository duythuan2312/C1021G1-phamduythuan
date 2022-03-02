package dethi2.Controllor;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Controllor {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void displayMenu(){
        int chosse = 0;
        do {
            System.out.println("---ỨNG DỤNG TÀI KHOẢN NGÂN HÀNG---");
            System.out.println("1.Tai khoan thanh toán");
            System.out.println("2.Tài khoản tiết kiệm");
            System.out.println("3.Exit...");
            try {
                chosse = Integer.parseInt(scanner.nextLine());

            }catch (NumberFormatException e){
                System.out.println("hãy nhập số nha ");
            }
            switch (chosse){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình...");
                    System.exit(0);
                    break;
            }
        }while (true);

    }
    public static void taikhoanTT(){
        int chosse = 0;
        do {
            System.out.println("1.Thêm mới");
            System.out.println("2.Xóa ");
            System.out.println("3.Hiển thị ra màn hình");
            System.out.println("4.Tiềm kiếm");
            System.out.println("5.Quay lại menu chính...");
            chosse = Integer.parseInt(scanner.nextLine());
            switch (chosse){
                case 1:

                case 2:
                case 3:
                case 4:
                case 5:
                    break;
            }

        }while (true);
    }
}
