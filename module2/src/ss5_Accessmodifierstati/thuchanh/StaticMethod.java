package ss5_Accessmodifierstati.thuchanh;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String collage;

    StaticMethod(int a , String b){
        rollno = a;
        name = b;

    }
    static void change(){
        collage = "CodeGym";
    }
    public void disPlay(){
        System.out.println(rollno+" " + name+" " + collage+" ");
    }
    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod staticMethod1 = new StaticMethod(1,"Thuan");
        StaticMethod staticMethod2 = new StaticMethod(2,"Bao");
        StaticMethod staticMethod3 = new StaticMethod(3,"Linh");
        staticMethod1.disPlay();
        staticMethod2.disPlay();
        staticMethod3.disPlay();

    }
}
