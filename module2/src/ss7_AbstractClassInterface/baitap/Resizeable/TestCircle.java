package ss7_AbstractClassInterface.baitap.Resizeable;

public class TestCircle  {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());

        circle.resize(10.0);
        System.out.println(circle);
    }
}
