<%-- 
    Document   : agecalculator
    Created on : Sep 12, 2019, 4:33:49 PM
    Author     : 784564
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

</head>
<body>
    <form action="age" method="post">
        <div>
            <h1>Age Calculator</h1>
            Enter you age: <input type="text" name="age" value="${age}"><br>
            <input type="submit" value="Age next birthday"><br>
            ${msg}
        </div>
        <a href="/arithmetic">Arithmetic Calculator</a>
    </form>
</body>
</html>
