package ss1_IntroductiontoJava.Thuchanh;


import java.util.Scanner;

public class CalculateWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a weigth :");
        double weigth = scanner.nextDouble();
        System.out.println("Enter a heigth :");
        double heigth = scanner.nextDouble();

        double bmi = weigth / (heigth * heigth);
        System.out.println("Body mass index is :" + bmi);

        if (bmi < 18.5) {
            System.out.println("You are Underweigth : ");
        } else {
            if (bmi < 25) {
                System.out.println("Normal classification :");
            } else {
                if (bmi < 30.0) {
                    System.out.println("You are Overweigth :");
                } else {
                    System.out.println("You are Obese");
                }
            }
        }
    }
}
