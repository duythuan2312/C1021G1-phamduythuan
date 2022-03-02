package controller;

import model.customer.Customer;
import model.customer.CustomerType;
import service.implCustomer.CustomerServiceIpml;
import service.implCustomer.CustomerTypeServiceIpml;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletCustomer", value = "/customer")
public class ServletCustomer extends HttpServlet {
    private CustomerServiceIpml customerServiceIpml = new CustomerServiceIpml();
    private CustomerTypeServiceIpml customerTypeServiceIpml = new CustomerTypeServiceIpml();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          String action = request.getParameter("action");
          if (action == null){
              action ="";
          }
          switch (action){
              case "create":
                  showCreate(request,response);
              break;
              case "update":
                  showUpdate(request,response);
                  break;
              default:
                  listCusotmer(request,response);
                  break;


          }
    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) {
        CustomerTypeServiceIpml customerTypeServiceIpml = new CustomerTypeServiceIpml();
        int idCustomer = Integer.parseInt(request.getParameter("idCustomer"));
        Customer customer = customerServiceIpml.findByID(idCustomer);
        request.setAttribute("list",customer);
        List<CustomerType> customerTypeList = customerTypeServiceIpml.findAll();
        request.setAttribute("customertype",customerTypeList);
        try {
            request.getRequestDispatcher("customer/update.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerType> customerTypeList = customerTypeServiceIpml.findAll();
        request.setAttribute("customerTypeList", customerTypeList);
        try {
            request.getRequestDispatcher("customer/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void listCusotmer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> list = customerServiceIpml.findAll();
        request.setAttribute("list",list);
        try {
            request.getRequestDispatcher("customer/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action ="";
        }
        switch (action){
            case "create":
               createCustomer(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            case "update":
                updateCustomer(request,response);
                break;
            case "search":
                search(request,response);
                break;

    }
}

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
        int idCustomer = Integer.parseInt(request.getParameter("idCustomer"));
        String nameCustomer = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        Boolean gender = Boolean.valueOf(request.getParameter("gender"));
        String customerCode = request.getParameter("code");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = new Customer(idCustomer,nameCustomer,birthday,gender,customerCode,phone,email,address,id);
        customerServiceIpml.updateCustomer(customer);

        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void search(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        List<Customer> list = customerServiceIpml.searchName(name);
        request.setAttribute("list",list);
        try {
            request.getRequestDispatcher("customer/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        customerServiceIpml.removeCustomer(id);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) {
        String nameCustomer = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        Boolean gender = Boolean.valueOf(request.getParameter("gender"));
        String code = request.getParameter("code");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = new Customer(nameCustomer,birthday,gender,code,phone,email,address,id);
        customerServiceIpml.create(customer);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
