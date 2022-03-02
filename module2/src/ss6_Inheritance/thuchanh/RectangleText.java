package ss6_Inheritance.thuchanh;

public class RectangleText {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.4,3.6);
        System.out.println(rectangle);

        rectangle = new Rectangle(5.6,2.6,"red",true);
        System.out.println(rectangle);
    }
}
