package Controller;

import model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Controller.ServletUser", value = "/ServletUser")
public class ServletUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> userList = new ArrayList<>();
        userList.add(new User("phamduythuan","123456"));
        userList.add(new User("dangduylinh","123456"));
        userList.add(new User("nguyenanhhoang","123456"));
        userList.add(new User("nguyenvanngocdat","123456"));
        userList.add(new User("honhathieu","123456"));
        userList.add(new User("luongduybao","123456"));
        request.setAttribute("list",userList);
        request.getRequestDispatcher("home.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
