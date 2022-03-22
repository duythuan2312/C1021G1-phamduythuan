package com.example.casestudy.controller;

import com.example.casestudy.service.ServiceService.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ServieController {
    @Autowired
    private IService iService;

    @GetMapping("/service")
    public ModelAndView showService(Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("/service/list");
        modelAndView.addObject("serviceList",iService.findAll(pageable));
        return modelAndView;
    }

  @GetMapping("/create-service")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("service/create");
        return modelAndView;

  }
}
