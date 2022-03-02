package ss6_Inheritance.thuchanh;

public class CircleText {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(5.0,"blue",false);
        System.out.println(circle);
    }
}
