package ss3_MangvaPhuongthuctrongJava.Baitap;

import java.util.Scanner;

public class AddelementstoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int[] array = {2,3,4,5,7,8,9};
       int[] newarray = new int[array.length + 1];
       System.out.println("Enter a x");
        int x = scanner.nextInt();
        System.out.println("Enter a index :");
        int index = scanner.nextInt();
        for(int i = 0 ; i <array.length ; i++){
            newarray[i] = array[i];
             }
        for (int j = newarray.length - 1 ; j > index ; j--){
            newarray[j] = newarray[j-1];
        }
        newarray[index] = x;

        for (int i = 0 ; i < newarray.length ; i++){
            System.out.println(newarray[i]);
        }
    }
}

