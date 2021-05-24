<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 5/24/2021
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Current Converter</title>
    <link rel="stylesheet" type="text/css" href="css.css">
  </head>
  <body>
    <h2>Currenty Converter</h2>
  <form method="get" action="convert">
    <label>Rate: </label>
    <input type="number" name="rate" placeholder="RATE" value="22000"><br>
    <label>USD: </label>
    <input type="number" name="usd" placeholder="USD" value="0"><br>
    <input type="submit" id="submit" value="Converter">
  </form>
  </body>
</html>
