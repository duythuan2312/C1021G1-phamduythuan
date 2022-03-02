package ss1_IntroductiontoJava.Baitap;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        System.out.println("Nhập vào USD :");
        double usd = scanner.nextInt();

        double quyDoi = usd * vnd;
        System.out.println("Sau khi quy đổi :" + quyDoi);
    }
}
