package ss6_Inheritance.baitap;

public class CylinderText {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(5.0,"blue",6);
        System.out.println(cylinder);
    }
}
