<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/26/2022
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>USD</title>
  </head>
  <body>
  <form method="post" action="/usd">
    <label>Rate: </label>
    <input type="text" name="rate" placeholder="Rate" value="23000"><br>
    <label>USD: </label>
    <input type="text" name="usd" placeholder="USD" value="0"><br>
    <input type="submit" id="submit" value="Converter">
  </form>
  </body>
</html>
