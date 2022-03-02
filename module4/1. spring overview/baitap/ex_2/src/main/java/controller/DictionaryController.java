package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DictionaryController {
   Word word = new Word();
   Map<String,String> stringMap = word.mapWord();
    @GetMapping ("/")
    public String home(){
          return "home";
    }
    @GetMapping("/convert")
    public String convert(@RequestParam String english, Model model){
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
           if (entry.getKey().equals(english)){
               model.addAttribute("vietnamese",entry.getValue());
           }else {
               model.addAttribute("message","Không tìm thấy!!!");
           }
        }
        return "home";
    }
}
