package ss3_MangvaPhuongthuctrongJava.Baitap;

import java.util.Scanner;

public class ThegreatestValue {
    public static void main(String[] args) {
        int m;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số dòng của mảng :");
        m = scanner.nextInt();
        System.out.print("Nhập số cột của mảng :");
        n = scanner.nextInt();

        int Array[][] = new int[m][n];
        for (int i = 0 ; i < m ; i++){
            for (int j = 0 ; j < n ; j++){
                System.out.println("Array["+i+"]["+j+"] = ");
                Array[i][j] = scanner.nextInt();

            }
        }
        int max = Array[0][0];
        for (int i = 0 ; i< m ; i++){
            for (int j  = 0 ; j <n ; j++){
                if (Array[i][j] > max){
                    max = Array[i][j];
                }

            }
        }
        System.out.println("Gia tri lon nhat la :"+max);
    }
}
