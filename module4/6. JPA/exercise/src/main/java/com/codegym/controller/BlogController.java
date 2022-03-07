package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/list")
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("list");
        List<Blog> blog =  iBlogService.findAll();
        modelAndView.addObject("blog",blog);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("blogcreate",new Blog());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public String save( Blog blog){
        iBlogService.save(blog);
        return "redirect:/list";
    }
    @GetMapping("/edit-blog/{id}")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Blog blog = iBlogService.findById(id);
            ModelAndView modelAndView = new ModelAndView("edit");
            modelAndView.addObject("blog", blog);
            return modelAndView;
    }

    @PostMapping("/edit-blog")
    public String updateCustomer( Blog blog) {
        iBlogService.save(blog);
        return "redirect:/list";
    }
    @GetMapping("/remove/{id}")
    public String remove(Blog blog){
        iBlogService.remove(blog.getId());
        return "redirect:/list";
    }
}
