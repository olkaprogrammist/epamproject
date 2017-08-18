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

    <fmt:bundle basename="language" prefix="crewSelection.">
        <fmt:message key="operator" var="operator"/>
        <fmt:message key="navigator" var="navigator"/>
        <fmt:message key="steward" var="steward"/>
        <fmt:message key="first_pilot" var="first_pilot"/>
        <fmt:message key="second_pilot" var="second_pilot"/>
        <fmt:message key="accept" var="accept"/>
        <fmt:message key="number" var="number"/>
    </fmt:bundle>
    <section>
        <div class="info">
            <label class="label">${number} ${flight_id}</label>
        </div>
    </section>
    <input type="hidden" name="flight_id" value="${flight_id}">
    <div class="sector">
        <section class="selector">
            <div>
                <label>${first_pilot}</label>
                <c:forEach items="${firstPilotList}" var="list">
                    <h3><c:out value="${list.name}"/></h3>
                </c:forEach>
            </div>
            <div>
                <label>${second_pilot}</label>
                <c:forEach items="${secondPilotList}" var="list">
                    <h3><c:out value="${list.name}"/></h3>
                </c:forEach>
            </div>
        </section>
        <section class="selector">

            <div>
                <label>${operator}</label>
                <c:forEach items="${operatorList}" var="list">
                    <h3><c:out value="${list.name}"/></h3>
                </c:forEach>
            </div>
            <div>
                <label>${navigator}</label>
                <c:forEach items="${navigatorList}" var="list">
                    <h3><c:out value="${list.name}"/></h3>
                </c:forEach>
            </div>
        </section>
        <section class="selector">

            <div>
                <label>${steward}</label>
                <c:forEach items="${steward1List}" var="list">
                    <h3><c:out value="${list.name}"/></h3>
                </c:forEach>
            </div>
            <div>
                <label>${steward}</label>
                <c:forEach items="${steward2List}" var="list">
                    <h3><c:out value="${list.name}"/></h3>
                </c:forEach>

            </div>
            <div>
                <label>${steward}</label>
                <c:forEach items="${steward3List}" var="list">
                    <h3><c:out value="${list.name}"/></h3>
                </c:forEach>

            </div>

        </section>
    </div>

    <div>
        <button type="submit" class="saveButton">${accept}</button>
    </div>
    </form>

</div>
</body>
</html>