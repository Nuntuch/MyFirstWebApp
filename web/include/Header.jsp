<%-- 
    Document   : Header
    Created on : Aug 10, 2018, 3:12:07 PM
    Author     : INT303
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="container-fluid" >
    <table class=" table"style="background-color: ${cookie.bgColor.value}">
        <!--เปลี่ยนสีจากคุกกี้-->

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
                    <c:when test="${sessionScope.user != null}">
                        Hello <a href="Logout"> ${sessionScope.user.contactfirstname},</a>
                    </c:when>
                    <c:otherwise>
                        Hello <a href="Login">Guest</a>
                    </c:otherwise>

                </c:choose>


                <%--<a href="ShowCart"> Your Cart:(${cart.totalQuantity})</a>--%>
            </td>
        </tr>


    </table>
</div>
<hr>
Session Id : ${cookie.JSESSIONID.value}
<hr>