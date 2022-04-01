package com.example.casestudy.controller;

import com.example.casestudy.service.dvservice.IHouseService;
import com.example.casestudy.service.dvservice.IVillaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VHRController {
    @Autowired
    private IVillaService iVillaService;
    @Autowired
    private IHouseService iHouseService;
//    @Autowired
//    private IRoomService iRoomService;

    @GetMapping("/service-vila-house-room")
    public ModelAndView showVilla(){
        ModelAndView modelAndView = new ModelAndView("dv/service");
        modelAndView.addObject("villaList",iVillaService.findAll());
        modelAndView.addObject("houseList",iHouseService.findAll());
        return modelAndView;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView error(){
        ModelAndView modelAndView = new ModelAndView("/error");
        return modelAndView;
    }

}
