package ss3_MangvaPhuongthuctrongJava.Baitap;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {3,4,5,6,73,8,9,2};
        System.out.println("Enter a x:");
        int x = scanner.nextInt();
        int index;
        for (int i = 0 ; i < array.length  ; i++){
            if (x == array[i]) {
                index = i;
                System.out.println("Index  to delete :" +index);
                for (int j = index ; j <array.length -1 ; j++){
                    array[j] = array[j + 1];
                }
            }
        }
            System.out.println("Array after deleting the element" );
            for (int j = 0 ; j < array.length - 1 ; j++){
                System.out.println(array[j] );
            }

        }

    }

