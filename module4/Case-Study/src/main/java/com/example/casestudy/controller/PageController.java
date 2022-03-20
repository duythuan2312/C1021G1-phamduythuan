package com.example.casestudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/url")
public class PageController {
    @GetMapping("/page")
    public ModelAndView showPage(){
        ModelAndView modelAndView = new ModelAndView("page");
        return modelAndView;
    }

}
