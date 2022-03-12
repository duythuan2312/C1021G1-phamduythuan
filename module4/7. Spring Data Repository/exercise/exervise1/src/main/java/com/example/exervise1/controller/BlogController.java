package com.example.exervise1.controller;

import com.example.exervise1.model.Blog;
import com.example.exervise1.service.IBlogService;
import com.example.exervise1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlogController {
    @Autowired
    private ICategoryService iCategoryService;
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/blog")
    public ModelAndView showBlog(@PageableDefault(value = 3)Pageable pageable){
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


    @PostMapping("/blog")
    public String create(@ModelAttribute Blog blogList, RedirectAttributes redirectAttributes) {
          iBlogService.save(blogList);
          redirectAttributes.addFlashAttribute("messages","Thêm Mới Thành Công");
        return "redirect:/blog";
    }
    @GetMapping("/delete/{id}")
    public String remove(Blog blog,RedirectAttributes redirectAttributes) {
        iBlogService.remove(blog);
        redirectAttributes.addFlashAttribute("remove", "Xóa Thành Công dữ liệu");
        return "redirect:/blog";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable int id) {
            Blog blogList =  iBlogService.findById(id);
            ModelAndView modelAndView = new ModelAndView("edit");
          modelAndView.addObject("categoryList",iCategoryService.findAll());
            modelAndView.addObject("blog", blogList);
            return modelAndView;
    }

    @PostMapping("/edit")
    public String updateProvince(Blog blog) {
        iBlogService.save(blog);
        return "redirect:/blog";
    }



}
