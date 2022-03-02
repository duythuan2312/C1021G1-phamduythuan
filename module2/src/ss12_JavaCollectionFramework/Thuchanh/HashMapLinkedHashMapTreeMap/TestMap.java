package ss12_JavaCollectionFramework.Thuchanh.HashMapLinkedHashMapTreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Linh",30);
        hashMap.put("Bảo",31);
        hashMap.put("Hiếu",29);
        hashMap.put("Thuận",28);
        System.out.println("Hiển thị HashMap :");
        System.out.println(hashMap);

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Hiển thị treeMap:");
        System.out.println(treeMap);

         Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75F,true);
        linkedHashMap.put("Bảo", 30);
        linkedHashMap.put("Thuận", 17);
        linkedHashMap.put("Đạt", 18);
        linkedHashMap.put("Linh", 29);
        for (Map.Entry<String,Integer> linked : linkedHashMap.entrySet()){
            System.out.println("Tuổi của các bạn " +linked.getKey()+ " là :"+linked.getValue());
        }

    }
}
