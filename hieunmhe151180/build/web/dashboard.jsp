<%@include file="header.jsp" %>
<did id="content">
    <h1 style="text-align: center">DashBoard</h1>
    <div id="content-left">      
        <p><td><a href="movies">Movies</a></td></p>
        <p><td><a href="genres">Genres</a></td></p>
        <p><td><a href="persons">Persons</a></td></p>
        <p><td><a href="comments">Comments</a></td></p>


    </div>
    <div id="content-right">
        
        <table border="1" style="margin: 0px auto; width: 80%">
            <td>Movies: ${mSize}</td>
            <td>Genres: ${gSize}</td>
            <td>Persons: ${pSize}</td>
            <td>Comments: ${rSize} </td>
        </table>
    </div>
</did>
<%@include file="footer.jsp" %>