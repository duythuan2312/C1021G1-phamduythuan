package ss7_AbstractClassInterface.thuchanh.AnimalInterfaceEdible;

public class Run {
    public static void main(String[] args) {
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();

        for (Fruit fruit1 : fruit){
            System.out.println(fruit1.howtoEat());
        }


    }
}
