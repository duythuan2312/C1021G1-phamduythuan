<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/16/2022
  Time: 1:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
<h1>List User</h1>
<a href="/users?action=create"><button>Thêm mới</button></a>
<form action="/users?action=search" method="post">
    <input type="text" name="country">
    <input type="submit" value="Search">
</form>
<table border="1">
  <tr>
      <th>Id</th>
      <th>Name</th>
      <th>Email</th>
      <th>Country</th>
      <th>Funtion</th>
  </tr>
    <c:forEach var="user" items="${list}">
        <tr>
            <td>${user.getId()}</td>
            <td>${user.getName()}</td>
            <td>${user.getEmail()}</td>
            <td>${user.getCountry()}</td>
           <td>
            <a href="/users?action=update&id=${user.getId()}"><i class="material-icons">edit</i></a>
            <form action="/users?action=remove&id=${user.getId()}" method="post">
                <button type="submit" style="padding: 0px;border: none;background: transparent"><i class="material-icons">delete</i></button>
            </form>
    </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
