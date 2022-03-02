package ss7_AbstractClassInterface.baitap.Resizeable;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;
    private String color = "red";



    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
         double area = Math.PI * Math.pow(radius, 2);
        return area;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius + this.radius * (percent / 100);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ",Area=" + getArea() +
                '}';
    }
}




