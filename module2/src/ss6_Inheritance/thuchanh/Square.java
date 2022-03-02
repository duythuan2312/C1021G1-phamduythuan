package ss6_Inheritance.thuchanh;

public class Square extends Rectangle{
    private  double side;
    public Square(){

    }
    public Square(double side){
        super(side,side);

    }
    public Square(double side,String color , boolean filled){
        super( side, side,color , filled);
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
        return "A square width side="
                +getSide()
                +",which is a subclass of"
                +super.toString();
    }
}
