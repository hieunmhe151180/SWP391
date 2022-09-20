<%@page import="java.util.ArrayList" %>
<%@page import="Models.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
         <style type="text/css">
            label{
                width: 130px;
                display: inline-block;
                margin-bottom: 10px;
            }
        </style>
        <h1>Add Genres</h1>
        <form action="genrescreate" method="post" > 
            <label>Description:</label> <input type="text" name="txtDescription"/><br/>
            <input type="submit" value="Create"/>
        </form>
<%@include file="footer.jsp" %>
