package ss5_Accessmodifierstati.baitap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        circle.setColor("blue");
        System.out.println(circle.getColor());
        
    }
}
