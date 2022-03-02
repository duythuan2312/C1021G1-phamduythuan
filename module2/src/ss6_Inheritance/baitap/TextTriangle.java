package ss6_Inheritance.baitap;

public class TextTriangle {
    public static void main(String[] args) {
         Triangle triangle = new Triangle();
         System.out.println(triangle);

         triangle= new Triangle(3.0,4.0,5.0,"blue");
         System.out.println(triangle);

    }
}
