package ss6_Inheritance.baitap;

import ss7_AbstractClassInterface.thuchanh.Comparator.Circle;

public class CircleText {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(5.6,"red");
        System.out.println(circle);
    }
}
