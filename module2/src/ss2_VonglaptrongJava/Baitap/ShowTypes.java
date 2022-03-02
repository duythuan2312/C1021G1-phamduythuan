package ss2_VonglaptrongJava.Baitap;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    for (int i = 1;i <= 7;i++){
                        System.out.println("");
                        for (int j = 1; j<=i;j++){
                            System.out.print("*");
                        }
                    }
                    System.out.println("");

                    for (int i = 7;i >= 1;i--){
                        System.out.println("");
                        for (int j = 1;j<=i;j++){
                            System.out.print("*");
                        }
                    }
                    System.out.println("");

                    for (int i = 1; i <= 7; i++) {
                        for (int k = 7; k > i; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i * 2 - 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    for (int i = 1; i <= 7; i++){
                        System.out.println("");
                        for (int j = 1;j <= 7;j++){
                            System.out.print("* ");
                        }
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    Scanner input = new Scanner(System.in);
                    System.out.print("Nhập số dòng: ");
                    int row = input.nextInt();
                    System.out.print("Nhập số cột: ");
                    int col = input.nextInt();
                    for (int i = 1; i <= row; i++) {
                        System.out.println("");
                        for (int j = 1; j <= col;j++){
                            System.out.print("* ");
                        }
                    }
                    System.out.println("");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
