<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <jsp:include page="header.jsp"/>
</head>
<body>
<div id="wrapper">
    <fmt:bundle basename="language" prefix="authorization.">
        <fmt:message key="title" var="title"/>
        <fmt:message key="error" var="auth_error"/>
        <fmt:message key="auth_login" var="auth_login"/>
        <fmt:message key="auth_password" var="auth_password"/>
        <fmt:message key="registration" var="auth_registration"/>
        <fmt:message key="signin" var="signin"/>
    </fmt:bundle>



    <div id="page_wrapper">

        <div class="text_field_list">
            <h2 class="title_text">${title}</h2>
            <c:if test="${not empty errorMessage}">
                <div>${auth_error}</div>
            </c:if>
            <form id="login_page_login_form" action="/login" method="post">
                <input id="login_page_email_field" name="login" type="text" placeholder="${auth_login}">
                <br>
                <input id="login_page_password_field" name="password" type="password" placeholder="${auth_password}">
                <br>
                <button>${signin}</button>
            </form>
            <form action="/jsp/registration.jsp" method="get">
                <button id="login_form_call_registration_page_button">${auth_registration}</button>
            </form>
        </div>

    </div>
</div>
</body>
</html>
