<%-- 
    Document   : list
    Created on : Aug 16, 2022, 9:38:42 AM
    Author     : hieud
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Models.Person"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
        //khai bao doi tuong de tiep nhan doi tuong tu servlet"List"
        ArrayList<Person> persons = (ArrayList<Person>)request.getAttribute("persons");
        %>
        <table border="1">
            <tr>
                <th>ID</th><th>Name</th><th>Gender</th><th>DOB</th>
            </tr>
            <%
                for(Person p : persons){
            %>
            <tr>
                <td><%=p.getID()%></td>
                <td><%=p.getName()%></td>
                <td><%=p.getGender()%></td>
                <td><%=new SimpleDateFormat("dd/MM/yyyy").format(p.getDOB())%></td>              
            </tr>
            <%
                }
            %>

        </table>
        <a href="add.jsp">Create</a>
    </body>
</html>
