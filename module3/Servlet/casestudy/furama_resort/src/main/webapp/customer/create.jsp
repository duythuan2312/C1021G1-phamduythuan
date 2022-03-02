<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/18/2022
  Time: 11:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
    <style>
        *{
            background: #20c997;
        }
    </style>
</head>
<body>

<div class="container-fluid">
    <div class="row">
        <div class="col-3">
        </div>
        <div class="col-9">
            <form action="/customer?action=create" method="post" id="form-1">
                <div class="form-group invalid">
                    <label for="name-customer">Name</label>
                    <input type="text" class="form-control" id="name-customer" name="name" required pattern="^[A-Za-z]$">
                    <span class="form-message"></span>
                </div>

                <div class="form-group">
                    <label for="birthday">Birthday</label>
                    <input type="date" class="form-control" id="birthday" name="birthday">
                </div>
                <div class="form-group">
                    <label for="gender">Gender</label>
                    <select class="form-control" id="gender" name="gender" required>
                        <option  value="">Chọn...</option>
                        <option value="true" >Nam</option>
                        <option value="false" >Nữ</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="code-customer">Code</label>
                    <input type="text" class="form-control" id="code-customer" name="code">
                </div>
                <div class="form-group">
                    <label for="phone-customer">Phone</label>
                    <input type="text" class="form-control" id="phone-customer" name="phone">
                </div>

                <div class="form-group">
                    <label for="email-customer">Email</label>
                    <input type="text" class="form-control" id="email-customer" name="email">
                </div>

                <div class="form-group">
                    <label for="address-customer">Address</label>
                    <input type="text" class="form-control" id="address-customer" name="address">
                </div>

                <div class="form-group">
                    <label for="category">CustomerType</label>
                    <select class="form-control" id="category" name="id">
                        <c:forEach var="type" items="${customerTypeList}">
                            <option value="${type.idCustomerType}">${type.nameCustomerType}</option>
                        </c:forEach>
                    </select>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>
</div>

<script src="../assert/Validator.js"></script>
<script>
    Validator({
        form: '#form-1',
        rules: [
            Validator.isRequired('#name-customer')

        ]
    });
</script>

<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>
</body>
</html>
