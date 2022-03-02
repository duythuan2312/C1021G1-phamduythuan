package ss7_AbstractClassInterface.thuchanh.Comparable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] array = new ComparableCircle[3];
        array[0] = new ComparableCircle(3,"yello",true);
        array[1] = new ComparableCircle();
        array[2] = new ComparableCircle();

        System.out.println("Trước khi sắp xếp");
        for (ComparableCircle circle : array){
            System.out.println(circle);
        }
        Arrays.sort(array);
        System.out.println("Sau khi sap xep");
        for (ComparableCircle circle : array){
            System.out.println(circle);
        }

    }
}
