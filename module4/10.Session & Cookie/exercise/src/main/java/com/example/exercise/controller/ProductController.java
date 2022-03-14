package com.example.exercise.controller;

import com.example.exercise.dto.CartDto;
import com.example.exercise.dto.ProductDto;
import com.example.exercise.model.Product;
import com.example.exercise.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Optional;
@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;

    @ModelAttribute("cart")
    public CartDto setupCart() {
        return new CartDto();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("/shop");
        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }
    @GetMapping("/view")
    public ModelAndView view(Model model,@CookieValue(value = "idProduct",defaultValue = "-1") Long idProduct){
        if (idProduct!=-1){
            model.addAttribute("historyProduct",productService.findById(idProduct));
        }
        ModelAndView modelAndView = new ModelAndView("view");

        modelAndView.addObject("products", productService.findAll());
        return modelAndView;
    }
    @GetMapping("/shop/{id}")
    public ModelAndView showDetail(@PathVariable Long id, HttpServletResponse response){
        Cookie cookie = new Cookie("products",id+"");
        cookie.setMaxAge(60*60*24*1);
        cookie.setPath("/");
        return new ModelAndView("view","products",productService.findById(id).get());

    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @SessionAttribute("cart") CartDto cartDto,@RequestParam(value = "action", required = false)String action) {
        Optional<Product> productOptional = productService.findById(id);
      if (productOptional.isPresent() || action.equals("show")){
          ProductDto productDto = new ProductDto();
          BeanUtils.copyProperties(productOptional.get(),productDto);
          cartDto.addProduct(productDto);
      }

      return "redirect:/cart";
    }

    @GetMapping("/remove/{id}")
    public String removeToCart(@PathVariable Long id, @SessionAttribute("cart") CartDto cartDto,@RequestParam(value = "action", required = false)String action) {
        Optional<Product> productOptional = productService.findById(id);
        if (productOptional.isPresent() || action.equals("remove")){
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(productOptional.get(),productDto);
            cartDto.removeProduct(productDto);
        }

        return "redirect:/cart";
    }
}