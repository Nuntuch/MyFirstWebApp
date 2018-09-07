<%-- 
    Document   : ViewProductDetail
    Created on : Aug 31, 2018, 11:04:32 AM
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
        <h1>Hello World! HiEiEi</h1>

        <table>
            <tr>
                <td> Product Code : </td>
                <td> ${product.productcode} </td>

            </tr>
            
            <tr>
                <td> Product Name : </td>
                <td> ${product.productname} </td>

            </tr>
            
            <tr>
                <td> Product Line : </td>
                <td> ${product.productline.productline} </td>

            </tr>
            
            <tr>
                <td> Scale : </td>
                <td> ${product.productscale} </td>

            
            <tr>
                <td> Product Vendor : </td>
                <td> ${product.productvendor} </td>

            </tr>
            
            <tr>
                <td> Product Description : </td>
                <td> ${product.productdescription} </td>

            </tr>
            
            <tr>
                <td> Price : </td>
                <td> ${product.msrp} </td>

            </tr>

        </table>



    </body>
</html>
