<%@include file="header.jsp" %>

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
                        <a href="#"> 
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
                            <button class="btn btn-success " type="submit" style="margin-left: 27% ; margin-top: 10px ; margin-bottom: 10px">
                                Danh Gia</button>
                        </a>
                    </li>
                </c:forEach>
            </ul>
        </div>
    </body>
</div>
<%@include file="footer.jsp" %>