<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/16/2022
  Time: 2:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/users?action=update" method="post">
    <table border="1" style="">
        <tr>
            <td>Id</td>
            <td><input type="text" name="id" value="${user.getId()}" readonly></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input type="text" name="name" value="${user.getName()}"></td>
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="text" name="email" value="${user.getEmail()}"></td>
        </tr>
        <tr>
            <td>Country</td>
            <td><input type="text" name="country" value="${user.getCountry()}"></td>
        </tr>
     <tr>
         <td><input type="submit" value="Update"></td>
     </tr>
    </table>
</form>
</body>
</html>
