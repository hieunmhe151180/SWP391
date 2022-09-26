<%-- 
    Document   : student-list
    Created on : Aug 19, 2022, 10:16:11 AM
    Author     : hieud
--%>
<%@page import="java.util.ArrayList" %>
<%@page import="models.Student" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <th>ID</th><th>Name</th><th>Gender</th><th>DOB</th>
                <th colspan="2"></th>
            </tr>
            <%
            ArrayList<Student> students = (ArrayList<Student>)request.getAttribute("students");
            for(Student s : students){
            %>
            <tr>
                <td><%=s.getId()%></td>
                <td><%=s.getName()%></td>
                <td><%=s.isGender()?"Male":"Female"%></td>
                <td><%=s.getDOB()%></td>
                <td><a href="update?sid=<%=s.getId()%>">Update</a></td>
                <td><a href="delete?sid=<%=s.getId()%>" onclick="return confirmDel()">Delete</a></td>
            </tr>
            <%
            }
            %>
        </table>
        <a href="create">Create</a>
    </body>
    <script>
        function confirmDel(){
            if(confirm("Do you want to delete")){
                return true;
            }
            return false;
        }
    </script>
</html>
