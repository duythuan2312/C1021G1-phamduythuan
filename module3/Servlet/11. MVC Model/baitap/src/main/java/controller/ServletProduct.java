package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceIpml;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ServletProduct", value = "/product")
public class ServletProduct extends HttpServlet {
    private ProductService productService = new ProductServiceIpml();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null){
            action="";
        }
        switch (action){
            case "create":
                showCreate(request,response);
                break;
            case "update":
              showUpdate(request,response);
                break;
            case "remove":
                showRemove(request,response);
                break;
            case "view":
                viewProduct(request,response);
                break;
            case "seach":
                showSeach(request,response);
                break;
            default:
                listProduct(request,response);
                break;
        }
    }

    private void showSeach(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("product/seach.jsp").forward(request,response);
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
          action="";
      }
      switch (action){
          case "create":
           createProduct(request,response);
              break;
          case "update":
              updateProduct(request,response);
              break;
          case "remove":
              deleteProduct(request,response);
              break;
          case "view":
           viewProduct(request,response);
              break;
          case "seach":
              seachProduct(request,response);
              break;
          default:
              listProduct(request,response);
              break;
      }
    }

    private void seachProduct(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productList = new ArrayList<>();
        String nameProduct = request.getParameter("nameProduct");
        List<Product> arrayList = this.productService.findAll();
        for (Product product :arrayList){
            if (product.getNameProduct().contains(nameProduct)){
               productList.add(product);
            }
        }
        if (productList.size()==0){
            request.setAttribute("message","Không có sản phẩm này nha!!!");
        }else {
            request.setAttribute("productList",productList);
        }
        try {
            request.getRequestDispatcher("product/resultSeach.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void listProduct(HttpServletRequest request, HttpServletResponse response){
        List<Product> product = this.productService.findAll();
        request.setAttribute("product", product);

        RequestDispatcher dispatcher = request.getRequestDispatcher("product/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void viewProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("product/view.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String nameProduct = request.getParameter("nameProduct");
        double price = Double.parseDouble(request.getParameter("price"));
        String productDescription = request.getParameter("productDescription");
        String manufacturer = request.getParameter("manufacturer");

        Product product = new Product(id,nameProduct,price,productDescription,manufacturer);
        this.productService.save(product);
        try {
            request.getRequestDispatcher("product/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void deleteProduct(HttpServletRequest request , HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        if (product == null){
            try {
                request.getRequestDispatcher("error.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            this.productService.remove(id);
            try {
                response.sendRedirect("/product");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private void showCreate(HttpServletRequest request ,HttpServletResponse response){
        try {
            request.getRequestDispatcher("product/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void showRemove(HttpServletRequest request ,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        if (product == null){
            request.getRequestDispatcher("product/error.jsp");
        }else {
            request.setAttribute("product",product);
            try {
                request.getRequestDispatcher("product/remove.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateProduct(HttpServletRequest request,HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        String nameProduct = request.getParameter("nameProduct");
        double price = Double.parseDouble(request.getParameter("price"));
        String productDescription = request.getParameter("productDescription");
        String manufacturer = request.getParameter("manufacturer");

        Product product = this.productService.findById(id);
        if (product == null){
            request.getRequestDispatcher("error.jsp");
        }else {
            product.setId(id);
            product.setNameProduct(nameProduct);
            product.setPrice(price);
            product.setProductDescription(productDescription);
            product.setManufacturer(manufacturer);
            this.productService.update(id,product);
            request.setAttribute("product",product);

            try {
                request.getRequestDispatcher("product/update.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void showUpdate(HttpServletRequest request , HttpServletResponse response){
        int id = Integer.parseInt(request.getParameter("id"));
        Product product = this.productService.findById(id);
        if (product == null){
            request.getRequestDispatcher("error.jsp");
        }else {
            request.setAttribute("product",product);
            try {
                request.getRequestDispatcher("product/update.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
