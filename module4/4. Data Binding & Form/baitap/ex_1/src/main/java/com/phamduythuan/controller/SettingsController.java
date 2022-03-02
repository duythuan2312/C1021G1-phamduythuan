package com.phamduythuan.controller;

import com.phamduythuan.model.Settings;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/settings")
public class SettingsController {

    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home","settings",new Settings());
        return modelAndView;
    }
    @PostMapping(value = "/submit")
    public String showSettings(@ModelAttribute("settings")Settings settings, Model model){
          model.addAttribute("language",settings.getLanguages());
          model.addAttribute("pageSize",settings.getPageSize());
          model.addAttribute("spamsFilter",settings.getSpamsFilter());
          model.addAttribute("signature",settings.getSignature());
        return "result";
    }
}
