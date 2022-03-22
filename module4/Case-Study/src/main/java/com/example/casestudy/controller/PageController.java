package com.example.casestudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    @GetMapping("")
    public ModelAndView showPage(){
        ModelAndView modelAndView = new ModelAndView("page");
        return modelAndView;
    }


    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("/login");
        return modelAndView;
    }

}
