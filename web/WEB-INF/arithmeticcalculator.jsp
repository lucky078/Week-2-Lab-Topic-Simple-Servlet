<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 16, 2019, 9:17:17 AM
    Author     : 749300
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form>
            First<input type="number" name="fnum" value="${numf}"><br>
            Second<input type="number" name="snum" value="${nums}"><br>
            <input type="submit" name="add" value="+">
            <input type="submit" name="sub" value="-">
            <input type="submit" name="mul" value="*">
            <input type="submit" name="mol" value="%">
             
        </form>
            <p> Result${result}</p>
            <a href="age">Age Calculator</a>
    </body>
</html>
