package ss6_Inheritance.thuchanh;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double heigth = 1.0;
    private double area;
    private double perimeter;
    public Rectangle(){

    }

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangle(double width, double heigth, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getArea() {
        area = width*heigth;
        return area;
    }

    public double getPerimeter() {
        perimeter = 2*(width + heigth);
        return perimeter;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + "and hength="
                 +getHeigth()
                +",which is a subclass of"
                +super.toString();

    }
}
