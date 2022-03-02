package dethi1.service;

import dethi1.model.PaymentAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PaymentAccountServiceIpml implements Service{
    static Scanner  scanner = new Scanner(System.in);
    static List<PaymentAccount> paymentAccountList = new ArrayList<>();

    public static int ranDom() {
        Random random = new Random();
        int MTK = 0;
        MTK = random.nextInt(10);
        return MTK;
    }

    public static String randumMTK() {
        String result = "";
        for (int i = 0; i < 7; i++) {
            result += ranDom() + "";
        }
        return result;
    }

    @Override
    public void displays() {

    }

    @Override
    public void remove() {

    }

    @Override
    public void seach() {

    }

    @Override
    public void addNew() {
        String name = null;

        System.out.println("Nhập tên chủ tài khoản thanh toán.. ");
        name = scanner.nextLine();
        System.out.println("Nhập ngày tạo tài khoản...");



    }
}
