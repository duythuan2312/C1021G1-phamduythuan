package ss15_ExceptionandDebug.thuchanh;

import java.util.Scanner;

public class CalculationExample {
    private void calculate(int x , int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y =" + a);
            System.out.println("Hiệu X - y =" + b);
            System.out.println("Tích a * b=" + c);
            System.out.println("Thương a / b=" +d);
        }catch (Exception e){
            System.out.println("Xảy ra ngoại lệ " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a x :");
        int x = scanner.nextInt();
        System.out.println("Enter a y:");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);
    }
}
