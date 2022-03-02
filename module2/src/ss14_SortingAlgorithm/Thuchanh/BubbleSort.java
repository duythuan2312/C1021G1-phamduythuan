package ss14_SortingAlgorithm.Thuchanh;

public class BubbleSort {
    //    static int[] arr = {5,6,8,9,2,3,-1,-5};
//    public static void bubbleSort(int[] arr){
//        for (int i=0 ; i<arr.length-1 ; i++){
//            for (int j = arr.length -1 ; j > i ; j--){
//                if (arr[j] < arr[j-1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        bubbleSort(arr);
//        for (int array : arr){
//            System.out.print(array+" ");
//        }
//    }
//
    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 8, 9, 1, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int err : arr) {
            System.out.println(err);
        }
    }
}
//public static void main(String[] args) {
//    int[] array = {5,8,9,0,1,23,4};
//    for (int i = 0 ;i < array.length ; i++){
//        for (int j = i+1 ; j < array.length ; j++){
//            if (array[i] > array[j]){
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//            }
//        }
//    }
//    for (int arr : array){
//        System.out.println(arr);
//    }
//}
//}
