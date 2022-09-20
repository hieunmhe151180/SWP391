
<%@page import="Models.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<style type="text/css">
    label{
        width: 130px;
        display: inline-block;
        margin-bottom: 10px;
    }
</style>
<h1>Edit Movies</h1>
<% Genres g = (Genres) request.getAttribute("genres"); %>
<form action="genresupdate" method="post" > 
    <label>Genres ID: </label>
    <input type="text" name="GenreID" readonly="true" value="<%=g.getGenreID()%>"/><br/>
    <label>Description</label>
    <input type="text" name="Description" value="<%=g.getDescription()%>"/></br>
    <input type="submit" value="Save"/>
</form>
<%@include file="footer.jsp"%>
