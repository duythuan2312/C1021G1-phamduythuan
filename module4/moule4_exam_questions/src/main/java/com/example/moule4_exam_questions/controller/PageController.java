package com.example.moule4_exam_questions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("/login");
        return modelAndView;
    }
    @GetMapping("")
    public ModelAndView showPage(){
      ModelAndView modelAndView = new ModelAndView("page");
      return modelAndView;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView error(){
        ModelAndView modelAndView = new ModelAndView("/error");
        return modelAndView;
    }
}
