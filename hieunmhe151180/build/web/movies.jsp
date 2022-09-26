
<%@include file="header.jsp" %>
<did id="content">

    <h1 style="text-align: center">Movies list</h1>
    <div id="content-left">      
        <p><td><a href="movies">Movies</a></td></p>
        <p><td><a href="genres">Genres</a></td></p>
        <p><td><a href="persons">Persons</a></td></p>
        <p><td><a href="comments">Comments</a></td></p>
    </div>
    <a href="moviescreate"><h3 style="text-align: center">Create</h3></a>
    <table border="1" style="margin: auto">
        <tr>
            <th>ID</th><th>Name</th><th>Genre</th><th>Year</th><th colspan="2"></th>
        </tr>
        <%
        ArrayList<Movies> movies = (ArrayList<Movies>)request.getAttribute("movies");
        for(Movies m : movies){
        %>
        <tr>
            <td><%=m.getMovieID()%></td>
            <td><%=m.getTitle()%></td>
            <td><%=m.getGenreID()%></td>
            <td><%=m.getYear()%></td>
            <td>
                <a href="moviesupdate?id=<%=m.getMovieID()%>">Update</a>
            </td>
            <td>
                <a href="moviesdelete?id=<%=m.getMovieID()%>" onclick="return confirmDel()">Delete</a>
            </td>
        </tr>
        <%
        }
        %>
    </table>
    
</did>
<script>
    function confirmDel() {
        if (confirm("Do you want to delete?")) {
            return true;
        }
        return false;
    }
</script>
<%@include file="footer.jsp" %>