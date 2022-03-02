<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/28/2022
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Email Validate</h1>

<form action="index" method="post">
    <input type="text" name="email" placeholder="Input Email">
    <input type="submit" value="Validate">
</form>

<h2>${message!=null?message:email}</h2>
</body>
</html>
