<%--
  Created by IntelliJ IDEA.
  User: Olga
  Date: 21.07.2017
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/jsp/adminHeader.jsp"/>
</head>
<body>
<div id="wrapper">

    <sector  id="choiceSection">
       <a href="/jsp/adminFlights.jsp"> <div style="height: 100px">
            Посмотреть список всех рейсов
        </div></a>
        <div style="height: 100px">
            Посмотреть список обработанных рейсов
        </div>
       <a href="/jsp/createFlight.jsp"> <div style="height: 100px">
            Создать новый рейс
        </div></a>
     
    </sector>

</div>
</body>
</html>
