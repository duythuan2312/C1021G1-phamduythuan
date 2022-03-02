package controller;

import dao.BenhAnDao;
import dao.BenhNhanDao;
import model.BenhAn;
import model.BenhNhan;
import model.HosoBenhAn;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "PatientServlet", value = "/hoso")
public class PatientServlet extends HttpServlet {

    BenhNhanDao benhNhanDao = new BenhNhanDao();
    BenhAnDao benhAnDao = new BenhAnDao();
    public List<HosoBenhAn> hosoBenhAnList = new ArrayList<>();
    public List<BenhAn> benhAnList = benhAnDao.listBenhAn();
    public List<BenhNhan> benhNhanList = benhNhanDao.listBenhNhan();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "update":
                showUpdate(request,response);
                break;
            case "remove":
                break;
            default:
                listBenhan(request,response);
                break;
        }
    }

    private void showUpdate(HttpServletRequest request, HttpServletResponse response) {
        String mabenhan = request.getParameter("mabenhan");
          for (HosoBenhAn hosoBenhAn : hosoBenhAnList){
              if (hosoBenhAn.getMaBenhAn().equals(mabenhan)){
                  request.setAttribute("update",hosoBenhAn);
              }
          }


        try {
            request.getRequestDispatcher("benhan/update.jsp").forward(request,response);
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
        switch (action){
            case "update":
                update(request,response);
                break;
            case "remove":
                break;
            default:
                break;
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
        String mabenhan = request.getParameter("mabenhan");
        String mabenhnhan = request.getParameter("mabenhnhan");
        String tenbenhnhan = request.getParameter("tenbenhnhan");
        String ngaynhapvien = request.getParameter("ngaynhapvien");
        String ngayravien = request.getParameter("ngayravien");
        String lidonhapvien = request.getParameter("lidonhapvien");

        for (HosoBenhAn hosoBenhAn1 : hosoBenhAnList){
            if (hosoBenhAn1.getMaBenhAn().equals(mabenhan)){
                hosoBenhAn1.setTenBenhNhan(tenbenhnhan);
                hosoBenhAn1.setNgayNhapVien(ngaynhapvien);
                hosoBenhAn1.setNgayRaVien(ngayravien);
                hosoBenhAn1.setLidoNhapVien(lidonhapvien);
                BenhNhan benhNhan = new BenhNhan(mabenhnhan,tenbenhnhan,lidonhapvien,mabenhan);
                BenhAn benhAn = new BenhAn(mabenhan,ngaynhapvien,ngayravien);
               benhNhanDao.updateBenhNhan(benhNhan);
               benhAnDao.updateBenhAn(benhAn);
            }
            request.setAttribute("hosoBenAnList",hosoBenhAnList);
        }

        try {
            request.getRequestDispatcher("benhan/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listBenhan(HttpServletRequest request, HttpServletResponse response){
          hosoBenhAnList.clear();
         for (BenhNhan benhNhan : benhNhanList){
             HosoBenhAn hosoBenhAn = new HosoBenhAn();
             hosoBenhAn.setMaBenhNhan(benhNhan.getMaBenhNhan());
             hosoBenhAn.setTenBenhNhan(benhNhan.getTenBenhNhan());
             hosoBenhAn.setLidoNhapVien(benhNhan.getLiDoNhapvien());
             hosoBenhAn.setMaBenhAn(benhNhan.getMaBenhAn());
             BenhAn benhAn = benhAnDao.benhAn(benhNhan.getMaBenhAn());
             hosoBenhAn.setMaBenhAn(benhAn.getMaBenhAn());
             hosoBenhAn.setNgayNhapVien(benhAn.getNgayNhapVien());
             hosoBenhAn.setNgayRaVien((benhAn.getNgayRaVien()));
             hosoBenhAnList.add(hosoBenhAn);
         }

         request.setAttribute("hosoBenAnList",hosoBenhAnList);
        try {
            request.getRequestDispatcher("benhan/list.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
