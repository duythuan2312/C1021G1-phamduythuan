package ss15_ExceptionandDebug.thuchanh;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng :");
        for (int i = 0 ; i < 100 ; i++){
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] +" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample createRandom = new ArrayExample();
        Integer[] arr = createRandom.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println(" \n Nhập vào phần tử bất kì:");
        int num = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số :" + num +" " +" là " + arr[num]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng :");
        }
    }
}
