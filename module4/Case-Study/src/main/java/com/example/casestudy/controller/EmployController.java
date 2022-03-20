package com.example.casestudy.controller;

import com.example.casestudy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public ModelAndView showEmployee(Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("employee/list");
        modelAndView.addObject("employeeList",employeeService.findAll(pageable));
        return modelAndView;
    }


}
