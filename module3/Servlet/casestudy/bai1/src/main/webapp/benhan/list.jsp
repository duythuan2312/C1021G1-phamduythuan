<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/13/2022
  Time: 11:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
    <title>Title</title>
    <link rel="stylesheet" href="benhan/list.css">
</head>
<body>

<h1 class="textt" >Danh sách bệnh án</h1>
<table border="1" class="table">
    <tr class="tieude">
        <th>STT</th>
        <th>Mã Bệnh Án</th>
        <th>Mã Bệnh Nhân</th>
        <th>Tên Bệnh Nhân</th>
        <th>Ngày Nhập Viện</th>
        <th>Ngày Ra Viện</th>
        <th>Lí Do Nhập Viện</th>
        <th>Tác Vụ</th>
    </tr>
    
   <c:forEach var="benhan" items="${hosoBenAnList}">
        <tr>
            <td>${benhan.getStt()}</td>
            <td>${benhan.getMaBenhAn()}</td>
            <td>${benhan.getMaBenhNhan()}</td>
            <td>${benhan.getTenBenhNhan()}</td>
            <td>${benhan.getNgayNhapVien()}</td>
            <td>${benhan.getNgayRaVien()}</td>
            <td>${benhan.getLidoNhapVien()}</td>
            <td>
                <a href="/hoso?action=update&mabenhan=${benhan.getMaBenhAn()}"><i class='fas fa-edit'></i></a>
                <a href="/hoso?action=remove&mabenhan=${benhan.getMaBenhAn()}"><i class="material-icons">delete</i></a>
            </td>
        </tr>
   </c:forEach>
</table>
</body>
</html>

