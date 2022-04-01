package com.example.casestudy.controller;

import com.example.casestudy.dto.ContracDto;
import com.example.casestudy.model.contract.Contract;
import com.example.casestudy.service.Customer.CustomerService;
import com.example.casestudy.service.ServiceService.IService;
import com.example.casestudy.service.contract.IContractService;
import com.example.casestudy.service.employee.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContractController {

    @Autowired
    private IContractService iContractService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private IService iService;


    @GetMapping("/contract")
    public ModelAndView showContract(Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("contract/list");
        modelAndView.addObject("contractList",iContractService.findAll(pageable));
        return modelAndView;
    }

    @GetMapping("/create-contract")
    public ModelAndView showcreate(Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("contract/create");
        modelAndView.addObject("contractDto",new ContracDto());
        modelAndView.addObject("employeeList",employeeService.findAll(pageable));
        modelAndView.addObject("customerList",customerService.findAll(pageable));
        modelAndView.addObject("serviceList",iService.findAll(pageable));
        return modelAndView;
    }

    @PostMapping("/create-contract")
    public String create(@Validated @ModelAttribute("contractDto") ContracDto contracDto , BindingResult bindingResult, Model model,Pageable pageable){
        new ContracDto().validate(contracDto,bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("employeeList",employeeService.findAll(pageable));
            model.addAttribute("customerList",customerService.findAll(pageable));
            model.addAttribute("serviceList",iService.findAll(pageable));
            return "contract/create";
        }else {
            Contract contract = new Contract();
            BeanUtils.copyProperties(contracDto,contract);
            iContractService.save(contract);
        }
        return "redirect:/contract";
    }



    @ExceptionHandler(Exception.class)
    public ModelAndView error(){
        ModelAndView modelAndView = new ModelAndView("/error");
        return modelAndView;
    }

}
