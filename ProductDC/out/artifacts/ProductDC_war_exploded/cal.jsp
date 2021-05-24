<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/24/2021
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator Percent</title>
</head>
<body>
    <form method="post" action="calculator">
        <label>Product Description</label>
        <input type="text" name="name-pd"><br>
        <label>List Price</label>
        <input type="number" name="list-price" step="0.1"><br>
        <label>Discount Percent</label>
        <input type="number" name="percent" step="0.1"><br>
        <input type="submit" value="SUBMIT">
    </form>
</body>
</html>
