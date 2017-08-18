<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Oops!</title>
</head>
<body>
<fmt:bundle basename="language" prefix="error.">
    <fmt:message key="title" var="title"/>
    <fmt:message key="message" var="message"/>
    <fmt:message key="back" var="back"/>
</fmt:bundle>

<div>${title}</div>
<div>${message}</div>
<a href="startpage.jsp">
<button>${back}</button></a>
</body>
</html>
