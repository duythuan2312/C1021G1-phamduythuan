package ss6_Inheritance.thuchanh;

public class Squaretext {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(3.5);
        System.out.println(square);

        square = new Square(3.5,"yellow",true);
        System.out.println(square);
    }
}
