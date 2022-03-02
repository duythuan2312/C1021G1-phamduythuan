package ss_ontap.service;

import ss_ontap.module.Candiddex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidexServiceIlmp implements CandidexService{
    public static final String DATA_CSV = "D:\\codegym1\\module2\\src\\ss_ontap\\module\\Data.csv";
    static List<Candiddex> candiddexList = new ArrayList<>();

    @Override
    public void addNew() {
        Scanner scanner = new Scanner(System.in);
        double toan = 0;
        double van= 0;
        double anh = 0;
        boolean check;
        System.out.println("Input a name:");
        String name = scanner.nextLine();
        System.out.println("Input a ngày tháng năm sinh");
        String dayOfBirth = scanner.nextLine();
       do {
           check = true;
           try {
               check = true;
               System.out.println("Input diem toán");
               toan = Double.parseDouble(scanner.nextLine());
               System.out.println("Nhập điểm văn");
               van = Double.parseDouble(scanner.nextLine());
               System.out.println("Nhập điểm anh ");
               anh = Double.parseDouble(scanner.nextLine());
               break;
           }catch (NumberFormatException e){
               System.out.println("Hãy nhập số");
               check = true;
               continue;
           }
       }while (check);
        Candiddex candiddex = new Candiddex(name,dayOfBirth,toan,van,anh);
        candiddexList.add(candiddex);
        try {
            fileWrite();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void display() {
        for (Candiddex candiddex : candiddexList) {
            if (candiddex.getSum() > 15) {
                System.out.println(candiddex);
            }
        }
    }
    public static void fileWrite() throws IOException {
        FileWriter fileWriter = new FileWriter(DATA_CSV);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Candiddex candiddex :candiddexList){
            bufferedWriter.write(candiddex.getId()+","
                                   +candiddex.getName()+","
                                   +candiddex.getDayOfBirth()+","
                                   +candiddex.getToan()+","
                                   +candiddex.getVan()+","
                                   +candiddex.getAnh());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }
}
