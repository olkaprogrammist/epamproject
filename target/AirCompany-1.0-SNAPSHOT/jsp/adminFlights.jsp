<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <jsp:include page="/jsp/header.jsp"/>
</head>
<body>
<div id="wrapper">
    <section class="list">
    <div >
        <label>not ready</label>
     <section >
        <div name="flight" >
            <c:forEach items="${note}" var="note">
               <h3> <c:out value="${note.fromPlace}"/> <c:out value="${note.toPlace}"/> <c:out value="${note.date}"/> </h3>
            </c:forEach>
        </div>
    </section>
    </div>
    <div>
        <label>ready</label>

    <section>
        <c:forEach items="${newList}" var="list">
        <form action="/crew" method="post">
        <input type="hidden" name="list_id" value="${list.id}">
            <button type="submit"><c:out value="${list.fromPlace}"/> <c:out value="${list.toPlace}"/> <c:out value="${list.date}"/></button>
        </form>
        </c:forEach>
    </section>

    </div>
    </section>
</div>
</body>
</html>
