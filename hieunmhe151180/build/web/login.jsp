<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body {
                font-family: Arial, Helvetica, sans-serif;
            }

            /* Full-width input fields */
            input[type=text], input[type=password] {
                width: 20%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                box-sizing: border-box;
            }
            /* Set a style for all buttons */
            button {
                background-color: #04AA6D;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                width: 10%;
            }
            .container {
                padding: 16px;
            }
            label{
                width: 130px;
                display: inline-block;
                margin-bottom: 10px;
            }
        </style>
    </head>
    <body>
        <div id="form">
            <h1 style="text-align: center">Login</h1>

            <%
                String msg = (String)request.getAttribute("msg");
            %>
            <div id="id01" class="modal">               
                <div id="msg"><%=msg==null?"":msg%></div>
                <form action="login" method="post" class="modal-content animate">
                    <div class="container">
                        <label for="txtEmail"><b>Email: </b></label>
                            <input type="text" placeholder="Enter Username" name="txtEmail" required></br>
                        <label for="txtPass"><b>Password: </b></label>
                        <input type="password" placeholder="Enter Password" name="txtPass" required></br>
                            <input type="checkbox" checked="checked" name="remember"> Remember me </br>
                            <button style="margin-left: 190px" type="submit">Login</button>
                        <p>Don't have an account? <a href="signup">Sign up</a></p> 
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
