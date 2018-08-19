<%-- 
    Document   : Header
    Created on : Aug 10, 2018, 3:12:07 PM
    Author     : INT303
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<table class=" table">

    <tr>
        
        <td>
            <a href="index.html" title="Back to Home"><img src="logo.png" width="120"/></a>
            <h4>${param.title}</h4>
        
        </td>
        <td>
            <c:if test="${cart!=null}">
                <a href="ShowCart">Your Cart: (${cart.totalQuantity})</a>

            </c:if>    
            &nbsp;
            <c:choose>
                <c:when test="${sessionScope.user!=null}">
                    Hello ${sessionScope.user.name}
                </c:when>
                <c:otherwise>
                    Hello Guest
                </c:otherwise>

            </c:choose>


            <%--<a href="ShowCart"> Your Cart:(${cart.totalQuantity})</a>--%>
        </td>
    </tr>


</table>
<hr>