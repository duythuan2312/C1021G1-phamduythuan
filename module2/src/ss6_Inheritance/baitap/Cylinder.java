package ss6_Inheritance.baitap;

import ss7_AbstractClassInterface.thuchanh.Comparator.Circle;

public class Cylinder extends Circle {
    private int height = 2;
    private double cylindricalvolume;

     public Cylinder(){

     }

    public Cylinder(double radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    public double getCylindricalvolume() {
        cylindricalvolume = Math.PI * getRadius() *getRadius() * height;
        return cylindricalvolume;
    }

    @Override
    public String toString() {
        return "Heigth="
                +getHeight()
                +", cylindricalvolume="
                +getCylindricalvolume()
                +",color"
                +getColor()
                +"}"
                ;
    }
}
