package com.example.module4.controller;

import com.example.module4.dto.ProductDto;
import com.example.module4.model.Product;
import com.example.module4.service.IProductService;
import com.example.module4.service.IProductTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @Autowired
    private IProductTypeService iProductTypeService;

    @GetMapping("/product")
    public ModelAndView showList(@PageableDefault(value = 5) Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("productList",iProductService.findAll(pageable));
        return modelAndView;
    }


    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("productDto",new ProductDto());
        modelAndView.addObject("productTypeList",iProductTypeService.findAll());

        return modelAndView;
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("productDto") ProductDto productDto , BindingResult bindingResult,
                         Model model, RedirectAttributes redirectAttributes){
        new ProductDto().validate(productDto,bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("productTypeList",iProductTypeService.findAll());
            return "create";
        }else {
            Product product = new Product();
            BeanUtils.copyProperties(productDto,product);
            redirectAttributes.addFlashAttribute("message","Thêm mới thành công");
            iProductService.save(product);
        }
        return "redirect:/product";
    }

    @GetMapping("/update/{id}")
    public ModelAndView showEditForm(@PathVariable Long id, Model model, Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("update");
        model.addAttribute("productDto",iProductService.findAll(pageable));
        model.addAttribute("productTypeList",iProductTypeService.findAll());
        Optional<Product> product = iProductService.findByID(id);
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(productDto,product);
        model.addAttribute("productDto", product);
        return modelAndView;
    }

    @PostMapping("/update-product")
    public String updateProvince(@Valid @ModelAttribute ProductDto productDto, BindingResult bindingResult,
                                 Model model,RedirectAttributes redirectAttributes) {
        new ProductDto().validate(productDto,bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("productTypeList",iProductTypeService.findAll());
            return "update";
        }else {
            Product product = new Product();
            BeanUtils.copyProperties(productDto,product);
            System.out.println(product.getId());
            product.setId(productDto.getId());
            redirectAttributes.addFlashAttribute("messages","Chỉnh sửa thành công");
            iProductService.save(product);
        }
        return "redirect:/product";
    }


    @GetMapping("/search-name")
    public ModelAndView searchName(@PageableDefault(value = 5) Pageable pageable, @RequestParam String nameProduct){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("productList",iProductService.findAllByNameProductContaining(nameProduct,pageable));
        return modelAndView;
    }

    @GetMapping("/search-price")
    public ModelAndView searchPrice(@PageableDefault(value = 5) Pageable pageable, @RequestParam String price){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("productList",iProductService.findAllByNameProductContaining(price,pageable));
        return modelAndView;
    }

    @GetMapping("/delete")
    public String delete(Product product, RedirectAttributes redirectAttributes){
        iProductService.remove(product);
        redirectAttributes.addFlashAttribute("message","Xóa Thành Công");
        return "redirect:/product";
    }






}
