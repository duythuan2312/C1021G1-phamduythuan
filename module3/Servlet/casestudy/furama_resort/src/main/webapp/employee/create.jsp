<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/20/2022
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-3">
        </div>
        <div class="col-9">
            <form action="/employee?action=create" method="post">
                <div class="form-group">
                    <label for="name-customer">Name</label>
                    <input type="text" class="form-control" id="name-customer" name="name">
                </div>

                <div class="form-group">
                    <label for="birthday">Birthday</label>
                    <input type="date" class="form-control" id="birthday" name="birthday">
                </div>

                <div class="form-group">
                    <label for="card">ID Card</label>
                    <input type="text" class="form-control" id="card" name="card">
                </div>

                <div class="form-group">
                    <label for="code-customer">Salary</label>
                    <input type="text" class="form-control" id="code-customer" name="salary">
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
                    <label for="possition">Possition</label>
                    <select class="form-control" id="possition" name="possition">
                        <c:forEach var="possition" items="${possitionList}">
                            <option value="${possition.possitionId}">${possition.possitionName}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="form-group">
                    <label for="education">Education</label>
                    <select class="form-control" id="education" name="education">
                        <c:forEach var="education" items="${educationList}">
                            <option value="${education.educationId}">${education.educationName}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="form-group">
                    <label for="division">Division</label>
                    <select class="form-control" id="division" name="division">
                        <c:forEach var="type" items="${divisionList}">
                            <option value="${type.divisionId}">${type.divisionName}</option>
                        </c:forEach>
                    </select>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </div>
</div>

<script src="/assert/jquery/jquery-3.5.1.min.js"></script>
<script src="/assert/bootstrap413/js/popper.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.min.js"></script>
<script src="/assert/bootstrap413/js/bootstrap.bundle.js"></script>


</body>
</html>
