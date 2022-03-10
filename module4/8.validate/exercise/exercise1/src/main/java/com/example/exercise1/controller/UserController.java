package com.example.exercise1.controller;

import com.example.exercise1.model.User;
import com.example.exercise1.service.UserService;
import com.example.exercise1.validation.UseDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("useDto",new UseDto());
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(@ModelAttribute @Validated UseDto useDto , BindingResult bindingResult, Model model){
        new UseDto().validate(useDto,bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "create";
        }else {
            User user = new User();
            BeanUtils.copyProperties(useDto,user);
            model.addAttribute("message", "Thêm mới thành  công");
            userService.save(user);
        }
        return "create";
    }

}
