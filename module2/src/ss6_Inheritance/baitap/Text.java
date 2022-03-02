package ss6_Inheritance.baitap;

public class Text {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint = new MoveablePoint(3.0f,6.0f,7.0f,8.0f);
        System.out.println(moveablePoint);
    }
}
