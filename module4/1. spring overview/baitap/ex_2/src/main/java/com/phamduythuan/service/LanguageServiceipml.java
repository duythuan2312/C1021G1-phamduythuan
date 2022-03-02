package com.phamduythuan.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class LanguageServiceipml implements LanguageService{
    public Map<String, String> word() {
        Map<String,String> stringMap = new HashMap<>();
        stringMap.put("Name","Tên");
        stringMap.put("Because","Bởi vì");
        stringMap.put("Hello","Xin chào");
        stringMap.put("Syntax","Cú pháp");
        stringMap.put("Information technology","Công nghệ thông tin");
        return stringMap;
    }

    @Override
    public String checkWord(String english) {
        Map<String,String> stringMap = word();
        for (Map.Entry<String,String> entry : stringMap.entrySet()) {
            if (entry.getKey().equals(english)){
                return entry.getValue();
            }
        }
        return "Khong tim thay !!";
    }
}
