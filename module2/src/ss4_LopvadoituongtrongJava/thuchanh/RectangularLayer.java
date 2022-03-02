package ss4_LopvadoituongtrongJava.thuchanh;

import java.util.Scanner;

public class RectangularLayer {
    double width , heigth;

    public RectangularLayer(double width , double heigth){
        this.width = width;
        this.heigth = heigth;
    }
    public double getArea(){
        return this.width * this.heigth;
    }
    public  double getPerimeter(){
        return (this.width + this.heigth) * 2;
    }
    public  String display(){
        return "Rectangle{" + "Width=" +width +", heigth=" +heigth+ "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a width:");
        double width = scanner.nextDouble();
        System.out.println("Enter a heigth :");
        double heigth = scanner.nextDouble();


        RectangularLayer rectangle = new RectangularLayer(width,heigth);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}
