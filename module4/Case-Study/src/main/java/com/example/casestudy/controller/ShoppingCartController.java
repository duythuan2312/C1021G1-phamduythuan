package com.example.casestudy.controller;

import com.example.casestudy.dto.CartDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cart")
public class ShoppingCartController {
    @RequestMapping
    public ModelAndView showCart(@SessionAttribute(name = "cart",required = false)CartDto cartDto){
        return new ModelAndView("cart","cart",cartDto);
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView error(){
        ModelAndView modelAndView = new ModelAndView("/error");
        return modelAndView;
    }

}
