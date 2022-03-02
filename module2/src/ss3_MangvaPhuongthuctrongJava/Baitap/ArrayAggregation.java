package ss3_MangvaPhuongthuctrongJava.Baitap;

import java.util.Arrays;

public class ArrayAggregation {
    public static int[] myArray(int[] array1,int[] array2){
        int newarray[] = new int[array1.length + array2.length];
        for (int i = 0; i <array1.length ; i++){
            newarray[i] = array1[i];
        }
        for (int i = 0 ; i < array2.length ; i++){
            newarray[array1.length + i] = array2[i];
        }
             return newarray;
    }
    public static void main(String[] args) {
        int array1[] = {0,1,2,3,4,5};
        int array2[] = {6,7,8,9,10,11};
        int newarray[] = myArray(array1,array2);
        System.out.println("Array 1 :" +Arrays.toString(array1));
        System.out.println("Array 2 :" +Arrays.toString(array2));
        for (int j = 0 ; j < newarray.length ; j++) {
        }
        System.out.println("Newarray :" + Arrays.toString(newarray));

    }
}
