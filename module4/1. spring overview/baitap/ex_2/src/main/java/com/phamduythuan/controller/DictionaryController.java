package com.phamduythuan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.phamduythuan.service.LanguageServiceipml;

import java.util.Map;

@Controller
public class DictionaryController {
  @Autowired
  LanguageServiceipml languageServiceipml;
    @GetMapping ("/")
    public String home(){
          return "home";
    }
    @GetMapping("/convert")
    public String convert(@RequestParam String english, Model model){
        String result = languageServiceipml.checkWord(english);
        model.addAttribute("result",result);
        return "home";
    }
}
