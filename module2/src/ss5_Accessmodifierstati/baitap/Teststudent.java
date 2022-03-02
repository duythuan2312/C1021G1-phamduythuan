package ss5_Accessmodifierstati.baitap;

public class Teststudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Thuan");
        System.out.println(student.getName());
        student.setClasses("C1021G1");
        System.out.println(student.getClasses());

    }
}
