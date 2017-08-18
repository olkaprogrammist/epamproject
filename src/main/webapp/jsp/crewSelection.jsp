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
        <fmt:message key="chose_pilots" var="chose_pilots"/>
        <fmt:message key="chose_staff" var="chose_staff"/>
        <fmt:message key="chose_stewards" var="chose_stewards"/>
        <fmt:message key="first_pilot" var="first_pilot"/>
        <fmt:message key="second_pilot" var="second_pilot"/>
        <fmt:message key="save" var="save"/>
        <fmt:message key="number" var="number"/>
    </fmt:bundle>
    <section>
        <div class="info">
            <label class="label">${number} ${flight_id}</label>
        </div>
    </section>
    <form action="/journal" method="post">
        <input type="hidden" name="flight_id" value="${flight_id}">
        <div class="sector">
            <section class="selector">
                <label class="label">${chose_pilots}</label>
                <div>
                    <label>${first_pilot}</label>
                    <select name="staff_id">
                        <option>${chose_pilots}</option>
                        <c:forEach items="${list}" var="staff">
                            <c:if test="${staff.position == \"пилот\"}">
                                <option value="${staff.id}"><c:out value="${staff.name}"/></option>
                            </c:if>
                        </c:forEach>
                    </select>
                </div>
                <div>
                    <label>${second_pilot}</label>
                    <select name="staff_id">
                        <option>${chose_pilots}</option>
                        <c:forEach items="${list}" var="staff">
                            <c:if test="${staff.position == \"пилот\"}">
                                <option value="${staff.id}"><c:out value="${staff.name}"/></option>
                            </c:if>
                        </c:forEach>
                    </select>
                </div>
            </section>
            <section class="selector">
                <label class="label">${chose_staff}</label>
                <div>
                    <label>${operator}</label>
                    <select name="staff_id">
                        <option>${operator}</option>
                        <c:forEach items="${list}" var="staff">
                            <c:if test="${staff.position == \"радист\"}">
                                <option value="${staff.id}"><c:out value="${staff.name}"/></option>
                            </c:if>
                        </c:forEach>
                    </select>
                </div>
                <div>
                    <label>${navigator}</label>
                    <select name="staff_id">
                        <option>${navigator}</option>
                        <c:forEach items="${list}" var="staff">
                            <c:if test="${staff.position == \"штурман\"}">
                                <option value="${staff.id}"><c:out value="${staff.name}"/></option>
                            </c:if>
                        </c:forEach>
                    </select>
                </div>
            </section>
            <section class="selector">
                <label class="label">${chose_stewards}</label>
                <div>
                    <label>${steward}</label>
                    <select name="staff_id">
                        <option>${chose_stewards}</option>
                        <c:forEach items="${list}" var="staff">
                            <c:if test="${staff.position == \"стюард\"}">
                                <option value="${staff.id}"><c:out value="${staff.name}"/></option>
                            </c:if>
                        </c:forEach>
                    </select>
                </div>
                <div>
                    <label>${steward}</label>

                    <select name="staff_id">
                        <option>${chose_stewards}</option>
                        <c:forEach items="${list}" var="staff">
                            <c:if test="${staff.position == \"стюард\"}">
                                <option value="${staff.id}"><c:out value="${staff.name}"/></option>
                            </c:if>
                        </c:forEach>
                    </select>
                </div>
                <div>
                    <label>${steward}</label>
                    <select name="staff_id">
                        <option>${chose_stewards}</option>
                        <c:forEach items="${list}" var="staff">
                            <c:if test="${staff.position == \"стюард\"}">
                                <option value="${staff.id}"><c:out value="${staff.name}"/></option>
                            </c:if>
                        </c:forEach>
                    </select>
                </div>

            </section>
        </div>

        <div>
            <button type="submit" class="saveButton">${save}</button>
        </div>
    </form>

</div>
</body>
</html>