package ss2_VonglaptrongJava.Baitap;


import java.util.Scanner;

public class Show20primeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int n = 2;
        int count = 0;
        boolean check = false;
        while (count < number){
            check = true;
            for (int i = 2 ;  i <= Math.sqrt(n) ; i++){
                if (n % i == 0){
                    check = false;
                   break;
                }

            }if (check){
                System.out.println(n);
                count++;
            }n++;
        }

    }
}