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
    <form action="arithmetic" method="post">
        <div>
            <h1>Age Calculator</h1>
            First value : <input type="text" name="first" value="${first}"><br>
            Second value : <input type="text" name="second" value="${second}"><br>
            <input type="submit" name="button" value="+"><input type="submit" name="button" value="-">
            <input type="submit" name="button" value="*"><input type="submit" name="button" value="%"><br>
            Result : ${result}
        </div>
        
        <a href="/age">Arithmetic Calculator</a>
    </form>
</body>
</html>
