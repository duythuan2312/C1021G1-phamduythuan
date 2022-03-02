package ss5_Accessmodifierstati.thuchanh;

public class StaticProperty {
    private String name;
    private String engine;

    public static int numberOfCar;

    public StaticProperty(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar ++;
    }




}
