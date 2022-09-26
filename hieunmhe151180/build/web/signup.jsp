<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
<style type="text/css">
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
<h1>Signup</h1>
 </head>
    <body>
<div id="id01" class="modal">               
    <form action="login" method="post" class="modal-content animate">
        <div class="container">
            <label>Fullname: </label> <input type="text" placeholder="Enter Your Fullname" name="Fullname" required/><br/>
            <label>Gender: </label> 
            <select name="Gender">
                <option value="Nam">Nam</option>
                <option value="Nu">Nu</option>                 
                <option value="Khac">Khac</option>
            </select><br/>
            <label>Email: </label> <input type="text" placeholder="Enter Email" name="Email" required/><br/>
            <label>Password: </label> <input type="password" placeholder="Enter Password" name="Password" required/><br/>
            <button style="margin-left: 190px" type="submit">Signup</button>
        </div>
    </form>
</div>
         </body>
</html>
