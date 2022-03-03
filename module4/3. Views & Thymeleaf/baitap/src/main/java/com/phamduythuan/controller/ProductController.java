package com.phamduythuan.controller;

import com.phamduythuan.model.Product;
import com.phamduythuan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
 @Autowired
    ProductService productService;
 @GetMapping("")
    public String list(Model model){
     List<Product> productList = productService.findAll();
     model.addAttribute("products",productList);
     return "list";
 }

 @GetMapping("/create")
    public String showcreate(Model model){
     model.addAttribute("product",new Product());
     return "create";
 }


 @PostMapping("/save")
    public String create(Product product){
     product.setId((int) (Math.random() * 1000));
     productService.create(product);
     return "redirect:/products";
 }
 @GetMapping("{id}/remove")
    public String remove(@PathVariable int id, RedirectAttributes redirectAttributes){
     productService.remove(id);
     redirectAttributes.addFlashAttribute("message","Remove Ok");
     return "redirect:/products";

 }
 @GetMapping("{id}/update")
    public String showUpdate(@PathVariable int id, Model model){
     model.addAttribute("product",productService.findById(id));
     return "update";
 }

 @PostMapping("/update")
    public String update(Product product){
     productService.update(product.getId(),product);
     return "redirect:/products";
 }
 @GetMapping("{id}/view")
    public String view(@PathVariable int id,Model model){
     model.addAttribute("product",productService.findById(id));
     return "view";


 }
 @PostMapping("/search")
    public String search(@RequestParam String nameProduct, Model model){
     model.addAttribute("products",productService.search(nameProduct));
     return "list";

 }

}
