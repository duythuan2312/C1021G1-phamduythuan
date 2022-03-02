package ss17_BinaryFileSerialization.thuchanh.thuchanh2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToObject(String path , List<Student> students) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(students);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public static List<Student> readDataFromFile(String path) throws IOException, ClassNotFoundException {
        List<Student> students = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        students = (List<Student>) objectInputStream.readObject();

         objectInputStream.close();
         fileInputStream.close();

               return students;

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Student> student = new ArrayList<>();
        student.add(new Student(1,"Thuận","QN"));
        student.add(new Student(2,"Bảo","Dn"));
        student.add(new Student(3,"Linh","DN"));
        student.add(new Student(4,"Hoàng","QT"));
        writeToObject("D:\\codegym1\\module2\\src\\ss17_BinaryFileSerialization\\thuchanh\\thuchanh2\\sutden.txt",student);
        List<Student> students = readDataFromFile("D:\\codegym1\\module2\\src\\ss17_BinaryFileSerialization\\thuchanh\\thuchanh2\\sutden.txt");
        for(Student student1 : students){
            System.out.println(student1);
        }
    }
}
