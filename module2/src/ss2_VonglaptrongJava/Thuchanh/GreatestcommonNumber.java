package ss2_VonglaptrongJava.Thuchanh;

import java.util.Scanner;

public class GreatestcommonNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1  = scanner.nextInt();
        System.out.println("Enter num2: ");
        int num2 = scanner.nextInt();

        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        if (num1 == 0 || num2 == 0){
            System.out.println("No greatest common factor :");
        }while (num1!=num2){
            if (num1 > num2 ){
                num1 = num1 - num2;
            }else {
               num2 = num2 - num1;
            }

        }
        System.out.println("Greatest common factor :" +num1);
    }
}
