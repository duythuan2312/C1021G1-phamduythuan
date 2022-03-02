package ss1_IntroductiontoJava.Thuchanh;

import java.util.Scanner;

public class CheckleapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year :");
        int year = scanner.nextInt();

        boolean check = true;

        boolean divisibleby4 = year % 4 == 0;
        if (divisibleby4){
            boolean divisibleby100 = year % 100 == 0;
            if (divisibleby100){
                boolean divisibleby400 = year % 400 == 0;
                if (divisibleby400){
                    check = true;
                }
            }else {
                check = false;
            }
        }
        if (check){
            System.out.println("It is a leap year !");
        }else {
            System.out.println("No is a leap year !");
        }

    }
}

