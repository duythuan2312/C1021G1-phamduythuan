package ss7_AbstractClassInterface.baitap.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 4.0;
    private double heigth = 6.0;
    public Rectangle() {
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
       double area = width * heigth;
        return area;
    }

    public double getPerimeter() {
       double perimeter = 2 * (width + heigth);
        return perimeter;
    }

    @Override
    public String toString() {
        return "Rectangle {Width="
                + getWidth()
                + ",Hength="
                + getHeigth()
                + ",Area=" + getArea() + "}";

    }

    @Override
    public void resize(double percent) {
        this.heigth = this.heigth + this.heigth * (percent / 100);
        this.width = this.width + this.width * (percent / 100);
    }

}