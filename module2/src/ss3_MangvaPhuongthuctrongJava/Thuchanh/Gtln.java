package ss3_MangvaPhuongthuctrongJava.Thuchanh;

import java.util.Scanner;

public class Gtln {
    public static void main(String[] args) {
        int size;
        int []array;

        Scanner sacanner = new Scanner(System.in);
     do {
         System.out.println("Enter a size:");
         size = sacanner.nextInt();
         if (size > 20) {
             System.out.println("Please re-enter");
         }
     }while (size > 20);
     array = new int[size];
     int i = 0;
     while (i < array.length){
         System.out.println("Enter elemen "+(i+1) +":");
         array[i] = sacanner.nextInt();
         i++;
     }
        System.out.printf( "Elements in array: ", "");
     for (int j = 0 ; j <array.length ; j++){
         System.out.println(array[j] +"\t");

     }
        System.out.println("");
        int max = 0;
        int index = 0;
     for (int  j = 0 ; j <array.length ; j++){
         if (array[j] > max){
             max = array[j];
             index++;

         }
     }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
