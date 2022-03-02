package controller;

import model.customer.Customer;
import model.employee.Division;
import model.employee.Education;
import model.employee.Employee;
import model.employee.Possition;
import service.implEmployee.DivisionServiceImpl;
import service.implEmployee.EducationServiceImpl;
import service.implEmployee.EmployeeServiceImpl;
import service.implEmployee.PossitionServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletEmployee", value = "/employee")
public class ServletEmployee extends HttpServlet {
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    PossitionServiceImpl possitionService = new PossitionServiceImpl();
    EducationServiceImpl educationService = new EducationServiceImpl();
    DivisionServiceImpl divisionService = new DivisionServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreate(request, response);
                break;
            case "update":
                showUpdate(request,response);
                break;
            default:
                listEmployee(request,response);
                break;

        }
    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Employee employee = employeeService.selectId(id);
        request.setAttribute("list",employee);
        try {
            request.getRequestDispatcher("employee/update.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void listEmployee(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = employeeService.finAll();
        request.setAttribute("employeeList",employeeList);
        try {
            request.getRequestDispatcher("employee/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) {
        List<Possition> possitionList = possitionService.finAll();
        List<Education> educationList = educationService.finAll();
        List<Division> divisionList = divisionService.finAll();
        request.setAttribute("possitionList",possitionList);
        request.setAttribute("educationList",educationList);
        request.setAttribute("divisionList",divisionList);
        try {
            request.getRequestDispatcher("employee/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createEmployee(request, response);
                break;
            case "delete":
                deleteEmployee(request,response);
                break;
            case "search":
                search(request,response);
                break;
            case "update":
                updateEmployee(request,response);
                break;

        }
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        List<Employee> employeeList = employeeService.searchName(name);
        request.setAttribute("employeeList",employeeList);
        try {
            request.getRequestDispatcher("employee/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String idcard = request.getParameter("card");
        Double salary = Double.valueOf(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int possition = Integer.parseInt(request.getParameter("possition"));
        int education = Integer.parseInt(request.getParameter("education"));
        int division = Integer.parseInt(request.getParameter("division"));
        Employee employee = new Employee(name,birthday,idcard,salary,phone,email,address,possition,education,division);
        employeeService.createEmployee(employee);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        employeeService.remove(id);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String code = request.getParameter("code");
        Double salary = Double.valueOf(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int position = Integer.parseInt(request.getParameter("position"));
        int education = Integer.parseInt(request.getParameter("education"));
        int divisionId = Integer.parseInt(request.getParameter("divisionId"));
        Employee employee = new Employee(id,name,birthday,code,salary,phone,email,address,position,education,divisionId);
        employeeService.updateEmployee(employee);

        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
