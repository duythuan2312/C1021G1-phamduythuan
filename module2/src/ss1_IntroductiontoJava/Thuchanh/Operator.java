package ss1_IntroductiontoJava.Thuchanh;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        float width;
        float heigth;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter heigth: ");
        heigth = scanner.nextFloat();

        float area = width * heigth;
        System.out.println("Area is:" + area);
    }
}
