package com.example.exervise1.controller;

import com.example.exervise1.model.Blog;
import com.example.exervise1.service.IBlogService;
import com.example.exervise1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {
    @Autowired
    private ICategoryService iCategoryService;
    @Autowired
    private IBlogService iBlogService;
    @GetMapping("/list")
    public ModelAndView showBlog(@PageableDefault(value = 1)Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("blog");
        modelAndView.addObject("blogList",iBlogService.findAll(pageable));
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("blogList",new Blog());
        modelAndView.addObject("categoryList",iCategoryService.findAll());
        return modelAndView;
    }
}
