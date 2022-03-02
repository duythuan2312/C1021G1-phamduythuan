package ss13_SearchAlgorithm.Thuchanh;

import java.util.Arrays;

public class BinarySearch {
    static int binarySeach(int[] array ,int value){
        int low = 0;
        int high = array.length -1;

        while (low <= high) {
            int mid = (low + high)/2;
            if (array[mid] == value){
                return mid;
            }else if(array[mid] > value){
                    high = mid -1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9,20};
        System.out.println(binarySeach(myArray,6));
        System.out.println(binarySeach(myArray,1));
        System.out.println(Arrays.binarySearch(myArray,9));

    }
}
