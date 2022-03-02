package ss7_AbstractClassInterface.thuchanh.Comparable;

import ss6_Inheritance.thuchanh.Shape;

public class Circle extends Shape {
    private  double radius = 1.0;
    private double area;
    private  double perimeter;

    public Circle(){

    }
    public Circle(double radius){

    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
         area = radius * radius *Math.PI;
        return area;
    }

    public double getPerimeter() {
         perimeter = 2 * radius * Math.PI;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
