package Controllor;

import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Controllor.CustomerServelet", value = "/CustomerServelet")
public class CustomerServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       List<Customer> customerList = new ArrayList<>();
       Customer customer = new Customer("Mai văn Hoàng","2020/12/5","Sài Gòn `   ","https://static.bongda24h.vn/medias/original/2021/2/24/nhan-vat-phil-foden-manchester-city.jpg");
       Customer customer1 = new Customer("lê Thị Nở","2020/9/1","Đà nẵng","https://vtv1.mediacdn.vn/thumb_w/640/2021/10/14/photo-1-1634194917758877563992.jpg");
       Customer customer2 = new Customer("Nguyễn Chí Phèo","2022/6/1","Bình Định","https://vtv1.mediacdn.vn/thumb_w/640/2021/10/14/photo-1-1634194917758877563992.jpg");
       Customer customer3 = new Customer("Lê Thị Đạt","2020/12/1","Huế","https://photo-cms-tpo.zadn.vn/600x315/Uploaded/2022/qhj-hiobgobrfc/2021_06_08/cau-thu-dat-gia-nhat-3945.jpg");
       Customer customer4 = new Customer("Quách thị Linh","2020/3/1","Quảng Nam","https://downloadwap.com/thumbs2/wallpapers/p2ls/2019/sports/41/fd1a489413488434.jpg");
       customerList.add(customer);
       customerList.add(customer1);
       customerList.add(customer2);
       customerList.add(customer3);
       customerList.add(customer4);

       request.setAttribute("action" ,customerList);
       request.getRequestDispatcher("displayCustomer.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
