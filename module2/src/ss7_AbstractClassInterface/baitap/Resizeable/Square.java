package ss7_AbstractClassInterface.baitap.Resizeable;

import ss6_Inheritance.thuchanh.Rectangle;
import ss7_AbstractClassInterface.baitap.Resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable {
    private double side = 5.0;

    public Square() {

    }

    public Square(double side) {
        super(side, side);

    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public double getHeigth() {
        return super.getHeigth();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        setWidth(side);
        setHeigth(side);
    }

    @Override
    public void setWidth(double width) {
        setWidth(width);
    }

    @Override
    public void setHeigth(double heigth) {
        setHeigth(heigth);
    }

    @Override
    public String toString() {
        return "Square{Side="
                + getSide()
                + ",Area="
                + getArea() + "}";
    }

    @Override
    public void resize(double percent) {
        this.side = this.side + this.side   * (percent / 100);
    }
}

