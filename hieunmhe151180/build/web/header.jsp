<%@page import="java.util.ArrayList" %>
<%@page import="Models.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../Css/style.css" rel="stylesheet"/>
        <style>
            * {
                /* Here i made the margin and padding 0 */
                margin: 0;

                padding: 0;
            }

            .navbar {
                display: flex;

                /* This is used to make the navbar sticky, So that the
                        navbar stays at the top part even if we scroll */
                position: sticky;
                align-items: center;
                justify-content: center;
                top: 0px;

                /*it specifies the mouse cursor to be displayed
                        when it is pointed over the element */
                cursor: pointer;
            }

            .nav-list {
                width: 50%;
                display: flex;
            }

            .nav-list li {
                list-style: none;
                padding: 26px 30px;
            }

            .nav-list li a {
                text-decoration: none;
                color: white;
            }

            .nav-list li a:hover {
                color: black;
            }

            .rightNav {
                width: 30%;
                text-align: right;
            }

            #search {
                padding: 5px;
                font-size: 17px;
                border: 2px solid grey;
                border-radius: 9px;
            }

            .background {
                background-color: #04AA6D;
                background-blend-mode: darken;
                background-size: cover;
            }
            #footer{
                position:absolute;
                bottom:0;
                width:100%;
                height:22px;   /* Height of the footer */
                background:#6cf;
                background-color: #cccccc;
            }

        </style>
    </head>
    <body>
        <%
            Person p = (Person)request.getSession().getAttribute("pSession");
        %>
        <div id="wrapper">
            <nav class="navbar background">    
                <!-- we have used list tag that is ul
                to list the items-->
                <ul class="nav-list">
                    <h1 style="line-height: 70px">PhimKhongHay</h1>
                    <li><a href="<%=request.getContextPath()%>/home">Home</a></li>
                </ul>
                <!-- we have used rightnav in order to design
                        the seachbar properly by using CSS-->
                <div class="rightNav">
                    <form action="search" method="Post" style="text-align:center">
                        <!-- the value that search bar will take is text -->
                        <input type="text" name="search" id="search" />
                        <button class="btn btn-sm">Search</button>
                    </form>
                </div>
                <%
                if(p!=null){
                %>
                Welcome: <%=p.getEmail()%> | 
                <a href="<%=request.getContextPath()%>/person/logout">Logout</a>
                <%
                }else{
                %>
                <p style="margin-right: 50px"><a href="person/login">Login</a></p>
                <%
                }
                %>
            </nav>
            <%
            
            %>