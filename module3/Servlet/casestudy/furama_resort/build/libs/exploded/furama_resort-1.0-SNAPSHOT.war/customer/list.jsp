<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/18/2022
  Time: 11:29 AM
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
<nav style="background: #0c5460">
    <div class="nav nav-tabs" id="nav-tab" role="tablist">
        <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">Home</a>
        <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab" aria-controls="nav-profile" aria-selected="false">Employee</a>

        <a class="nav-item nav-link" id="nav-contact-tab" data-toggle="tab" href="/customer" role="tab" aria-controls="nav-customer" aria-selected="false"></a>
        <a class="nav-item nav-link" id="nav-service-tab" data-toggle="tab" href="#nav-contact" role="tab" aria-controls="nav-contact" aria-selected="false">Service</a>
    </div>
</nav>

<div class="tab-content" id="nav-tabContent">
    <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">...</div>
    <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">...</div>
    <div class="tab-pane fade" id="nav-contact" role="tabpanel" aria-labelledby="nav-contact-tab">...</div>
</div>

<a  class="btn btn-success" href="/customer?action=create">Add New</a>
<table border="1" class="table table-success">
    <tr>
        <th class="col-1">ID</th>
        <th class="col-1">NameCustomer</th>
        <th class="col-1">Birthday</th>
        <th class="col-1">Gender</th>
        <th class="col-1">CustomerCode</th>
        <th class="col-1">Phone</th>
        <th class="col-1">Email</th>
        <th class="col-2">Address</th>
        <th class="col-1">NameCustomerType</th>
        <th class="col-3">Funtion</th>
    </tr>
        <c:forEach var="customer" items="${list}">
            <tr>
                <td>${customer.getIdCustomer()}</td>
                <td>${customer.getNameCustomer()}</td>
                <td>${customer.getBirthday()}</td>
                <td>${customer.isGender() ? 'Nam':'Nữ'}</td>
                <td>${customer.getCustomerCode()}</td>
                <td>${customer.getPhone()}</td>
                <td>${customer.getEmail()}</td>
                <td>${customer.getAddress()}</td>
                <td>${customer.getNameCustomerType()}</td>
                <td>
                    <a href="/customer?action=update&idCustomer=${customer.getIdCustomer()}"> <button class="btn btn-primary">Edit</button></a>
                    <button onclick="deleteCustomer('${customer.getIdCustomer()}','${customer.getNameCustomer()}')" type="button" class="btn btn-danger" data-toggle="modal" data-target="#deleteModal">
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




<form hidden id="form-delete" method="post" action="/customer">
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


