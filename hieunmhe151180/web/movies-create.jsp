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
        <h1>Add Movies</h1>
        <form action="moviescreate" method="post" > 
            <label>Title:</label> <input type="text" name="txtTitle"/><br/>
            <label>Year:</label> <input type="number" name="txtYear"/><br/>
            <label>Image:</label> <input type="file" name="txtImage"/><br/>
            <label>Description:</label> <input type="text" name="txtDescription"/><br/>
            <label>GenreID:</label> <input type="number" name="txtGenreID"/><br/>
            <input type="submit" value="Create"/>
        </form>
<%@include file="footer.jsp" %>
