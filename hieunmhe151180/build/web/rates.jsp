
<%@include file="header.jsp" %>
<did id="content">

    <h1 style="text-align: center">Rates list</h1>
    <div id="content-left">      
        <p><td><a href="movies">Movies</a></td></p>
        <p><td><a href="genres">Genres</a></td></p>
        <p><td><a href="persons">Persons</a></td></p>
        <p><td><a href="comments">Comments</a></td></p>
    </div>
    <table border="1" style="margin: auto">
        <tr>
            <th>MovieID</th><th>PersonID</th><th>Comment</th><th>NumericRating</th><th>Time</th>
        </tr>
        <%
        ArrayList<Rates> rates = (ArrayList<Rates>)request.getAttribute("rates");
        for(Rates rt : rates){
        %>
        <tr>
            <td><%=rt.getMovieID()%></td>
            <td><%=rt.getPersonID()%></td>
            <td><%=rt.getComment()%></td>
            <td><%=rt.getNumericRating()%></td>
            <td><%=rt.getTime()%></td>
        </tr>
        <%
        }
        %>
    </table>
    
</did> 
<%@include file="footer.jsp" %>