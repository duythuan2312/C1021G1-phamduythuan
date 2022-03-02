<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/11/2022
  Time: 4:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>
    <a href="/product">To Back Main Menu</a>
</p>
<c:choose>
    <c:when test="${message == null}">
        <c:forEach var="product" items="${productList}">
            <table border="1">
                <tr>
                    <th>Id Product</th>
                    <th>Name Product</th>
                    <th>Price</th>
                    <th>ProductDescription</th>
                    <th>Manufacturer</th>
                </tr>

                <tr>
                    <td>${product.getId()}</td>
                    <td>${product.getNameProduct()}</td>
                    <td>${product.getPrice()}</td>
                    <td>${product.getProductDescription()}</td>
                    <td>${product.getManufacturer()}</td>
                </tr>
            </table>
        </c:forEach>
    </c:when>
    <c:otherwise>
        <h1>${message}</h1>
    </c:otherwise>
</c:choose>


</body>
</html>
