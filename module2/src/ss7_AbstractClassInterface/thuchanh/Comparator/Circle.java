package ss7_AbstractClassInterface.thuchanh.Comparator;

public class Circle {
    protected double radius = 2.0;
    protected String color = "blue";

    public Circle(){

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea()  {
        return radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Radius="
                +getRadius()
                +" ,Dientich="
                +getArea()
                +", Color"
                +getColor()
                ;
    }
}
