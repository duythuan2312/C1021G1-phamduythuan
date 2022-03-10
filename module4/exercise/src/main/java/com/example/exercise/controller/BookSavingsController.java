package com.example.exercise.controller;

import com.example.exercise.model.BookSavings;
import com.example.exercise.model.Customer;
import com.example.exercise.service.IBookSavingService;
import com.example.exercise.validate.BookSavingsDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BookSavingsController {
    @Autowired
    private IBookSavingService iBookSavingService;

    @GetMapping("/list")
    public ModelAndView listBookSavings(Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("list",iBookSavingService.findAll(pageable));
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("bookSavingsDto",new BookSavingsDto());
        return modelAndView;
    }
    @PostMapping("/create")
    public String create(@ModelAttribute @Validated BookSavingsDto bookSavingsDto , BindingResult bindingResult, Model model){
        new BookSavingsDto().validate(bookSavingsDto,bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "create";
        }else {
            BookSavings bookSavings = new BookSavings();
            BeanUtils.copyProperties(bookSavingsDto,bookSavings);
            bookSavings.setCustomer(new Customer());
            bookSavings.getCustomer().setNameCustomer(bookSavingsDto.getNameCustomer());
            model.addAttribute("message", "Thêm mới thành  công");
            iBookSavingService.save(bookSavings);
        }
        return "redirect:/list";
    }
    @GetMapping("/edit")
    public ModelAndView showEdit(Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("update");
        modelAndView.addObject("list",iBookSavingService.findAll(pageable));
        return modelAndView;
    }
    @GetMapping("/delete")
    public String delete(BookSavings bookSavings, RedirectAttributes redirectAttributes, @RequestParam int id){
        System.out.println(id);
        iBookSavingService.delete(bookSavings);
        redirectAttributes.addFlashAttribute("message","Xóa Thành Công");
        return "redirect:/list";

    }

}
