<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/23/2022
  Time: 9:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assert/datatables/css/dataTables.bootstrap4.min.css">
</head>
<body>

<table>
    <tr>
        <td><a  class="btn btn-success" href="/product?action=create">Add New</a></td>
        <td> <td>   <form action="/customer?action=search" method="post">
        <input type="text" name="name">
        <input type="submit" value="Search">
    </form></td></td>
    </tr>
</table>

<table id="customer" border="1" class="table table-success">
    <thead>
    <tr>
        <th class="col-1">ID</th>
        <th class="col-1">NameProduct</th>
        <th class="col-1">Price</th>
        <th class="col-1">Quantily</th>
        <th class="col-1">Color</th>
        <th class="col-1">NameCategory</th>
        <th class="col-3">Funtion</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${productList}">
        <tr>
            <td>${product.idProduct}</td>
            <td>${product.nameProduct}</td>
            <td>${product.price}</td>
            <td>${product.quantily}</td>
            <td>${product.color}</td>
            <td>${product.nameCategory}</td>
            <td>
                <a href="/product?action=update&idCustomer=${customer.getIdCustomer()}"> <button class="btn btn-primary">Edit</button></a>
                <button onclick="deleteCustomer('${customer.getIdCustomer()}','${customer.getNameCustomer()}')" type="button" class="btn btn-danger" data-toggle="modal" data-target="#deleteModal">
                    Delete
                </button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>


<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="/assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
</body>
</html>
