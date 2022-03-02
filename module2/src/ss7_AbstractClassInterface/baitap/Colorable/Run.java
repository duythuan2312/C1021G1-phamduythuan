package ss7_AbstractClassInterface.baitap.Colorable;

public class Run {
    public static void main(String[] args) {
        Shape[] array = new Shape[3];
        array[0] = new Circle();
        array[1] = new Square();
        array[2] = new Rectangle();

        for(Shape shape : array){
            System.out.println(shape);
            if (shape instanceof Colorable){
                ((Colorable) shape).howToColor();
            }
        }


    }


}
