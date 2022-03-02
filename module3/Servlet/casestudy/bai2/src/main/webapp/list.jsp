<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/17/2022
  Time: 6:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/products?action=create"><button>Create</button></a>
<table border="1">
    <tr>
        <td>STT</td>
        <td>NameProduct</td>
        <td>Price</td>
        <td>Quantily</td>
        <td>Color</td>
        <td>Description</td>
        <td>Category</td>
        <td>Action</td>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.getId()}</td>
            <td>${product.getNameProduct()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getQuantily()}</td>
            <td>${product.getColor()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getCategory()}</td>
            <td>
                <a href="/products?action=edit&id=${product.getId()}">Edit</a>
                <a href="">Remove</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
