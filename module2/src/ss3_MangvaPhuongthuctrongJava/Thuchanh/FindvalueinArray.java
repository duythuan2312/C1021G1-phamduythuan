package ss3_MangvaPhuongthuctrongJava.Thuchanh;

import java.util.Scanner;

public class FindvalueinArray {
    static String[] student = {"Thuan","Linh","Bao","Loc","Hoang","Chien","Dat","Tien"};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name student:");
        String name = scanner.nextLine();
        boolean check = false;
        for (int i = 0 ; i < student.length ; i++){
            if (student[i].equals(name)){
                System.out.println("Position of the students in the list " + name + " is: " + i);
                check = true;
                break;
            }
        }
        if (check == false){
            System.out.println("Not found" +name+"in the list");
        }
    }
}
