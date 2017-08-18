
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="description" content="aircompany project"/>
    <title>AIRCOMPANY</title>
    <link rel="stylesheet" href="/css/mystyles.css">
    <script src="/js/langChange.js"></script>
    <link rel="stylesheet" href="/css/menustyles.css">
</head>
<body>
<fmt:bundle basename="language" prefix="header.">
    <fmt:message key="title" var="title"/>
   </fmt:bundle>
<div id="wrapper">


    <header id="bookmarks" class="nav">
        <h1 id="header">${title}</h1>
    </header>
    <div class="languages">
        <a href="/locale?value=ru"><img style="border: 1px solid;" src="/img/ru.png"></a>
        <a href="/locale?value=en"><img style="border: 1px solid;" src="/img/en.png"></a>


    </div>


</div>
</body>
