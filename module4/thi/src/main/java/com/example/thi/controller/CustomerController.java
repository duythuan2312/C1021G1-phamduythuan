package com.example.thi.controller;

import com.example.thi.dto.TransactionDto;
import com.example.thi.model.Transaction;
import com.example.thi.service.ICustomerService;
import com.example.thi.service.ITransactionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    private ITransactionService iTransactionService;
    @Autowired
    private ICustomerService iCustomerService;



    @GetMapping("/list")
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("transactionList",iTransactionService.findAll());
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("transactionDto",new Transaction());
        modelAndView.addObject("customerList",iCustomerService.findAll());
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("transactionDto") TransactionDto transactionDto , BindingResult bindingResult, Model model){
        new TransactionDto().validate(transactionDto,bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("customerList",iCustomerService.findAll());
            return "create";
        }else {
            Transaction transaction = new Transaction();
            BeanUtils.copyProperties(transactionDto,transaction);
            iTransactionService.save(transaction);
        }
        return "redirect:/list";
    }


    @GetMapping("/view/{id}")
    public String view(@PathVariable Long id, Model model){
        Transaction transaction = iTransactionService.findById(id).orElse(null);
        model.addAttribute("transaction",transaction);
        return "view";
    }

    @GetMapping("/delete")
    public String delete(Transaction transaction,Model model){
        iTransactionService.remove(transaction);
        model.addAttribute("message","Xóa Thành Công");
        return "redirect:/list";
    }
//    @PostMapping("/search")
//    public String search(@RequestParam(required = false,defaultValue = "") String search,Model model){
//        model.addAttribute("transactionList",iTransactionService.searchByName(search));
//        return "redirect:/list";
//    }





}
