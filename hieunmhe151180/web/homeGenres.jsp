<%@include file="header.jsp" %>
<style>
        h1{
            margin: 20px
        }
        h2{
            padding-left: 20px;
        }
        li {
            margin: 10px;

        }
        .left{
            width: 20%;
            border: 1px solid black;
            margin: 20px;
        }

        .left  a{
            color: #1e5dd3
        }

        .right ul li{
            border: 1px solid black;
            display: inline-block;
        }
        .right{
            float: left;

            border: 1px solid black;
        }
        .right h2{
            color: #1e5dd3
        }

    </style>
 <body>
        <br>
        <br>
        <div class="left">
            <h2>The loai
            </h2>
            <ul>            
                <c:forEach items="${requestScope.genres}" var="g" >
                    <li><a  href="genres?id=${g.genreID}">
                            ${g.description}
                        </a>
                    </li>
                </c:forEach>   
            </ul>
        </div>

        <div class="right">
            <ul style="list-style: none">
                <c:forEach items="${requestScope.movies}" var="m">
                    <li>
                        <a href="detail?mid=${m.movieID}">
                            <img src="images/${m.image}" width="188px" height="140px" alt="alt"/>
                            <h2>${m.title}</h2>
                            <p>Nam: ${m.year}</p>
                            <c:forEach items="${requestScope.genres}" var="g" >
                                <c:if test="${m.genreID==g.genreID}"><p>Loai: ${g.description}</p></c:if>
                            </c:forEach>  
                            <c:forEach items="${requestScope.rates}" var="r" >
                                <p> Diem:<c:if test="${m.movieID==r.movieID}"> ${r.numericRating}</p></c:if>
                            </c:forEach>
                            <br>
                            <button class="btn btn-success " type="submit" style="
        background-color: #04AA6D;
        border: none;
        color: white;
        padding: 8px 16px;
        text-decoration: none;
        margin: 2px 1px;
        cursor: pointer;">
                                Danh Gia</button>
                        </a>
                    </li>
                </c:forEach>
            </ul>
        </div>
    </body>
</div>
<%@include file="footer.jsp" %>