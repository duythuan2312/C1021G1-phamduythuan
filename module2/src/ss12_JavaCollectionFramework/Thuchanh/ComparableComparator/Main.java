package ss12_JavaCollectionFramework.Thuchanh.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Lê Thanh Phèo",17,"Quang Nam");
        Student student2 = new Student("Lê Thị Nở",19,"Huế");
        Student student3 = new Student("Nam Cao",18,"Đà Nẵng");

        List<Student> myStudent = new ArrayList<>();
        myStudent.add(student1);
        myStudent.add(student2);
        myStudent.add(student3);
        Collections.sort(myStudent);
        for (Student student : myStudent){
            System.out.println(student.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(myStudent,ageComparator);
        System.out.println("So sách theo tuổi:");
        for (Student student: myStudent ){
            System.out.println(student.toString());
        }

    }
}
