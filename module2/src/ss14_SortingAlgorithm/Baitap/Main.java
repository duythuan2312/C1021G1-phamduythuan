package ss14_SortingAlgorithm.Baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a size :");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " +array.length+ " value");
        for (int i = 0 ; i < array.length ; i++){
            array[i] = scanner.nextInt();
        }
     InsertionSort.insertionSort(array);
        System.out.println("Sau khi sắp xếp chọn :");
        for (int arr : array){
            System.out.print(arr);
        }

    }
}
