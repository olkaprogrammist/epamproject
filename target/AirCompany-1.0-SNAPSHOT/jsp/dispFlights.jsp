<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <jsp:include page="/jsp/dispHeader.jsp"/>
</head>
<body>
<div id="wrapper">
    <section class="flights">
        <div id="flight_fromPlace_field" name="flight" type="flight">
            <c:forEach items="${note}" var="note">
                <c:if test="${!note.ready}">
                    <form action="/staff" method="post">
                        <input type="hidden" name="flight_id" value="${note.id}">
                        <button type="submit"><c:out value="${note.fromPlace}"/><c:out value="${note.toPlace}"/><c:out value="${note.date}"/></button>
                    </form>
                </c:if>
            </c:forEach>
        </div>
    </section>

</div>
</body>
</html>

