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


import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @GetMapping("/blog")
    public ResponseEntity<List<Blog>> showBlog(){
        List<Blog> blogPage = iBlogService.findAll();
        if (blogPage.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(blogPage,HttpStatus.OK);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Blog>> showAllBlog(@PathVariable Long id){
        Optional<Blog> blogPage = iBlogService.findById(id);
        if (blogPage == null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(blogPage,HttpStatus.OK);
        }
    }






}
