import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletPasswork", value = "/ServletPasswork")
public class ServletPasswork extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("name");
        request.setAttribute("ten",user);
        request.setAttribute("pass",pass);
      if (user.equals("phamduythuan") && pass.equals("123456789")){
          request.getRequestDispatcher("pass.jsp").forward(request,response);
      }else {
          request.getRequestDispatcher("index.jsp").forward(request,response);
      }

    }
}
