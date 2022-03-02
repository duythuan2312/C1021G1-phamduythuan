package ss2_VonglaptrongJava.Thuchanh;

import java.util.Scanner;

public class InterestCalculatorapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a moey :");
        double money = scanner.nextDouble();
        System.out.println("Enter a month :");
        int month = scanner.nextInt();
        System.out.println("Enter a interestRate :");
        double interestRate = scanner.nextDouble();
        double totalInterest = 0;
         for (int i = 0 ; i < month; i++){
              totalInterest += money *(interestRate/100)/12*month;
         }
        System.out.println("Total of interest :"+totalInterest);
    }
}
