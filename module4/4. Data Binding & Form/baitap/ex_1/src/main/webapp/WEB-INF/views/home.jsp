<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/2/2022
  Time: 1:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 style="text-align: center ; color: blue">Settings</h2>
<form:form action="submit" method="post" modelAttribute="settings" >
    <table border="5" style="margin: auto">
        <tr>
         <td><form:label path="languages">Languages</form:label></td>
           <td> <form:select path="languages">
                <option value="English">English</option>
                <option value="Vietnamese">Vietnamese</option>
                <option value="Japanese">Japanese</option>
                <option value="Chinese">Chinese</option>
            </form:select></td>
        </tr>
        <tr>
            <td><form:label path="pageSize">Page Size</form:label></td>
            <td>
                <form:select path="pageSize">
                    <option value="5">5</option>
                    <option value="10">10</option>
                    <option value="15">15</option>
                    <option value="25">25</option>
                    <option value="50">50</option>
                    <option value="100">100</option>
                </form:select>
            </td>
        </tr>
        <tr>
            <td><form:label path="spamsFilter">Spams filter:</form:label></td>
                <td><form:checkbox path="spamsFilter" value="Enable spams filter"/>Enable spams filter</td>
            </td>
        </tr>
        <tr>
            <td><form:label path="signature">Signature</form:label></td>
            <td><form:textarea path="signature" readonly="false" ></form:textarea></td>
        </tr>
      <tr>
          <td style="background:orange ">  <input type="submit" value="Update"></td>
          <td style="background:aqua"><input type="reset" value="Cancel"></td>
      </tr>
    </table>
</form:form>
</body>
</html>
