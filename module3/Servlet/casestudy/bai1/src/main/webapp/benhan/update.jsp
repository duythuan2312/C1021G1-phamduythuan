<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/13/2022
  Time: 8:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Update Bệnh Nhân</h1>
<form action="/hoso?action=update" method="post">
<table border="1">
    <tr>
        <td>Mã bệnh án</td>
        <td><input type="text" name="mabenhan" value="${update.getMaBenhAn()}"></td>
    </tr>

    <tr>
        <td>Mã bệnh nhân</td>
        <td><input type="text" name="mabenhnhan" value="${update.getMaBenhNhan()}"></td>
    </tr>

    <tr>
        <td>Tên bệnh nhân</td>
        <td><input type="text" name="tenbenhnhan" value="${update.getTenBenhNhan()}"></td>
    </tr>
    <tr>
        <td>Ngày nhập viện </td>
        <td><input type="text" name="ngaynhapvien" value="${update.getNgayNhapVien()}"></td>
    </tr>

    <tr>
        <td>Ngày ra viện</td>
        <td><input type="text" name="ngayravien" value="${update.getNgayRaVien()}"></td>
    </tr>

    <tr>
        <td>Lý do nhập viện</td>
        <td><input type="text" name="lidonhapvien" value="${update.getLidoNhapVien()}"></td>
    </tr>

    <tr>
        <td><input type="submit" value="Sửa"></td>
        <td><button><a href="/hoso">Trở về danh sách</a></button></td>
    </tr>
</table>
</form>
</body>
</html>
