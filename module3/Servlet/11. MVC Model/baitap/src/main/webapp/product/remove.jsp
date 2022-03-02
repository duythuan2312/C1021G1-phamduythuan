<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/11/2022
  Time: 10:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Remove Product</h1>
<p>
    <a href="/product">Back To Product</a>
</p>
<form action="/product?action=remove" method="post">
    <input type="hidden"  name="id" value="${product.getId()}">
    <table border="1">
        <tr>
            <td>NameProduct</td>
            <td>${requestScope["product"].getNameProduct()}</td>
        </tr>

        <tr>
            <td>Price</td>
            <td>${requestScope["product"].getPrice()}</td>
        </tr>

        <tr>
            <td>ProductDescription</td>
            <td>${requestScope["product"].getProductDescription()}</td>
        </tr>

        <tr>
            <td>ProductDescription</td>
            <td>${requestScope["product"].getManufacturer()}</td>
        </tr>
              <tr>
                  <td><input type="submit" value="Remove"></td>
              </tr>
    </table>

</form>
</body>
</html>
