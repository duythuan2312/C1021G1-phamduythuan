package ss2_VonglaptrongJava.Baitap;

import java.util.Scanner;

public class ShowprimeNumbers {
    public static void main(String[] args) {

        int n = 2;
        int count = 0;
        boolean check = false;
        while (count < 100){
            check = true;
            for (int i = 2 ;  i <= Math.sqrt(n) ; i++){
                if (n % i == 0){
                    check = false;
                    break;
                }

            }if(n <100){
                if (check){
                    System.out.println(n);
                    count++;
            }
            }n++;
        }
    }
}
