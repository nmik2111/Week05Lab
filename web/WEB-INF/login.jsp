<%-- 
    Document   : login
    Created on : 13-Oct-2020, 4:28:42 AM
    Author     : naeun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="post">
            Username: <input type="text" value="${username}"><br>
            Password: <input type="text" value="${password}"><br>
            <input type="submit" value="Log in">
        </form>
    </body>
</html>
