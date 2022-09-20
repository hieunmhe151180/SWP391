<%@page import="java.util.ArrayList" %>
<%@page import="Models.Student" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            // Khai bao doi tuong de tiep nhan du lieu tu servlet 'List'
            ArrayList<Student> students = (ArrayList<Student>)request.getAttribute("students");
            
        %>
        <table border="1">
            <h1 style="text-align: center">Student List</h1>
            <h3><a href="add.jsp">Create</a></h3>
            <tr>
                <th>ID</th><th>Name</th><th>Gender</th><th>DOB</th>
                <th colspan="2"></th>
            </tr>
            <%
            for(Student s : students){
            %>
            <tr>
                <td><%=s.getID()%></td>
                <td><%=s.getName()%></td>
                <td><%=s.getGender()%></td>
                <td><%=new SimpleDateFormat("yyyy-MM-dd").format(s.getDOB())%></td>
                <td><a href="update?sid=<%=s.getID()%>">Edit</a></td>
                <td><a href="delete?sid=<%=s.getID()%>">Delete</a></td>
            </tr>
            <%
            }
            %>
        </table>
    </body>
</html>
