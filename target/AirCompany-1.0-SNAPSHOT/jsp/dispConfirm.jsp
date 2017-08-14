<%--
  Created by IntelliJ IDEA.
  User: Olga
  Date: 25.07.2017
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/jsp/dispHeader.jsp"/>
</head>
<body>
<div id="wrapper">

    <section>
        <div class="info">
            <label class="label">FLIGHT:</label>
            ST.PETERSBURG - BARSELONA 24.07.17 15:25 - 24.07.17 19:40
        </div>
    </section>

    <div class="sector">
        <section class="selector">
            <label class="label">Select pilots</label>
            <div>
                <label>First Pilot</label>

                <option>Евгений Стычкин</option>

            </div>
            <div>
                <label>Second Pilot</label>

                <option>Петр Первый</option>

            </div>
        </section>
        <section class="selector">
            <label class="label">Select staff</label>
            <div>
                <label>Operator</label>

                <option>Виктория Дайнеко</option>

            </div>
            <div>
                <label>Navigator</label>

                <option>Дмитрий Нагиев</option>

            </div>
        </section>
        <section class="selector">
            <label class="label">Select stewards</label>
            <div>
                <label>Steward 1</label>

                <option>Елена Малышева</option>

            </div>
            <div>
                <label>Steward 2</label>

                <option>Меган Фокс</option>

            </div>
            <div>
                <label>Steward 3</label>

                <option>Ричард Бах</option>

            </div>

        </section>
    </div>

    <div>
        <a href="/jsp/dispFin.jsp">
        <button class="saveButton">CONFIRM</button></a>
    </div>


</div>
</body>
</html>