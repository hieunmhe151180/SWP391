<%-- 
    Document   : product
    Created on : Aug 16, 2022, 12:08:36 PM
    Author     : hieud
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Models.Product"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List products</title>
    </head>
    <body>
        <h1 style="text-align: center">Product List</h1>
        <table border="1">
            <tr>
                <th>ProductID</th><th>ProductName</th><th>CategoryID</th><th>QuantityPerUnit</th><th>UnitPrice</th><th>UnitsInStock</th><th>UnitsOnOrder</th><th>ReorderLevel</th><th>Discontinued</th>
                <th colspan="2"></th>
            </tr>
            <%
                ArrayList<Product> products = (ArrayList<Product>)request.getAttribute("products");
                String result = "";
                for(Product p: products){
                    result += "<tr>";
                    result += "<td>"+p.getProId()+"</td>";
                    result += "<td>"+p.getProName()+"</td>";
                    result += "<td>"+p.getCatId()+"</td>";
                    result += "<td>"+p.getUnit()+"</td>";
                    result += "<td>"+p.getPrice()+"</td>";
                    result += "<td>"+p.getInStock()+"</td>";
                    result += "<td>"+p.getOnOrder()+"</td>";
                    result += "<td>"+p.getReOrder()+"</td>";
                    result += "<td>"+p.isDiscontinued()+"</td>";
                    result += "<td><a href='update?pid="+p.getProId()+"'>Edit</a></td>";
                    result += "<td><a href='delete/?pid="+p.getProId()+"'>Delete</a></td>";
                    result += "</tr>";
                }
                out.print(result);
            %>
        </table>
    </body>
</html>