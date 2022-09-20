<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="List" method="post" onsubmit="return CheckInput();" name="frm">
            <label>Id: </label><input type="number" name="txtId"/><br/>
            <label>Name: </label><input type="text" name="txtName"/><br/>
            <label>Gender: </label><input type="radio" name="rbGender" value="Male"/> Male
                    <input type="radio" name="rbGender" value="Female" checked="true"/> Female<br/>
            <label>DOB </label><input type="date" name="txtDob"/><br/>
            <input type="submit" value="Create"/>
        </form>
    </body>
    <script type="text/javascript">
        function CheckInput(){
            var id = document.forms["frm"]["txtId"].value;
            var name = document.forms["frm"]["txtName"].value;
            var msg = "";
            var flag = true;
            
            if(id===""){
                msg += "Id not empty.\n";
                flag = false;
            }
            if(name === ""){
                msg += "Name not empty.\n";
                flag = false;
            }
            if(flag==false){
                alert(msg);
                return false;
            }
            
            return true;
        }
    </script>
</html>
