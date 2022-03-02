package ss13_SearchAlgorithm.Baitap;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class AscendingChain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào một chuỗi ....: ");
        String string = scanner.nextLine();

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> newList = new LinkedList<>();

            newList.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > newList.getLast()) {
                    newList.add(string.charAt(j));
                }
            }
            if (newList.size() > list.size()) {
                list.clear();
                list.addAll(newList);
            }
            newList.clear();
        }
        for (Character ch : list) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
