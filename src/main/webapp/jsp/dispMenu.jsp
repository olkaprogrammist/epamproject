
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/jsp/adminHeader.jsp"/>
</head>
<body>
<div id="wrapper">

    <sector  id="choiceSection">
        <form action="/flightList" method="post">
            <button> Список рейсов </button>
        </form>
        <%--<div style="height: 100px">--%>
            <%--Посмотреть список обработанных рейсов--%>
        <%--</div>--%>
        <%--<form action="/cities" method="post">--%>
            <%--<button> Создать новый рейс </button>--%>
        <%--</form>--%>

    </sector>

</div>
</body>
</html>
