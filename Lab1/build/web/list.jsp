<%-- 
    Document   : list
    Created on : Aug 16, 2022, 8:21:30 AM
    Author     : hieud
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Models.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
      
        
        <table border="1">
            <tr>
                <th>Roll</th><th>Name</th><th>Age</th><th colspan="2"></th>
            </tr>
            <%
                ArrayList<Student> students = (ArrayList<Student>)request.getAttribute("students");
                String result = "";
                for(Student s: students){
                    result += "<tr>";
                    result += "<td>"+s.getRoll()+"</td>";
                    result += "<td>"+s.getName()+"</td>";
                    result += "<td>"+s.getAge()+"</td>";
                    result += "<td><a href='edit.jsp?roll="+s.getRoll()+"'>Edit</a></td>";
                    result += "<td><a href='delete.jsp?roll="+s.getRoll()+"'>Delete</a></td>";
                    result += "</tr>";
                }
                out.print(result);
            %>
        </table>
        <hr>
        <a href="add.jsp">Create</a>
        <hr>
    </body>
</html>
