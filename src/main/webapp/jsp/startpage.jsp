<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <jsp:include page="header.jsp"/>
</head>
<body>
<fmt:bundle basename="language" prefix="start.">
    <fmt:message key="signin" var="signin"/>
    <fmt:message key="signup" var="signup"/>
   </fmt:bundle>
<div id="wrapper">
<section id="choiceSection">
    <a href="/jsp/loginPage.jsp">
    <div> ${signin} </div>    </a>
    <a href="/jsp/registrationPage.jsp">
    <div> ${signup} </div>   </a>
</section>

</div>
</body>
</html>
