package com.phamduythuan.controller;

import com.phamduythuan.model.Declaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class ControllerDeclaration {
     @GetMapping("/list")
    public ModelAndView hom(){
       ModelAndView modelAndView = new ModelAndView("home","declaration",new Declaration());
       return modelAndView;
     }
     @PostMapping("/submit")
    public String declaration(@ModelAttribute("declaration")Model model, Declaration declaration){

         return "home";
     }
}
