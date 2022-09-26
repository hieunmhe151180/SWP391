
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
<% Movies m = (Movies) request.getAttribute("movies"); %>
<form action="moviesupdate" method="post" > 
    <label>Movies ID: </label>
    <input type="text" name="MovieId" readonly="true" value="<%=m.getMovieID()%>"/><br/>
    <label>Title:</label>
    <input type="text" name="Title" value="<%=m.getTitle()%>"/><br/>
    <label>Year:</label>
    <input type="number" name="Year" value="<%=m.getYear()%>"/><br/>
    <label>Image:</label>
    <input type="file" name="Image" value="<%=m.getImage()%>"/><br/>
    <label>Description:</label>
    <input type="text" name="Description" value="<%=m.getDescription()%>"/><br/>
    <label>GenreID:</label> 
    <input type="number" name="GenreID" value="<%=m.getGenreID()%>"/><br/>
    <input type="submit" value="Save"/>
</form>
<%@include file="footer.jsp"%>
