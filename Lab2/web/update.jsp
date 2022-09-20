<%-- 
    Document   : add
    Created on : Aug 18, 2022, 10:21:23 AM
    Author     : hieud
--%>
<%@page import="Models.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
        label{
                width: 130px;
                display: inline-block;
                margin-bottom: 10px;
            }
        </style>
    </head>
    <body>
         <h1>Update</h1>
        <% Student s = (Student)request.getAttribute("student");%>
        <form method="post" action="update">
            <label>ID: </label>
            <input type="text" name="txtId" readonly="true"/><br/>
            <label>Name: </label>
            <input type="text" name="txtName"/><br/>
            <label>Gender: </label><input type="radio" name="rbGender" value="Male"/> Male
                    <input type="radio" name="rbGender" value="Female" checked="true"/> Female<br/>
            <label>DOB</label>
            <input type="date" name="txtDOB"/><br/>
            <input type="submit" value="Save"/>
           
    </body>
</html>
