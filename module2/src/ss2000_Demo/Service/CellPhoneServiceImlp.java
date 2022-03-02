package ss2000_Demo.Service;

import ss2000_Demo.Model.Cellphone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CellPhoneServiceImlp implements PhoneService {
    public  static Scanner scanner = new Scanner(System.in);
    public static List<Cellphone> cellphoneList =  new ArrayList<>();
    static {
        Cellphone cellphone = new Cellphone("SamSungA20",1230000,5,"SAMSUNG",
                "HÀN","Đang sữa chữa");
        cellphoneList.add(cellphone);
    }


    @Override
    public void displayPhone() {
        for (Cellphone cellphone : cellphoneList){
            System.out.println(cellphone);
        }

    }

    @Override
    public void addNewPhone() {
        String phoneName = null;
        double prince = 0.0;
        int quantilyti = 0;
        String product = null;
        String portableConntry = null;
        String status = null;
        System.out.println("Input a phone name");
        phoneName = scanner.nextLine();
        System.out.println("Input a prince");
        prince = Double.parseDouble(scanner.nextLine());




    }

    @Override
    public void seach() {

    }

    @Override
    public void remove() {

    }
}
