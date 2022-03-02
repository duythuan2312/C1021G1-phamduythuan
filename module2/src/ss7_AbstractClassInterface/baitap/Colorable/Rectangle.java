package ss7_AbstractClassInterface.baitap.Colorable;

public class Rectangle extends Shape implements Colorable {
    private double width = 5.0;
    private double heigth = 4.0;

    public Rectangle(String color, boolean filled, double width, double heigth) {
        super(color, filled);
        this.width = width;
        this.heigth = heigth;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    public double getArea(){
        return this.width * this.heigth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", heigth=" + heigth +
                ",Area="+this.getArea()+
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..(:");
    }
}
