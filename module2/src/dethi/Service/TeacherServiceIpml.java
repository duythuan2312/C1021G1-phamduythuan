package dethi.Service;

import dethi.model.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TeacherServiceIpml implements PressonService{
    public static final String TEACHER_CSV = "D:\\codegym1\\module2\\src\\dethi\\data\\Teacher.csv";
   static List<Teacher> teacherList = new ArrayList<>();

   public TeacherServiceIpml(){
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
        boolean check;
        String gender = null;
        String dayOfBirth = null;
        System.out.println("Nhập vào tên giảng viên");
        String name = scanner.nextLine();
       do {
           check = false;
           System.out.println("Nhập vào ngày sinh dd/mm/yy ");
           dayOfBirth = scanner.nextLine();
           if (!dayOfBirth.matches(regexDayofBirth)){
               check = true;
               System.out.println("Sai định dạng hãy nhập lại..");
               continue;
           }
       }while (check);
        do {
              check = true;
              System.out.println("Nhập vào giới tính");
              gender = scanner.nextLine();
              if (gender.equals("Nam")||gender.equals("Nữ")||gender.equals("Khác")) {
                  break;
              }
        }while (check);
        System.out.println("Nhập vào chuyên môn của giảng viên");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher("GV-"+randumId(),name,dayOfBirth,gender,specialize);
        teacherList.add(teacher);
        writeFile();


    }

    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id mà bạn muốn xóa .");
        String id = scanner.nextLine();
        for (int i=0 ; i<teacherList.size() ;i++){
            if (teacherList.get(i).getId().equals(id)){
                System.out.println("Yes or No");
                String yes = scanner.nextLine();
                if (yes.equals("yes")){
                    teacherList.remove(i);
                    writeFile();
                    System.out.println("Xóa thành công");
                }else {
                    System.out.println("Xóa không thành công !!!!");
                }

            }
        }


    }


    @Override
    public void displays() {
    for (Teacher teacher : teacherList){
        System.out.println(teacher);
    }

    }

    @Override
    public void seach() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên giảng viên mà bạn muốn tiềm kiếm");
        String name = scanner.nextLine();
        for (int i=0 ; i<teacherList.size() ; i++){
            if (teacherList.get(i).getName().contains(name)){
                System.out.println(teacherList.get(i));
            }
        }
    }
    public static void writeFile(){
        try {
            FileWriter fileWriter = new FileWriter(TEACHER_CSV);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Teacher teacher : teacherList){
                bufferedWriter.write(teacher.getId()
                                     +","+teacher.getName()
                                     +","+teacher.getDayOfBirth()
                                     +","+teacher.getGender()
                                     +","+teacher.getSpecialize());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile(){
        teacherList.clear();
        try {
            FileReader fileReader = new FileReader(TEACHER_CSV);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine())!=null){
                String[] dataA = data.split(",");
                Teacher teacher = new Teacher(dataA[0],dataA[1],dataA[2],dataA[3],dataA[4]);
                teacherList.add(teacher);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
