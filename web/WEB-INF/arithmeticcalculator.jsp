<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 12, 2019, 9:28:35 PM
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
            First value : <input type="text" name="first" value="${first}"><br>
            Second value : <input type="text" name="second" value="${second}"><br>
            <input type="submit" value="+"><input type="submit" value="-">
            <input type="submit" value="*"><input type="submit" value="%"><br>
            Result :<span name="result" value="${result}"></span>
        </div>
        
        <a href="/arithmetic">Arithmetic Calculator</a>
    </form>
</body>
</html>
