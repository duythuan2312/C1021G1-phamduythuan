<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/21/2022
  Time: 8:24 AM
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
<a class="btn btn-success" href="/service?action=create">ADD New</a>
<table border="1" class="table table-success">
    <tr>
        <th class="col-1">ID</th>
        <th class="col-1">NameService</th>
        <th class="col-1">Area</th>
        <th class="col-1">Cost</th>
        <th class="col-1">MaxPeople</th>
        <th class="col-1">StandardRoom</th>
        <th class="col-1">Convenience</th>
        <th class="col-1">PoolArea</th>
        <th class="col-1">NumbeeFloors</th>
        <th class="col-1">Rent-Type-Id</th>
        <th class="col-1">ServiceTypeId</th>
    </tr>
    <c:forEach var="service" items="${serviceList}">
        <tr>
            <td>${service.serviceId}</td>
            <td>${service.serviceName}</td>
            <td>${service.serviceArea}</td>
            <td>${service.serviceCost}</td>
            <td>${service.serviceMaxPeople}</td>
            <td>${service.standardRom}</td>
            <td>${service.descriptionOtherConveniece}</td>
            <td>${service.poolArea}</td>
            <td>${service.numberOfFloors}</td>
            <td>${service.rentTypeId}</td>
            <td>${service.serviceTypeId}</td>
        </tr>
    </c:forEach>
</table>

<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>

</body>
</html>
