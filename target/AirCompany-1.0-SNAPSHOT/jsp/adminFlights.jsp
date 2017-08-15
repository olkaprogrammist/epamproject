<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <jsp:include page="/jsp/adminHeader.jsp"/>
</head>
<body>
<div id="wrapper">
    <section class="flights">
        <div id="flight_fromPlace_field" name="flight" type="flight">
            <c:forEach items="${note}" var="note">
               <h2> <c:out value="${note.fromPlace}"/></h2>
                <h3><c:out value="${note.toPlace}"/> </h3>
                <h4><c:out value="${note.date}"/></h4>
            </c:forEach>
        </div>
    </section>

</div>
</body>
</html>
