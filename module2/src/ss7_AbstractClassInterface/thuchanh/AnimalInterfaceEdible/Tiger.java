package ss7_AbstractClassInterface.thuchanh.AnimalInterfaceEdible;

public class Tiger extends Animal implements Edible {


    @Override
    public String makeSound() {
        return "Gừm gừm......";
    }

    @Override
    public void howtoEat(String an) {
        System.out.println("Tiger đang an " +an);
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
