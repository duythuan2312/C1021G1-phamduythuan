package ss3_MangvaPhuongthuctrongJava.Baitap;

import java.util.Scanner;

public class SumtheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng :");
        int m = scanner.nextInt();
        System.out.println("Nhập số cột :");
        int n = scanner.nextInt();

        int array[][] = new int[m][n];
        for (int i = 0 ; i < m ; i++  ){
            for (int j = 0 ; j < n ; j++){
                System.out.println("Array["+i+"]["+j+"] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Bạn muốn tính tổng cột nào");
        int cot = scanner.nextInt();
        int sum = 0;
        for (int i = 0 ; i < array.length; i++){
            sum = sum + array[i][cot];

        }
        System.out.println("Tổng các cột bằng "+ sum);

    }
}
