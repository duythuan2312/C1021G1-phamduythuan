<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/17/2022
  Time: 6:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>Thêm mới một sản phẩm:</h2>
<form action="/products?action=create">
    <table>
        <tr>
            <th>NameProduct</th>
            <td><input type="text" name="name" ></td>
        </tr>
        <tr>
            <th>Price</th>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <th>Quantily</th>
            <td><input type="text" name="quantily"></td>
        </tr>
        <tr>
            <th>Color</th>
            <td><input type="text" name="color"></td>
        </tr>
        <tr>
            <th>Description</th>
            <td><input type="text" name="description"></td>
        </tr>
        <tr>
            <th>Category</th>
            <td><input type="text" name="category"></td>
        </tr>
        <td><input type="submit" value="Submit"></td>
    </table>
</form>

</body>
</html>
