package ss11_StackQueue.baitap.Map;

import java.util.Map;
import java.util.Scanner;

public class TreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi....");
        String string = scanner.nextLine();
        Character character;
        Map<Character,Integer>  treeMap = new java.util.TreeMap<>();
        for(int i = 0 ; i < string.length() ; i++){
            character = string.charAt(i);
            if (treeMap.containsKey(character)){
                int count = treeMap.get(character);
                treeMap.put(character,count+1);
            }else {
                treeMap.put(character,1);
            }
        }
        System.out.println(treeMap);
    }

}
