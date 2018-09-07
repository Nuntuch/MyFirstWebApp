<%-- 
    Document   : SimpleCalculatorView
    Created on : Aug 6, 2018, 4:10:20 PM
    Author     : INT303
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>Result :: </h1><hr>
        <table>
            <tr>
                <td>x</td>
                <td>=</td>
                <td>${calculator.x}</td>
            </tr>
            <tr>
                <td>y</td>
                <td>=</td>
                <td>${calculator.y}</td>
            </tr>
            <tr>
                <td>Operator</td>
                <td>=</td>
                <td>${calculator.operator}</td>
            </tr>
            <tr>
                <td>Result</td>
                <td>=</td>
                <td>${calculator.result}</td>
            </tr>
        </table>
    </body>
</html>
