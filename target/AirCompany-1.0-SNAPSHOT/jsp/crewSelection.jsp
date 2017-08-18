<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <jsp:include page="/jsp/dispHeader.jsp"/>
</head>
<body>
<div id="wrapper">

    <section>
        <div class="info">
            <label class="label">Номер рейса: ${flight_id}</label>


        </div>
    </section>
    <form action="/journal" method="post">
        <input type="hidden" name="flight_id" value="${flight_id}">
        <div class="sector">
            <section class="selector">
                <label class="label">Выберите пилотов</label>
                <div>
                    <label>Первый пилот</label>
                    <select name="staff_id">
                        <option>Выберите пилота</option>
                        <c:forEach items="${list}" var="staff">
                            <c:if test="${staff.position == \"пилот\"}">
                                <option value="${staff.id}"><c:out value="${staff.name}"/></option>
                            </c:if>
                        </c:forEach>
                    </select>
                </div>
                <div>
                    <label>Второй пилот</label>
                    <select name="staff_id">
                        <option>Выберите пилота</option>
                        <c:forEach items="${list}" var="staff">
                            <c:if test="${staff.position == \"пилот\"}">
                                <option value="${staff.id}"><c:out value="${staff.name}"/></option>
                            </c:if>
                        </c:forEach>
                    </select>
                </div>
            </section>
            <section class="selector">
                <label class="label">Выберите экипаж</label>
                <div>
                    <label>Радист</label>
                    <select name="staff_id">
                        <option>Выберите радиста</option>
                        <c:forEach items="${list}" var="staff">
                            <c:if test="${staff.position == \"радист\"}">
                                <option value="${staff.id}"><c:out value="${staff.name}"/></option>
                            </c:if>
                        </c:forEach>
                    </select>
                </div>
                <div>
                    <label>Штурман</label>
                    <select name="staff_id">
                        <option>Выберите штурмана</option>
                        <c:forEach items="${list}" var="staff">
                            <c:if test="${staff.position == \"штурман\"}">
                                <option value="${staff.id}"><c:out value="${staff.name}"/></option>
                            </c:if>
                        </c:forEach>
                    </select>
                </div>
            </section>
            <section class="selector">
                <label class="label">Выберите стюардов</label>
                <div>
                    <label>Стюард 1</label>
                    <select name="staff_id">
                        <option>Выберите стюарда</option>
                        <c:forEach items="${list}" var="staff">
                            <c:if test="${staff.position == \"стюард\"}">
                                <option value="${staff.id}"><c:out value="${staff.name}"/></option>
                            </c:if>
                        </c:forEach>
                    </select>
                </div>
                <div>
                    <label>Стюард 2</label>

                    <select name="staff_id">
                        <option>Выберите стюарда</option>
                        <c:forEach items="${list}" var="staff">
                            <c:if test="${staff.position == \"стюард\"}">
                                <option value="${staff.id}"><c:out value="${staff.name}"/></option>
                            </c:if>
                        </c:forEach>
                    </select>
                </div>
                <div>
                    <label>Стюард 3</label>
                    <select name="staff_id">
                        <option>Выберите стюарда</option>
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
            <button type="submit" class="saveButton">SAVE</button>
        </div>
    </form>

</div>
</body>
</html>