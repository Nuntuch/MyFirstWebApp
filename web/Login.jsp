<%-- 
    Document   : Login
    Created on : Sep 7, 2018, 11:46:54 AM
    Author     : INT303
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap.min.css">
    </head>
    <body>

        <div class="container">
            <jsp:include page="include/Header.jsp?title=Authentication ::"/>    
            <form action="Login" method="post">
            <table class=" table">
                <tr>
                    <td>User Name: </td>
                    <td> <input type="number" name="userName" required/> </td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td> <input type="password" name="password" required/> </td>
                </tr>
                <tr>
                    <td></td>
                    <td> <input type="submit" value="Login"/> </td>
                </tr>
                <tr>
                    <td colspan="2"> <p style="color: red">${message}</p></td>
                </tr>

            </table>
</form>
            <!--        <h1>Hello World!</h1>
                    <form action="Login">
                        user name:<br>
                        <input type="text" name="username" value="124">
                        <br>
                         password:<br>
                        <input type="text" name="password" value="Susan">
                        <br><br>
                        <input type="submit" value="Submit">
                    </form>
            -->
            <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
            <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js" ></script>
            <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap.min.js" ></script>
            <script>
        </body>
        </html>
