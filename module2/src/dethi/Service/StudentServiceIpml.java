package dethi.Service;

import dethi.model.Student;

import java.io.*;
import java.util.*;

public class StudentServiceIpml implements PressonService{
    public static final String STUDENT_CSV = "D:\\codegym1\\module2\\src\\dethi\\data\\Student.csv";
    static List<Student> studentList = new ArrayList<>();

    public StudentServiceIpml(){
        readFile();
    }

    public static int ranDom() {
        Random random = new Random();
        int id = 0;
        id = random.nextInt(10);
        return id;
    }

    public static String randumId() {
        String result = "";
        for (int i = 0; i < 4; i++) {
            result += ranDom() + "";
        }
        return result;
    }


    @Override
    public void addNew() {
        Scanner scanner = new Scanner(System.in);
        String regexDayofBirth = "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}";
        String regexGender = "(Nam|Nữ|Khác)";
        boolean check;
        double scores = 0.0;
        String gender = null;
        String dayOfBirth = null;
        System.out.println("Nhập vào tên học sinh");
        String name = scanner.nextLine();
        do {
            check = false;
            System.out.println("Nhập vào ngày sinh ");
            dayOfBirth = scanner.nextLine();
            if (!dayOfBirth.matches(regexDayofBirth)) {
                check = true;
                System.out.println("Sai định dạng hãy nhập lại");
                continue;
            }
        } while (check);
//        do {
//            check = true;
//            System.out.println("Nhập vào giới tính");
//            gender = scanner.nextLine();
//            if (gender.equals("Nam")||gender.equals("Nữ")||gender.equals("Khác")) {
//                break;
//                }
//
//        }while (check);
        do {
            check = true;
            System.out.println("Nhập vào giới tính");
            gender = scanner.nextLine();
            if (gender.matches(regexGender)) {
                break;
            }
        } while (check);
        System.out.println("Nhập lớp của học sinh");
        String className = scanner.nextLine();
        do {
            check = false;
            try {
                check = false;
                System.out.println("Nhập vào điểm số");
                scores = Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Hãy nhập số");
                check = true;
                continue;
            }if(scores < 0 || scores > 10){
                System.out.println("Điểm phải lớn hơn 0");
                check = true;
                continue;
            }
        }while (check);
        Student student = new Student("SV-"+randumId(),name,dayOfBirth,gender,className,scores);
        studentList.add(student);
        writeFile();

    }

    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id mà bạn muốn xóa .");
        String id = scanner.nextLine();
        for (int i=0 ; i<studentList.size() ;i++){
            if (studentList.get(i).getId().equals(id)){
                System.out.println("Yes or No");
                String yes = scanner.nextLine();
                if (yes.equals("yes")){
                    studentList.remove(i);
                    writeFile();
                    System.out.println("Xóa thành công");
                }else {
                    System.out.println("Xóa không thành công !!!!");
                }

            }
        }
        System.out.println("Không tìm thấy id cần muốn xóa ");


    }

    @Override
    public void displays() {
        for (Student student : studentList){
            System.out.println(student);
        }

    }

    @Override
    public void seach() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên học sinh mà bạn muốn tiềm kiếm");
        String name = scanner.nextLine();
        for (int i=0 ; i<studentList.size() ; i++) {
            if (studentList.get(i).getName().contains(name)) {
                System.out.println(studentList.get(i));
            }
        }

    }
    public static void writeFile(){
        try {
            FileWriter fileWriter = new FileWriter(STUDENT_CSV);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student : studentList){
                bufferedWriter.write(student.getId()
                                       +","+student.getName()
                                       +","+student.getDayOfBirth()
                                       +","+student.getGender()
                                       +","+student.getClassName()
                                       +","+student.getScores());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile(){
        studentList.clear();
        try {
            FileReader fileReader = new FileReader(STUDENT_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine())!=null){
                String[] datanew = data.split(",");
                Student student = new Student(datanew[0],datanew[1],datanew[2],datanew[3],datanew[4],Double.parseDouble(datanew[5]));
                studentList.add(student);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
