<%-- 
    Document   : ViewGoods
    Created on : Aug 9, 2018, 4:44:59 PM
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

                <tr>
                    <td><h1>Your Product  ::</h1></td>
                    <td><a href="ShowCart"> Your Cart:(${cart.totalQuantity})</a></td>
                </tr>


            </table>

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



                </thead>

                
                                <c:forEach items="${products}" var="p" varStatus="vs">
                                    <tr>
<!--                
                                        couth จะเริ่มจาก1
                                        index จะเริ่มจาก0-->
                                        
                                        <td>${cart.totalQuantity}</td>
                                        <td>${p.productCode}</td>
                                        <td>${p.productName}</td>
                                        <td>${p.productLine}</td>
                                        <td>${p.productScale}</td>
                                        <td>${p.msrp}</td>
                                        <td><img src="model-images/${p.productCode}.jpg" width="120"></td>
                
                                
                
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