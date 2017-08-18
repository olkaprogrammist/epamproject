<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <jsp:include page="/jsp/header.jsp"/>
</head>
<body>
<div id="wrapper">
    <fmt:bundle basename="language" prefix="createFlight.">
        <fmt:message key="fromPlace" var="fromPlace"/>
        <fmt:message key="choseFromPlace" var="choseFromPlace"/>
        <fmt:message key="toPlace" var="toPlace"/>
        <fmt:message key="choseToPlace" var="choseToPlace"/>
        <fmt:message key="date" var="date"/>
        <fmt:message key="save" var="save"/>

    </fmt:bundle>
<div>
<form action="/createFlight" method="post">
<sector class="selector">
    <div>
    <label> ${fromPlace} </label>
    <select id="flight_fromPlace_field" name="fromPlace" type="fromPlace">
        <option>${choseFromPlace}</option>
        <c:forEach items="${cities}" var="city">
                <option><c:out value="${city.city}"/></option>
        </c:forEach>

    </select>
    </div>
    <div>
        <label> ${toPlace} </label>
        <select id="flight_toPlace_field" name="toPlace" type="toPlace">
            <option>${choseToPlace}</option>
            <c:forEach items="${cities}" var="city">
                <option><c:out value="${city.city}"/></option>
            </c:forEach>
        </select>
    </div>
    <div>
        <label>${date}</label>
        <input type="date" id="flight_date_field" name="date">
    </div>
    <button>${save}</button>
</sector>
</form>
</div>
</div>
</body>
</html>
