<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/26/2022
  Time: 6:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assert/datatables/css/dataTables.bootstrap4.min.css">
</head>
<body>
<form action="/convert" method="">
  <table style="margin: auto">
      <h2 style="text-align: center">Từ Tiếng Anh</h2>
      <tr>
          <td><input type="text" name="english" placeholder="input word"></td>
      </tr>
     <tr>
         <td> <input class="btn-primary" type="submit" value="Submit"></td>
     </tr>
  </table>
</form>
<h3>${result}</h3>
<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="/assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
</body>
</html>
