<%@ page import="java.util.ResourceBundle" %>
<%@ page import="java.util.Locale" %>
<%@ page import="java.util.HashMap" %>

<%@ page import="java.util.Map" %>

<%--    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib uri='http://java.sun.com/jsp/jstl/fmt' prefix='fmt' %>
  Created by IntelliJ IDEA.
  User: Olga
  Date: 21.07.2017
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8"/>
    <meta name="description" content="aircompany project"/>
    <title>AIRCOMPANY</title>
    <link rel="stylesheet" href="/css/mystyles.css">
    <link rel="stylesheet" href="/css/menustyles.css">
</head>
<body>
<div id="wrapper">
    <header>
        <h1 id="header">AIRCOMPANY</h1>
    </header>
    <nav id="bookmarksA" class="nav" >
        <ul>
            <li>Все рейсы</li>
            <li>Обработанные</li>
           <a href="/jsp/createFlight.jsp"> <li>Новый рейс</li> </a>
        </ul>
    </nav>

</div>
</body>
