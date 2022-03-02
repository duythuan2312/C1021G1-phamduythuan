<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/1/2022
  Time: 9:55 AM
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
<center>
    <h1 class="btn-primary">Sandwich Condiments</h1>

<form action="sandwich" method="post" id="abc">
    <table class="table">
       <tr>
           <td>
           <input type="checkbox" name="condiment" value="Lettuce">Xà Lách
           <input type="checkbox" name="condiment" value="Tomato">Cà chua
           <input type="checkbox" name="condiment" value="Mustard">Mù Tạc
           <input type="checkbox" name="condiment" value="Sprouts">Giá
            </td>
       </tr>
    </table>
    <input type="submit" value="SAVE">
</form>

    <c:choose>
        <c:when test="${list !=null}">
            <table border="1" class="table-active">
                <tr>
                    <td>SandWich ăn kèm</td>
                </tr>
                <c:forEach var="condiment" items="${list}">
                    <tr>
                        <td>${condiment}</td>
                    </tr>
                </c:forEach>
            </table>
        </c:when>
        <c:otherwise>
            <h1>Không có món nào cần ăn kèm!!!</h1>
        </c:otherwise>
    </c:choose>

</center>
<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/datatables/js/jquery.dataTables.min.js"></script>
<script src="/assert/datatables/js/dataTables.bootstrap4.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
</body>
</html>
