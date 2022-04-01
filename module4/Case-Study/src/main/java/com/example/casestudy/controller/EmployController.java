package com.example.casestudy.controller;

import com.example.casestudy.dto.EmployeeDto;
import com.example.casestudy.model.employee.Employee;
import com.example.casestudy.service.employee.EmployeeService;
import com.example.casestudy.service.employee.IDivisionService;
import com.example.casestudy.service.employee.IEducationService;
import com.example.casestudy.service.employee.IPositionService;
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
public class EmployController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private IPositionService iPositionService;
    @Autowired
    private IEducationService iEducationService;
    @Autowired
    private IDivisionService iDivisionService;



    @GetMapping("/employee")
    public ModelAndView showEmployee(@PageableDefault(value = 5) Pageable pageable){
        ModelAndView modelAndView = new ModelAndView("employee/list");
        modelAndView.addObject("employeeList",employeeService.findAll(pageable));
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView showcreate(){
        ModelAndView modelAndView = new ModelAndView("employee/create");
        modelAndView.addObject("employeeDto",new EmployeeDto());
        modelAndView.addObject("positionList",iPositionService.findAll());
        modelAndView.addObject("divisionList",iDivisionService.findAll());
        modelAndView.addObject("educationList",iEducationService.findAll());
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(@Validated @ModelAttribute("employeeDto") EmployeeDto employeeDto ,BindingResult bindingResult,Model model){
        new EmployeeDto().validate(employeeDto,bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("positionList",iPositionService.findAll());
            model.addAttribute("divisionList",iDivisionService.findAll());
            model.addAttribute("educationList",iEducationService.findAll());
            return "employee/create";
        }else {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDto,employee);
            employeeService.save(employee);
        }
        return "redirect:/employee";
    }

    @GetMapping("/delete")
    public String delete(Employee employee, RedirectAttributes redirectAttributes){
        employeeService.remove(employee);
        redirectAttributes.addFlashAttribute("message","Xóa Thành Công");
        return "redirect:/employee";
    }

    @GetMapping("/update/{id}")
    public ModelAndView showEditForm(@PathVariable Long id,Model model,Pageable pageable) {
     ModelAndView modelAndView = new ModelAndView("employee/update");
       model.addAttribute("employeeDto",employeeService.findAll(pageable));
        model.addAttribute("positionList",iPositionService.findAll());
        model.addAttribute("divisionList",iDivisionService.findAll());
        model.addAttribute("educationList",iEducationService.findAll());
        Optional<Employee> employee = employeeService.findByID(id);
        EmployeeDto employeeDto = new EmployeeDto();
        BeanUtils.copyProperties(employeeDto,employee);
        model.addAttribute("employeeDto", employee);
        return modelAndView;
    }

    @PostMapping("/update-employee")
    public String updateProvince(@Valid @ModelAttribute EmployeeDto employeeDto,BindingResult bindingResult,Model model) {
        new EmployeeDto().validate(employeeDto,bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("positionList",iPositionService.findAll());
            model.addAttribute("divisionList",iDivisionService.findAll());
            model.addAttribute("educationList",iEducationService.findAll());
            return "employee/update";
        }else {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeDto,employee);
            System.out.println(employee.getId());
            employee.setId(employeeDto.getId());
            employeeService.save(employee);
        }
        return "redirect:/employee";
    }
    @GetMapping("/search-employee")
    public ModelAndView searhCustomer(@PageableDefault(value = 5) Pageable pageable,@RequestParam String nameEmployee){
        ModelAndView modelAndView = new ModelAndView("employee/list");
        modelAndView.addObject("employeeList",employeeService.findByName(pageable,nameEmployee));
        return modelAndView;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView error(){
        ModelAndView modelAndView = new ModelAndView("/error");
        return modelAndView;
    }


}
