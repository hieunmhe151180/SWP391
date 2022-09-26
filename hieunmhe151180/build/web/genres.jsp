
<%@include file="header.jsp" %>
<did id="content">

    <h1 style="text-align: center">Genres list</h1>
    
    <div id="content-left">      
        <p><td><a href="movies">Movies</a></td></p>
        <p><td><a href="genres">Genres</a></td></p>
        <p><td><a href="persons">Persons</a></td></p>
        <p><td><a href="comments">Comments</a></td></p>
    </div>
    <a href="genrescreate"><h3 style="text-align: center">Create</h3></a>
    <table border="1" style="margin: auto">
        <tr>
            <th>ID</th><th>Description</th>
            <th colspan="2"></th>
        </tr>
        <%
        ArrayList<Genres> genres = (ArrayList<Genres>)request.getAttribute("genres");
        for(Genres g : genres){
        %>
        <tr>
            <td><%=g.getGenreID()%></td>
            <td><%=g.getDescription()%></td>
            <td>
                <a href="genresupdate?id=<%=g.getGenreID()%>">Update</a>
            </td>
            <td>
                <a href="genresdelete?id=<%=g.getGenreID()%>" onclick="return confirmDel()">Delete</a>
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