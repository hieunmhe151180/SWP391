<%@include file="header.jsp" %>



<% Movies m = (Movies) request.getAttribute("movies"); %>                  
<h1><%=m.getTitle()%></h1>

<img src="images/<%=m.getImage()%>" width="200px" height="300px" alt="alt"/></br>
<p><b>Th? lo?i: </b>Hành ??ng</p>
<p><b>N?m: </b><%=m.getYear()%></p>
<p><b>Mô t?: </b><%=m.getDescription()%></p>
<button class="btn btn-success " type="submit" style="
        
        background-color: #04AA6D;
        border: none;
        color: white;
        padding: 8px 16px;
        text-decoration: none;
        margin: 2px 1px;
        cursor: pointer; ">?ánh giá</button>

<%@include file="footer.jsp" %>
