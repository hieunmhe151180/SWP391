
<%@include file="header.jsp" %>
<did id="content">

    <h1 style="text-align: center">Person list</h1>
    <div id="content-left">      
        <p><td><a href="movies">Movies</a></td></p>
        <p><td><a href="genres">Genres</a></td></p>
        <p><td><a href="persons">Persons</a></td></p>
        <p><td><a href="comments">Comments</a></td></p>
    </div>
    <table border="1" style="margin: auto">
        <tr>
            <th>ID</th><th>Fullname</th><th>Gender</th><th>Email</th><th>Password</th><th>Type</th><th>IsActive</th><th colspan="1"></th>
        </tr>
        <%
        ArrayList<Person> person = (ArrayList<Person>)request.getAttribute("person");
        for(Person per : person){
        %>
        <tr>
            <td><%=per.getPersonID()%></td>
            <td><%=per.getFullname()%></td>
            <td><%=per.getGender()%></td>
            <td><%=per.getEmail()%></td>
            <td><%=per.getPassword()%></td>
            <td><%=per.getType()%></td>
            <td><%=per.isIsActive()%></td>
            <td>
                <a href="active?id=<%=per.getPersonID()%>">Active/Deactive</a>
            </td>
        </tr>
        <%
        }
        %>
    </table>

</did>
<%@include file="footer.jsp" %>