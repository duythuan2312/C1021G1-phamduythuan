package controller;

import model.service.Service;
import service.implService.ServiceIpml;
import service.implService.ServiceTypeImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletService", value = "/service")
public class ServletService extends HttpServlet {
    private ServiceIpml serviceIpml = new ServiceIpml();
    private ServiceTypeImpl serviceList = new ServiceTypeImpl();
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
            default:
                listService(request,response);
                break;

        }
    }

    private void listService(HttpServletRequest request, HttpServletResponse response) {
        List<Service> serviceList = serviceIpml.serviceAll();
        request.setAttribute("serviceList",serviceList);
        try {
            request.getRequestDispatcher("service/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("service/create.jsp").forward(request,response);
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
                createService(request, response);
                break;

        }
    }

    private void createService(HttpServletRequest request, HttpServletResponse response) {
        String nameService = request.getParameter("name");
        int area = Integer.parseInt(request.getParameter("area"));
        Double cost = Double.valueOf(request.getParameter("cost"));
        int maxpeople = Integer.parseInt(request.getParameter("maxpeople"));
        String standardromm = request.getParameter("standardromm");
        String descriptionotherconvenience = request.getParameter("descriptionotherconvenience");
        Double poolarea = Double.valueOf(request.getParameter("poolarea"));
        int numberoffloors = Integer.parseInt(request.getParameter("numberoffloors"));
        int renttypeid = Integer.parseInt(request.getParameter("renttypeid"));
        int servicetypeid = Integer.parseInt(request.getParameter("servicetypeid"));
        Service service = new Service(nameService,area,cost,maxpeople,standardromm,descriptionotherconvenience,poolarea,numberoffloors,renttypeid,servicetypeid);
       serviceIpml.createService(service);
        try {
            response.sendRedirect("/service");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

