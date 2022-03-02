<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 2/8/2022
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
<tr>
    <th>UserName</th>
    <th>PassWork</th>
</tr>
        <c:forEach var="pass" items="${list}">
            <tr>
                <td><c:out value="${pass.user}"></c:out></td>
                <td><c:out value="${pass.passWork}"></c:out></td>
            </tr>
        </c:forEach>
</table>
</body>
</html>
