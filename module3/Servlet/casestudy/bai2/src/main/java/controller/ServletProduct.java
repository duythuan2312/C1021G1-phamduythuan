package controller;

import model.Product;
import service.ProductServiceIpml;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletProduct", value = "/products")
public class ServletProduct extends HttpServlet {
    public ProductServiceIpml productServiceIpml = new ProductServiceIpml();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
      switch (action){
          case "create":
              break;
          default:
              listProduct(request,response);
              break;
      }

    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response) {
       List<Product> list =  productServiceIpml.listALL();
        request.setAttribute("products",list);
        try {
            request.getRequestDispatcher("list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
    }
}
