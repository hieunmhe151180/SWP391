
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="List" method="post" onsubmit="return CheckInput();" name="frm">
            ID: <input type="number" name="txtID"/><br/>
            Name: <input type="text" name="txtName"/><br/>
            Gender: <input type="radio" name="rbGender" value="Male"/> Male
            <input type="radio" name="rbGender" value="Female" checked="true"/> Female<br/> 
            DOB: <input type="date" name="txtDOB"/><br/>
            <input type="submit" value="Create"/>
        </form>
    </body>
    <script type="text/javascript">
        function CheckInput(){
            var id = document.forms["frm"]["txtID"].value;
            var name = document.forms["frm"]["txtName"].value;
            var msg= "";
            var flag = true;
            if(id===""){
                msg+="ID not empty.\n";
                flag = false;
            }
             if(name===""){
                msg+="Name not empty.\n";
                flag = false;
            }
             if(flag == false){
                alert(msg);
                return false;
            }
            return true;   
        }
    </script>
</html>
