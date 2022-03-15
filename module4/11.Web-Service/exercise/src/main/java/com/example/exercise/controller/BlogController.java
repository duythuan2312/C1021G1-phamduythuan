package com.example.exercise.controller;

import com.example.exercise.model.Category;
import com.example.exercise.service.ICategoryService;
import com.example.exercise.model.Blog;
import com.example.exercise.service.IBlogService;
import com.example.exercise.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BlogController {
    @Autowired
    private ICategoryService iCategoryService;
    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/blog")
    public ResponseEntity<List<Blog>> showBlog(){
        List<Blog> blogPage = iBlogService.findAll();
        if (blogPage.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @GetMapping("/category")
    public ResponseEntity<List<Category>> showCategory(){
        List<Category> categoryList = iCategoryService.findAll();
        if (categoryList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

//
//    @PostMapping("/blog")
//    public String create(@ModelAttribute Blog blogList, RedirectAttributes redirectAttributes) {
//          iBlogService.save(blogList);
//          redirectAttributes.addFlashAttribute("messages","Thêm Mới Thành Công");
//        return "redirect:/blog";
//    }
//    @GetMapping("/delete/{id}")
//    public String remove(Blog blog,RedirectAttributes redirectAttributes) {
//        iBlogService.remove(blog);
//        redirectAttributes.addFlashAttribute("remove", "Xóa Thành Công dữ liệu");
//        return "redirect:/blog";
//    }
//
//    @GetMapping("/edit/{id}")
//    public ModelAndView showEditForm(@PathVariable Long id) {
//            Optional<Blog> blogList =  iBlogService.findById(id);
//            ModelAndView modelAndView = new ModelAndView("edit");
//          modelAndView.addObject("categoryList",iCategoryService.findAll());
//            modelAndView.addObject("blog", blogList);
//            return modelAndView;
//    }
//
//    @PostMapping("/edit")
//    public String updateProvince(Blog blog) {
//        iBlogService.save(blog);
//        return "redirect:/blog";
//    }



}
