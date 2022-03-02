package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import sun.misc.Contended;

@Controller
public class CaculateController {
    @GetMapping("/caculate")
    public String showCaculate(){
        return "caculate";
    }
    @PostMapping("/tinh")
    public ModelAndView sandWich(@RequestParam(required = false) double name1,double name2,String caculate){
       ModelAndView modelAndView = new ModelAndView("caculate");
       double result = 0;
           switch (caculate){
               case "+":
                    result = name1 + name2;
                   break;
               case "-":
                   result = name1 - name2;
                   break;
               case "X":
                    result = name1 * name2;
                   break;
               case "/":
                   result = name1/name2;
                   break;
           }
           modelAndView.addObject("result",result);

       return modelAndView;

    }
}
