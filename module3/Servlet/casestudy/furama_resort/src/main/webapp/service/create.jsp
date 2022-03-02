<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/21/2022
  Time: 8:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assert/bootstrap413/css/bootstrap.min.css">
</head>
<body>


<div class="container">
    <div class="row">
        <div class="col-3">
        </div>
        <div class="col-9">
            <form action="/service?action=create" method="post">
                <div class="form-group">
                    <label for="name-service">Name</label>
                    <input type="text" class="form-control" id="name-service" name="name">
                </div>

                <div class="form-group">
                    <label for="service_area">Service Area</label>
                    <input type="text" class="form-control" id="service_area" name="area">
                </div>
                <div class="form-group">
                    <label for="service_cost">ServiceCost</label>
                    <input type="text" class="form-control" id="service_cost" name="cost">
                </div>
                <div class="form-group">
                    <label for="service_max_people">MaxPeople</label>
                    <input type="text" class="form-control" id="service_max_people" name="maxpeople">
                </div>
                <div class="form-group">
                    <label for="standard_room">Standardromm</label>
                    <input type="text" class="form-control" id="standard_room" name="standardromm">
                </div>


                <div class="form-group">
                    <label for="description_other_convenience">Convenience</label>
                    <input type="text" class="form-control" id="description_other_convenience" name="descriptionotherconvenience">
                </div>

                <div class="form-group">
                    <label for="pool_area">PoolArea</label>
                    <input type="text" class="form-control" id="pool_area" name="poolarea">
                </div>

                <div class="form-group">
                    <label for="number_of_floors">Number of Floors</label>
                    <input type="text" class="form-control" id="number_of_floors" name="numberoffloors">
                </div>

                <div class="form-group">
                    <label for="rent_type_id">Renttypeid</label>
                    <input type="text" class="form-control" id="rent_type_id" name="renttypeid">
                </div>


                <div class="form-group">
                    <label for="service_type_id">Servicetypeid</label>
                    <input type="text" class="form-control" id="service_type_id" name="servicetypeid">
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
