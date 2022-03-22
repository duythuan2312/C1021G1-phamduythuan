package com.example.casestudy.controller;

import com.example.casestudy.dto.CustomerDto;
import com.example.casestudy.dto.EmployeeDto;
import com.example.casestudy.model.customer.Customer;
import com.example.casestudy.model.employee.Employee;
import com.example.casestudy.service.Customer.CustomerService;
import com.example.casestudy.service.Customer.ICustomerTypeService;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private ICustomerTypeService iCustomerTypeService;

    @GetMapping("/customer")
    public ModelAndView showCustomer(@PageableDefault(value = 5)Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customerList",customerService.findAll(pageable));
        return modelAndView;
    }

    @GetMapping("/create-customer")
    public ModelAndView showcreate(){
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customerDto",new CustomerDto());
        modelAndView.addObject("customerType",iCustomerTypeService.findAll());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public String create(@Validated @ModelAttribute("customerDto") CustomerDto customerDto , BindingResult bindingResult, Model model){
        new CustomerDto().validate(customerDto,bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("customerType",iCustomerTypeService.findAll());
            return "customer/create";
        }else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto,customer);
            customerService.save(customer);
        }
        return "redirect:/customer";
    }

    @GetMapping("/remove")
    public String delete(Customer customer, RedirectAttributes redirectAttributes, @RequestParam int id){
        customerService.remove(customer);
        return "redirect:/customer";
    }

    @GetMapping("/update-customer/{id}")
    public ModelAndView showEditForm(@PathVariable Long id, Model model, Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("customer/update");
        model.addAttribute("customerType",iCustomerTypeService.findAll());
        Optional<Customer> customer = customerService.findByID(id);
        CustomerDto customerDto = new CustomerDto();
        BeanUtils.copyProperties(customerDto,customer);
        model.addAttribute("customerDto", customer);
        return modelAndView;
    }

    @PostMapping("/update-customer")
    public String updateProvince(@Valid @ModelAttribute CustomerDto customerDto, BindingResult bindingResult, Model model) {
        new CustomerDto().validate(customerDto,bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("customerType",iCustomerTypeService.findAll());
            return "customer/update";
        }else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto,customer);
            System.out.println(customer.getId());
            customer.setId(customerDto.getId());
            customerService.save(customer);
        }
        return "redirect:/customer";
    }


}
