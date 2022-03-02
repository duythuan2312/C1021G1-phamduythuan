package ss3_MangvaPhuongthuctrongJava.Baitap;

import java.util.Scanner;

public class CountCharacterstring {
    static int count = 0;
    static String str;
    static char character;
    static Scanner scanner = new Scanner(System.in);
    public static int SoKiTu(){
        char[] string = str.toCharArray();
        for (int i = 0;i < string.length;i++){
            if (character == string[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi để kiểm tra: ");
        str = scanner.nextLine();
        System.out.print("Chuỗi nhập vào là: " + "'" + str + "'");
        System.out.println();
        System.out.print("Nhập vào kí tự cần kiểm tra: ");
        character = scanner.next().charAt(0);
        int countChar = SoKiTu();
        System.out.print("Số kí tự xuất hiện là: " + countChar);
    }

}
