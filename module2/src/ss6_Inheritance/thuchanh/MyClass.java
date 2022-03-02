package ss6_Inheritance.thuchanh;

public class MyClass {
    private String name = "Thuan";
    private static String contry = "Vn";

    public MyClass(String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String getContry() {
        return contry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setContry(String contry) {
        MyClass.contry = contry;
    }

    @Override
    public String toString() {
        getContry();
        return "MyClass{" +
                "name='" + name + '\'' +contry
                +'}';
    }

    public static void main(String[] args) {

        MyClass myClass1 = new MyClass("Ongtho");
        System.out.println(myClass1);
        System.out.println(myClass1.toString());

    }

}
