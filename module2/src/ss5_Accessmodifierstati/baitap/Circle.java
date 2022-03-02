package ss5_Accessmodifierstati.baitap;public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private double area;
    private final double pi = 3.14;

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
        area = pi * Math.pow(radius,2);
        return area;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


