package ss7_AbstractClassInterface.baitap.Resizeable;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle.resize(60);
        System.out.println(rectangle);
    }
}
