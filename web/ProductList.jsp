<%-- 
    Document   : ProductList
    Created on : Aug 8, 2018, 3:22:28 PM
    Author     : INT303
--%>

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
            <table class=" table">
                
                <jsp:include page="include/Header.jsp?title=Product Listing ::"/>    
                
                <tr>
                    <!--<td><h1>Product List ::</h1></td>-->
                    <td><a href="ShowCart"> Your Cart:(${cart.totalQuantity})</a></td>
                </tr>


            </table>
                <hr>
                
            <!--<h1>Product List :: </h1>-->


            <table id="example" class="table table-striped table-bordered" style="width:100%">

                <!--<thead> หัวข้อ การเติมข้อความหนาๆ-->
                <thead>

                <th>No</th>
                <th>Product Code</th>
                <th>Product Name</th>
                <th>Product Line</th>
                <th>Scale</th>
                <th>Price</th>
                <th>Images</th>
                <th>Add to Cart</th>


                </thead>
                

                <c:forEach items="${products}" var="p" varStatus="vs">
                    <tr>

                        <!--couth จะเริ่มจาก1-->
                        <!--index จะเริ่มจาก0-->
                        
                        <td>${vs.count}</td>
                        <td><a href="GetProduct?productCode=${p.productcode}">${p.productcode}</a></td>
                        <td>${p.productname}</td>
                        <td>${p.productline.productline}</td>
                        <td>${p.productscale}</td>
                        <td>${p.msrp}</td>
                        <td><img src="model-images/${p.productcode}.jpg" width="120"></td>

                        <td>
                            <a href="AddItemToCart?productCode=${p.productcode}">
                                <input type="button" value="Add To Cart By Para "/> 

                            </a>

                            <form action="AddItemToCart" method="post">
                                <input type="hidden" value="${p.productcode}" name="productCode"/>
                                <input type="submit" value="Add To Cart By Form"/>
                            </form>

                        </td>

                    </tr>
                </c:forEach>


            </table>

        </div>

        <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
        <script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js" ></script>
        <script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap.min.js" ></script>
        <script>
            $(document).ready(function () {
                $('#example').DataTable();
            });
        </script>
    </body>
</html>
