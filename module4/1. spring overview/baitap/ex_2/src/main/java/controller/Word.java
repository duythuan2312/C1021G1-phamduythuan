package controller;

import java.util.HashMap;
import java.util.Map;

public class Word {
    public Map<String,String> mapWord(){
        Map<String,String> stringMap = new HashMap<>();
              stringMap.put("Name","Tên");
              stringMap.put("Because","Bởi vì");
              stringMap.put("Hello","Xin chào");
              stringMap.put("Syntax","Cú pháp");
              stringMap.put("Information technology","Công nghệ thông tin");

              return stringMap;

    }

}
