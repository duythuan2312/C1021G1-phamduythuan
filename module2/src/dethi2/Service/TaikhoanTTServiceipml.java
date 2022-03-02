package dethi2.Service;

import dethi.model.Teacher;
import dethi2.model.TaikhoanTT;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TaikhoanTTServiceipml implements Service {
    public static final String TT_CSV = "D:\\codegym1\\module2\\src\\dethi2\\Data\\TaikhoanTT.csv";
    static Scanner scanner = new Scanner(System.in);
    static List<TaikhoanTT> taikhoanTTList = new ArrayList<>();

    public static int ranDom() {
        Random random = new Random();
        int id = 0;
        id = random.nextInt(10);
        return id;
    }

    public static String randumMTK() {
        String result = "";
        for (int i = 0; i < 4; i++) {
            result += ranDom() + "";
        }
        return result;
    }

    @Override
    public void addNew() {
        String name = null;
        String ngayTao = null;
        double soTien = 0;
        String soThe = null;

        System.out.println("Nhập vào tên chủ tài khoản");
        name = scanner.nextLine();
        System.out.println("Nhập ngày tạo tìa khoản dd/mm/yy");
        ngayTao = scanner.nextLine();
        System.out.println("Nhập số thẻ ");
        soThe = scanner.nextLine();
        System.out.println("Nhập số tiền trong tk");
        soTien = Double.parseDouble(scanner.nextLine());
        TaikhoanTT taikhoanTT = new TaikhoanTT(randumMTK(),name,ngayTao,soThe,soTien);
        taikhoanTTList.add(taikhoanTT);
        writeFile();


    }

    @Override
    public void remove() {
        System.out.println("Nhập mã tài khoản bạn muốn xóa");
        String soTk = scanner.nextLine();
        for (int i=0 ; i<taikhoanTTList.size() ;i++){
            if (taikhoanTTList.get(i).getMTK().contains(soTk)){
                System.out.println("Yes or No");
                String yes = scanner.nextLine();
                if (yes.equals("yes")){
                    taikhoanTTList.remove(i);
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
        for (TaikhoanTT taikhoanTT : taikhoanTTList){
            System.out.println(taikhoanTT);
        }

    }

    @Override
    public void seach() {
        System.out.println("Nhập tên chủ tại khoản mà bạn muốn tiềm kiếm");
        String name = scanner.nextLine();
        for (int i=0 ; i<taikhoanTTList.size() ; i++) {
            if (taikhoanTTList.get(i).getNameTK().contains(name)) {
                System.out.println(taikhoanTTList.get(i));
            }
        }

    }
    public static void writeFile(){
        try {
            FileWriter fileWriter = new FileWriter(TT_CSV);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (TaikhoanTT taikhoanTT : taikhoanTTList){
                bufferedWriter.write(taikhoanTT.getId()
                        +","+taikhoanTT.getNameTK()
                        +","+taikhoanTT.getNgayTao()
                        +","+taikhoanTT.getSoThe()
                        +","+taikhoanTT.getSotienTrongTk());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
