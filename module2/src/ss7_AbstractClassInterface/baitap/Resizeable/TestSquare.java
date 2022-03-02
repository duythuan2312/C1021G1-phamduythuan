package ss7_AbstractClassInterface.baitap.Resizeable;

import ss7_AbstractClassInterface.baitap.Resizeable.Square;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.toString());
        
        square.resize(20);
        System.out.println(square.toString());
    }
}
