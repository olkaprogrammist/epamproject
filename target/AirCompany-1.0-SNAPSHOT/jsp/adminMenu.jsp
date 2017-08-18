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
    <jsp:include page="/jsp/dispHeader.jsp"/>
</head>
<body>
<div id="wrapper">

    <sector  id="choiceSection">
        <form action="/flightList" method="post">
            <button> Список рейсов </button>
        </form>
        <div style="height: 100px">
            Посмотреть список обработанных рейсов
        </div>
       <form action="/cities" method="post">
          <button> Создать новый рейс </button>
        </form>
    </sector>

</div>
</body>
</html>
