<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 3/1/2022
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Caculator</h1>

<form action="tinh" method="post">
    <table border="1">
        <input type="text" name="name1">AND
        <input type="text" name="name2">
        <tr>
            <td>
                <input type="submit"  name="caculate" value="+">
                <input type="submit"  name="caculate" value="-">
                <input type="submit"  name="caculate" value="X">
                <input type="submit"  name="caculate" value="/">
            </td>
        </tr>
    </table>
</form>

<h2>Result:${result}</h2>
</body>
</html>
