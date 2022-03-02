package ss7_AbstractClassInterface.thuchanh.AnimalInterfaceEdible;

public class Test {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        chicken.howtoEat("thoc");
        System.out.println(chicken.makeSound());

        Tiger tiger = new Tiger();
        tiger.howtoEat("Thịt");
        System.out.println(tiger.makeSound());

        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals){
            animal.makeSound();

            if (animal instanceof Chicken){
                Edible edible = (Chicken) animal;
                System.out.println(edible.howtoEat());
            }

        }

    }
}
