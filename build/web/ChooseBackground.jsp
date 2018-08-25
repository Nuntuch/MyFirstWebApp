<%-- 
    Document   : ChooseBackground
    Created on : Aug 24, 2018, 9:51:16 AM
    Author     : INT303
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <jsp:include page="include/Header.jsp?title=Select Your Background ::" />




            <form action="ChooseBackground" method="post">

                <!--JSTL-->
                <!--EL-->

                <input type="radio" name="bgColor" value="slategray"<c:if test="${cookie.bgColor != null && cookie.bgColor.value == 'slategray' }"> checked</c:if>>Dark  
                <input type="text" size="3" disabled style="background-color: slategray"/>
                <!--<input type="color"/>-->
                <br>
                <input type="radio" name="bgColor" value="navy" <c:if test="${cookie.bgColor != null && cookie.bgColor.value == 'navy' }"> checked</c:if>>Navy
                <input type="text" size="3" disabled style="background-color: navy"/><br>

                <input type="radio" name="bgColor" value="silver" <c:if test="${cookie.bgColor != null && cookie.bgColor.value == 'silver' }"> checked</c:if>>Silver
                <input type="text" size="3" disabled style="background-color: silver"/><br>

                <input type="submit"/>

            </form>



        </div>
        <!--<h1>Your Background</h1>-->
    </body>
</html>
