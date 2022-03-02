<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/18/2022
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assert/datatables/css/dataTables.bootstrap4.min.css">
    <style>
        *{
            background: #20c997;
        }
    </style>
</head>
<body>
<nav style="background: #0c5460">
    <div class="nav nav-tabs" id="nav-tab" role="tablist">
        <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">Home</a>
        <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab" aria-controls="nav-profile" aria-selected="false">Employee</a>
        <a class="nav-item nav-link" id="nav-contact-tab" data-toggle="tab" href="customer/list.jsp" role="tab" aria-controls="nav-customer" aria-selected="false"><a
                href="/customer">Customer</a></a>
        <a class="nav-item nav-link" id="nav-service-tab" data-toggle="tab" href="#nav-contact" role="tab" aria-controls="nav-contact" aria-selected="false">Service</a>
    </div>
</nav>

<div class="tab-content" id="nav-tabContent">
    <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">...</div>
    <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">...</div>
    <div class="tab-pane fade" id="nav-contact" role="tabpanel" aria-labelledby="nav-contact-tab">...</div>
</div>

<form action="/customer?action=update" method="post">
    <table class="table table-striped">
        <tr>
            <th>IDcustomer</th>
            <td><input type="text" name="idCustomer" value="${list.getIdCustomer()}" readonly></td>
        </tr>
        <tr>
            <th>NameCustomer</th>
            <td><input type="text" name="name" value="${list.getNameCustomer()}"></td>
        </tr>
        <tr>
            <th>Birtday</th>
            <td><input type="text" name="birthday" value="${list.getBirthday()}"></td>
        </tr>

        <tr>
            <th>Gender</th>
           <td>
               <label for="gender-category">
                   <select name="gender" id="gender-category">
                       <option value="true" ${list.gender = "true" ? "selected":""}/> Nam </option>
                       <option value="false" ${list.gender = "false" ? "":"selected"}/> Nữ </option>
                   </select>
               </label>
           </td>
        </tr>
        <tr>
            <th>Code</th>
            <td><input type="text" name="code" value="${list.getCustomerCode()}"></td>
        </tr>
        <tr>
            <th>Phone</th>
            <td><input type="text" name="phone" value="${list.getPhone()}"></td>
        </tr>
        <tr>
            <th>Email</th>
            <td><input type="text" name="email" value="${list.getEmail()}"></td>
        </tr>
        <tr>
            <th>Address</th>
            <td><input type="text" name="address" value="${list.getAddress()}"></td>
        </tr>

        <tr>
            <th>IdType</th>
            <td><input type="text" name="id" value="${list.getIdCustomerType()}"></td>
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
