package com.example.casestudy.controller;

import com.example.casestudy.dto.EmployeeDto;
import com.example.casestudy.dto.ServiceDto;
import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.model.employee.Employee;
import com.example.casestudy.model.service.Service;
import com.example.casestudy.service.ServiceService.IRentTypeService;
import com.example.casestudy.service.ServiceService.IService;
import com.example.casestudy.service.ServiceService.IServiceTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class ServieController {
    @Autowired
    private IService iService;
    @Autowired
    private IServiceTypeService iServiceTypeService;

    @Autowired
    private IRentTypeService iRentTypeService;


    @GetMapping("/service")
    public ModelAndView showService(Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("/service/list");
        modelAndView.addObject("serviceList",iService.findAll(pageable));
        return modelAndView;
    }

  @GetMapping("/create-service")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("service/create");
        modelAndView.addObject("serviceDto",new ServiceDto());
        modelAndView.addObject("rentTypes",iRentTypeService.findAll());
        modelAndView.addObject("serviceTypes",iServiceTypeService.findAll());
        return modelAndView;
  }


    @PostMapping("/create-service")
    public String create(@Validated @ModelAttribute("serviceDto") ServiceDto serviceDto , BindingResult bindingResult, Model model){
        new ServiceDto().validate(serviceDto,bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("rentTypes",iRentTypeService.findAll());
            model.addAttribute("serviceTypes",iServiceTypeService.findAll());
            return "service/create";
        }else {
            Service service = new Service();
            BeanUtils.copyProperties(serviceDto,service);
            iService.save(service);
        }
        return "redirect:/service";
    }

    @GetMapping("/search-service")
    public ModelAndView searhCustomer(@PageableDefault(value = 10) Pageable pageable, @RequestParam String nameService){
        ModelAndView modelAndView = new ModelAndView("service/list");
        modelAndView.addObject("serviceList",iService.findByName(pageable,nameService));
        return modelAndView;

    }

    @ExceptionHandler(Exception.class)
    public ModelAndView error(){
        ModelAndView modelAndView = new ModelAndView("/error");
        return modelAndView;
    }



}
