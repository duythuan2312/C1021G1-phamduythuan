package ss15_ExceptionandDebug.baitap;

import java.util.Scanner;

public class Demo {
    public static void exCaptinon(){
        Scanner scanner = new Scanner(System.in);
         try {
             System.out.println("Nhập cạnh a");
             int a = scanner.nextInt();
             System.out.println("Nhập cạnh b");
             int b = scanner.nextInt();
             System.out.println("Nhập cạnh c");
             int c = scanner.nextInt();
         }catch (NumberFormatException e){

         }
    }
    public static void main(String[] args) {
        exCaptinon();

    }
}
