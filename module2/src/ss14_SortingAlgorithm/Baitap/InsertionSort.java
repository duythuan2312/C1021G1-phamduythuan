package ss14_SortingAlgorithm.Baitap;

public class InsertionSort {
    public static void insertionSort(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            int currentElement = array[i];
            int pos = i;

            while (pos > 0 && currentElement < array[pos -1]){
//                System.out.println("Swap " + currentElement +" with " +array[pos -1]);
                array[pos] = array[pos -1];
                pos--;
            }
            array[pos] = currentElement;
        }

    }
}
