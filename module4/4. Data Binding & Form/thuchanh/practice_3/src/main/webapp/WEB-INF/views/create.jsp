<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/2/2022
  Time: 11:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Add Product</h3>
<p>
    <a th:href="@{/product}">
        Back to product list
    </a>
</p>
<div id="form">
    <form th:action="@{/product/save}" th:object="${productForm}"
          method="POST" novalidate="novalidate" enctype="multipart/form-data">
        <input type="hidden" th:field="*{id}"/>
        <div>
            <label>Name</label>
            <input type="text" th:field="*{name}"/>
        </div>
        <div>
            <label>Description</label>
            <input type="text" th:field="*{description}"/>
        </div>
        <div>
            <label>Image</label>
            <input type="file" th:field="*{image}"/>
        </div>
        <input type="submit" value="Save"/>
    </form>
</div>
<footer th:replace="/layout :: footer"></footer>
</body>
</html>
