package com.example.exercise.controller;

import com.example.exercise.model.Book;
import com.example.exercise.service.IBookCodeService;
import com.example.exercise.service.IBookServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    IBookServiceRepository iBookServiceRepository;
    @Autowired
    IBookCodeService iBookCodeService;
    @GetMapping("/list")
    public ModelAndView showBook(Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("list",iBookServiceRepository.findAll(pageable));
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("createBook",new Book());
        return modelAndView;

    }

    @PostMapping("/create")
    public String create(@ModelAttribute("createBook") Book book,Model model){
        iBookServiceRepository.save(book);
        return "redirect:/list";
    }

    @GetMapping("/detils/{id}")
    public ModelAndView viewBook(@PathVariable int id){
        Optional<Book> book = iBookServiceRepository.findById(id);
        ModelAndView modelAndView = new ModelAndView("book");
        modelAndView.addObject("bookcode",iBookCodeService.findAll());
        if (book.isPresent()) {
            modelAndView.addObject("book", book.get());
            return modelAndView;
        }else {
            return new ModelAndView("error");
        }


    }
    @PostMapping("/detils")
    public String detils(@ModelAttribute Book book, RedirectAttributes redirectAttributes){

        return "quantity";

    }

    @ExceptionHandler(Exception.class)
    public String sos(){
        return "error";
    }



}
