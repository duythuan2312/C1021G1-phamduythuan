<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/16/2022
  Time: 2:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Thêm mới User</h2>
<form action="/users?action=create" method="post">
  <table border="1">
<tr>
    <td>Name:</td>
    <td><input type="text" name="name"></td>
</tr>
      <tr>
          <td>Email:</td>
          <td><input type="text" name="email"></td>
      </tr>
      <tr>
          <td>Country:</td>
          <td><input type="text" name="country"></td>
      </tr>
      <tr>
          <input type="submit" value="ADD">
      </tr>
  </table>
</form>
</body>
</html>
