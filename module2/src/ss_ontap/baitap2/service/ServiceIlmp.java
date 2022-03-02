package ss_ontap.baitap2.service;

import ss_ontap.baitap2.model.Model;

import java.io.*;
import java.util.*;

public class ServiceIlmp implements Service{
    public static final String FILE_NAME = "D:\\codegym1\\module2\\src\\ss_ontap\\baitap2\\data\\File.csv";
    static List<Model> modelList = new ArrayList<>();

    public ServiceIlmp(){
        readFile();
    }

    public static int random(){
        int num = 0;
        Random rd = new Random();
        num = rd.nextInt(25) + 65;
        return num;
    }

    public static String randomChar(){
        String result = "";
        for (int i = 0; i < 5;i++){
            int num = random();
            result += (char) num;
        }
        return result;
    }

    @Override
    public void addNew() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập tên lớp ");
        String className = scanner.nextLine();
        System.out.println("Nhập khóa học");
        String course = scanner.nextLine();
        Model model = new Model(randomChar(),name,dayOfBirth,gender,className,course);
        modelList.add(model);
        writeFile();


    }

    @Override
    public void seach() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mssv cần tìm kiếm");
        String mssv = scanner.nextLine();
        for (int i=0; i<modelList.size();i++){
            if (modelList.get(i).getMSSV().contains(mssv)){
                System.out.println(modelList.get(i));
            }
        }

    }

    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mssv cần xóa");
        String mssv = scanner.nextLine();
        for (int i=0 ; i<modelList.size();i++){
            if (modelList.get(i).getMSSV().contains(mssv)){
                modelList.remove(i);
            }
        }

    }

    @Override
    public void display() {
        for (Model model : modelList){
            System.out.println(model);
        }

    }

    @Override
    public void sort() {
        Collections.sort(modelList);

    }
    public  static  void writeFile(){
        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Model model : modelList){
                bufferedWriter.write(model.getMSSV()+","+model.getName()+","+model.getDayOfBirth()+","+model.getGender()
                +","+model.getClassName()+","+model.getCourse());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void readFile(){
        modelList.clear();
        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data=bufferedReader.readLine())!=null){
                String[] dataA = data.split(",");
                Model model = new Model(dataA[0],dataA[1],dataA[2],dataA[3],dataA[4],dataA[5]);
                modelList.add(model);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
