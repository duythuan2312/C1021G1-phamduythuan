<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/11/2022
  Time: 4:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Search Product</h1>
<form action="/product?action=seach" method="post">
    <input type="text" name="nameProduct">
    <input type="submit" value="Search Product">
</form>
</body>
</html>
