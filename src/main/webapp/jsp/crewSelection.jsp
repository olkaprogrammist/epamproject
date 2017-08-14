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
                <select>
                    <option>Евгений Стычкин</option>
                    <option>Олег Меньшиков</option>
                    <option>Василий Ливанов</option>
                    <option>Евгений Миронов</option>
                    <option>Константин Хабенский</option>
                    <option>Сергей Безруков</option>
                    <option>Дмитрий Дюжев</option>
                </select>
            </div>
            <div>
                <label>Second Pilot</label>
                <select>
                    <option>Петр Первый</option>
                    <option>Николай Второй</option>
                    <option>Екатерина Вторая</option>
                    <option>Елизавета Петровна</option>
                    <option>Английская королева</option>
                    <option>Принцесса Диана</option>
                    <option>Принц Чарльз</option>
                    <option>Джордж Клуни</option>
                    <option>Пирс Броснан</option>
                    <option>Джеймс МакЭвой</option>
                </select>
            </div>
        </section>
        <section class="selector">
            <label class="label">Select staff</label>
            <div>
                <label>Operator</label>
                <select>
                    <option>Светлана Устинова</option>
                    <option>Джуд Лоу</option>
                    <option>Марина Цветаева</option>
                    <option>Анна Ахматова</option>
                    <option>Александр Котт</option>
                    <option>Сергей Есенин</option>
                    <option>Виктория Дайнеко</option>
                </select>
            </div>
            <div>
                <label>Navigator</label>
                <select>
                    <option>Клара Цеткин</option>
                    <option>Сергей Дружко</option>
                    <option>Игорь Ливанов</option>
                    <option>Евгений Баженов</option>
                    <option>Дмитрий Маликов</option>
                    <option>Фаина Раневская</option>
                    <option>Дмитрий Нагиев</option>
                </select>
            </div>
        </section>
        <section class="selector">
            <label class="label">Select stewards</label>
            <div>
                <label>Steward 1</label>
                <select>
                    <option>Елена Малышева</option>
                    <option>Андрей Малахов</option>
                    <option>Дженифер Лопез</option>
                    <option>Зак Брафф</option>
                    <option>Тильда Суинтон</option>
                    <option>Бред Питт</option>
                    <option>Анжелина Джоли</option>
                </select>
            </div>
            <div>
                <label>Steward 2</label>
                <select>
                    <option>Меган Фокс</option>
                    <option>Кэти Пэрри</option>
                    <option>Криста Миллер</option>
                    <option>Эмма Стоун</option>
                    <option>Эмма Уотсон</option>
                    <option>Том Фэлтон</option>
                    <option>Кандализа Райс</option>
                </select>
            </div>
            <div>
                <label>Steward 3</label>
                <select>
                    <option>Дональд Трамп</option>
                    <option>Кайли Дженер</option>
                    <option>Ким Кардашьян</option>
                    <option>Кортни Лав</option>
                    <option>Корней Чуковский</option>
                    <option>Петр Чайковский</option>
                    <option>Ричард Бах</option>
                </select>
            </div>

        </section>
    </div>

    <div>
        <a href="dispConfirm.jsp">
        <button class="saveButton">SAVE</button></a>
    </div>


</div>
</body>
</html>