<%--
  Created by IntelliJ IDEA.
  User: Olga
  Date: 25.07.2017
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/jsp/dispHeader.jsp"/>
</head>
<body>
<div id="wrapper">

    <section>
        <div class="info">
            <label class="label">FLIGHT:</label>
            ST.PETERSBURG - BARSELONA 24.07.17 15:25 - 24.07.17 19:40
        </div>
    </section>

    <div>Your settings are saved</div>

   <a href="/jsp/dispFlights.jsp"> <div>Перейти к списку рейсов</div></a>
   <a href="/jsp/startpage.jsp"> <div>Exit</div></a>


</div>
</body>
</html>