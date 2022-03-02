package ss5_Accessmodifierstati.thuchanh;

public class TestStaticProperty {
    public static void main(String[] args) {
        StaticProperty staticProperty = new StaticProperty("Mazda3" , "Skyactiv 3");
        System.out.println(StaticProperty.numberOfCar);
        StaticProperty staticProperty1 = new StaticProperty("Mazda 6" , "Skyactiv 6");
        System.out.println(StaticProperty.numberOfCar);
    }
}