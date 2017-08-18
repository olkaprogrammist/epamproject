<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <jsp:include page="/jsp/header.jsp"/>
</head>
<body>
<div id="wrapper">
    <fmt:bundle basename="language" prefix="menu.">
        <fmt:message key="list" var="list"/>
        <fmt:message key="exit" var="exit"/>
        <fmt:message key="create" var="create"/>
        <fmt:message key="readylist" var="readylist"/>
    </fmt:bundle>

    <sector  id="choiceSection">
        <form action="/flightList" method="post">
            <button> ${list} </button>
        </form>
        <form action="/flightList" method="post" >
           <button> ${readyList}</button>
        </form>
       <form action="/cities" method="post">
          <button> ${create} </button>
        </form>
        <form action="/logout" method="post">
            <button> ${exit} </button>
        </form>
    </sector>

</div>
</body>
</html>
