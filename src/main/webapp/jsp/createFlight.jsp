<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <jsp:include page="/jsp/adminHeader.jsp"/>
</head>
<body>
<div id="wrapper">

<div>
<form action="/createFlight" method="post">
<sector class="selector">
    <div>
    <label> Место отправления </label>
    <select id="flight_fromPlace_field" name="fromPlace" type="fromPlace">
        <option>Выберите город отправления</option>
        <c:forEach items="${cities}" var="city">
                <option><c:out value="${city.city}"/></option>
        </c:forEach>

    </select>
    </div>
    <div>
        <label> Место прибытия </label>
        <select id="flight_toPlace_field" name="toPlace" type="toPlace">
            <option>Выберите город прибытия</option>
            <c:forEach items="${cities}" var="city">
                <option><c:out value="${city.city}"/></option>
            </c:forEach>
        </select>
    </div>
    <div>
        <label>Дата</label>
        <input type="date" id="flight_date_field" name="date">
    </div>
    <button>Сохранить</button>
</sector>
</form>
</div>
</div>
</body>
</html>
