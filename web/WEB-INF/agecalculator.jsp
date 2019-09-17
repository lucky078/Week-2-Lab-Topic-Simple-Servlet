        <%-- 
    Document   : agecalculator
    Created on : Sep 13, 2019, 3:46:42 PM
    Author     : 749300
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <h1>Age Calculator</h1>
    </head>
    <body>
        <form action="age" method="post">
        <table>
            <tr>Enter your age:<td><input type="number" name="age" value="${Age}"></td>    
            </tr>
            <tr><td>
                <input type="submit" value="Age Next Birthday"></td></tr>
            <tr><td><p>${mAge}</p></td></tr>
        </table>
           <a href="arithmetic">Arithmetic Calculator</a>
        </form>
    </body>
</html>
