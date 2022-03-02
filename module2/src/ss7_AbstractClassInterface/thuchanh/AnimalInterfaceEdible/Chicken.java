package ss7_AbstractClassInterface.thuchanh.AnimalInterfaceEdible;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Cục tác .....";
    }


    @Override
    public void howtoEat(String an) {
        System.out.println(" Chicken dang ăn " + an);
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }

}
