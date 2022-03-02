package ss12_JavaCollectionFramework.Thuchanh.HashMapandHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Thuận",17,"Quảng Nam");
        Student student2 = new Student("Linh",29,"Quảng Nam");
        Student student3 = new Student("Bảo",26,"Đà nẵng");
        Student student4 = new Student("Đạt",18,"Quảng Trị");
        Student student5 = new Student("Hiếu",25,"Hội An");
        System.out.println("HasdMap-------");
        Map<Integer,Student> myMap = new HashMap<>();
        myMap.put(1,student1);
        myMap.put(2,student2);
        myMap.put(3,student3);
        myMap.put(4,student4);
        myMap.put(5,student5);

        for (Map.Entry<Integer,Student> myStudent : myMap.entrySet()){
            System.out.println(myStudent.toString());
        }
        System.out.println("Hash Set -------");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        for (Student student : students){
            System.out.println(student.toString());
        }



    }
}
