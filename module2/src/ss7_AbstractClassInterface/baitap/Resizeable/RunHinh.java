package ss7_AbstractClassInterface.baitap.Resizeable;

public class RunHinh {
    public static void main(String[] args) {
        Resizeable[] arrays = new Resizeable[3];
        arrays[0] = new Circle();
        arrays[1] = new Rectangle();
        arrays[2] = new Square();
        System.out.println("Chưa thay đổi :::::::");
        for (Resizeable resizeable: arrays){
            System.out.println(resizeable);
        }
        System.out.println("");
        System.out.println("Sau khi thay đổi::::::::");
        for(Resizeable resizeable : arrays){
            resizeable.resize(Math.random()*100);
            System.out.println(resizeable);
        }

    }
}
