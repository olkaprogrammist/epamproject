<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--</body>--%>
<%--</html>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>


</head>
<body>

<fmt:bundle basename="language" prefix="registration.">
    <fmt:message key="title" var="title"/>
    <fmt:message key="login" var="login"/>
    <fmt:message key="login_not_valid_error" var="login_not_valid_error"/>
    <fmt:message key="login_missing_error" var="login_missing_error"/>
    <fmt:message key="login_already_used_error" var="login_already_used_error"/>
    <fmt:message key="password" var="password"/>
    <fmt:message key="password_not_valid_error" var="password_not_valid_error"/>
    <fmt:message key="password_missing_error" var="password_missing_error"/>
    <fmt:message key="role" var="role"/>
    <fmt:message key="role_missing_error" var="role_missing_error"/>
    <fmt:message key="complete_signup" var="complete_signup"/>
</fmt:bundle>

<%@include file="/jsp/header.jsp" %>

<div id="page_wrapper">
    <div class="text_field_list">
        <h2 class="title_text">${title}</h2><br>
        <form id="registration_form" action="/registration" method="post">

            <input id="registration_login_field" name="login" type="text" placeholder="${login}" value="${current_login}">
            <span id="login_missing_error" class="login_errors">${login_missing_error}</span>
            <span id="login_not_valid_error" class="login_errors">${login_not_valid_error}</span>
            <span id="login_already_used_error" class="login_errors">${login_already_used_error}</span>
            <br>

            <input id="registration_password_field" name="password" type="password" placeholder="${password}">
            <span id="password_missing_error" class="password_errors">${password_missing_error}</span>
            <span id="password_not_valid_error" class="password_errors">${password_not_valid_error}</span>
            <br>

            <input id="registration_role_field" name="role" type="role" placeholder="${role}">
            <span id="role_missing_error" class="role_errors">${role_missing_error}</span>
            <br>

            <button>${complete_signup}</button>

        </form>
    </div>

</div>
</body>
</html>


