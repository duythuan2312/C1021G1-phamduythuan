<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/20/2022
  Time: 11:01 AM
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
<a  class="btn btn-success" href="/employee?action=create">Add New</a>
<table border="1" class="table table-success">
    <tr>
        <th class="col-1">ID</th>
        <th class="col-1">EmployeeName</th>
        <th class="col-1">Birthday</th>
        <th class="col-1">EmployeeIdCard</th>
        <th class="col-1">Salary</th>
        <th class="col-1">Phone</th>
        <th class="col-1">Email</th>
        <th class="col-1">Address</th>
        <th class="col-1">PositionName</th>
        <th class="col-1">EducationDegreeName</th>
        <th class="col-1">DivisionName</th>
        <th class="col-1">Funtion</th>
    </tr>
    <c:forEach var="employee" items="${employeeList}">
        <tr>
            <td>${employee.employeeId}</td>
            <td>${employee.employeeName}</td>
            <td>${employee.employeeBirthday}</td>
            <td>${employee.employeeIdCard}</td>
            <td>${employee.salary}</td>
            <td>${employee.phone}</td>
            <td>${employee.email}</td>
            <td>${employee.address}</td>
            <td>${employee.positionName}</td>
            <td>${employee.educationDegreeName}</td>
            <td>${employee.divisionName}</td>
            <td>
                <a href="/employee?action=update&id=${employee.employeeId}"> <button class="btn btn-primary">Edit</button></a>

                <button onclick="deleteCustomer('${employee.employeeId}','${employee.employeeName}')" type="button" class="btn btn-danger" data-toggle="modal" data-target="#deleteModal">
                    Delete
                </button>
            </td>
        </tr>
    </c:forEach>
</table>


<!-- Modal -->
<div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                Are you sure delete <span class="text-danger" id="name-customer"></span> ?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                <button onclick="submitFormDelete()" type="button" class="btn btn-danger">Delete</button>
            </div>
        </div>
    </div>
</div>
<form hidden id="form-delete" method="post" action="/employee">
    <input type="text" name="action" value="delete">
    <input type="text" name="id" id="id-customer">
</form>
<script>
    function deleteCustomer(id, name) {
        document.getElementById("id-customer").value = id;
        document.getElementById("name-customer").innerText = name;
    }
    function submitFormDelete() {
        document.getElementById("form-delete").submit();
    }
</script>




<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>

</body>
</html>
