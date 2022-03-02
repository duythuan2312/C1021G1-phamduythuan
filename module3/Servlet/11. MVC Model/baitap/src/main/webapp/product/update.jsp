<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/11/2022
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Update Product</h1>
<p>
    <a href="/product">Back To Product</a>
</p>

<form action="/product?action=update" method="post">
    <table border="1">
        <tr>
            <td>Id Product</td>
            <td><input type="text" name="id" value="${product.getId()}"></td>
        </tr>
        <tr>
            <td>NameProduct</td>
            <td><input type="text" name="nameProduct" value="${product.getNameProduct()}"></td>
        </tr>

        <tr>
            <td>Price</td>
            <td><input type="text" name="price" value="${product.getPrice()}"></td>
        </tr>
        <tr>
            <td>ProductDescription</td>
            <td><input type="text" name="productDescription" value="${product.getProductDescription()}"></td>
        </tr>

        <tr>
            <td>Manufacturer</td>
            <td><input type="text" name="manufacturer" value="${product.getManufacturer()}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Update"></td>
        </tr>

    </table>

</form>
</body>
</html>
