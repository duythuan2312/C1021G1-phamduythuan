<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/20/2022
  Time: 11:02 AM
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
<form action="/customer?action=update" method="post">
    <table class="table table-striped">
        <tr>
            <th>ID</th>
            <td><input type="text" name="id" value="${list.employeeId}" readonly></td>
        </tr>
        <tr>
            <th>Name</th>
            <td><input type="text" name="name" value="${list.employeeName}"></td>
        </tr>
        <tr>
            <th>Birtday</th>
            <td><input type="text" name="birthday" value="${list.employeeBirthday}"></td>
        </tr>


        <tr>
            <th>IDCard</th>
            <td><input type="text" name="code" value="${list.employeeIdCard}"></td>
        </tr>
        <tr>
            <th>salary</th>
            <td><input type="text" name="salary" value="${list.salary}"></td>
        </tr>
        <tr>
            <th>Phone</th>
            <td><input type="text" name="phone" value="${list.phone}"></td>
        </tr>
        <tr>
            <th>Email</th>
            <td><input type="text" name="email" value="${list.email}"></td>
        </tr>
        <tr>
            <th>Address</th>
            <td><input type="text" name="address" value="${list.address}"></td>
        </tr>

        <tr>
            <th>Position</th>
            <td><input type="text" name="position" value="${list.positioId}"></td>
        </tr>
        <tr>
            <th>Education</th>
            <td><input type="text" name="education" value="${list.educationDegreeId}"></td>
        </tr>
        <tr>
            <th>Divisition</th>
            <td><input type="text" name="divisionId" value="${list.divisionId}"></td>
        </tr>

        <tr>
            <td><input type="submit" value="Update"></td>
        </tr>

    </table>

</form>


<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
</body>
</html>
