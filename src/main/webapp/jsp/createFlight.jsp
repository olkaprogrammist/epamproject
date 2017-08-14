<%--
  Created by IntelliJ IDEA.
  User: Olga
  Date: 21.07.2017
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/jsp/adminHeader.jsp"/>
</head>
<body>
<div id="wrapper">
<sector class="selector">
    <div>
    <label> Место отправления </label>
    <select>
        <option>Москва</option>
        <option>Питер</option>
        <option>Немосква</option>
        <option>Непитер</option>
        <option>Таллин</option>
        <option>Неталлин</option>
        <option>Нарва</option>
        <option>Ненарва</option>

    </select>
    </div>
    <div>
        <label> Место прибытия </label>
        <select>
            <option>Москва</option>
            <option>Питер</option>
            <option>Немосква</option>
            <option>Непитер</option>
            <option>Таллин</option>
            <option>Неталлин</option>
            <option>Нарва</option>
            <option>Ненарва</option>

        </select>
    </div>
    <div>
        <label> Время/Дата отправления </label>
        <select>
            <option>10 00 </option>
            <option>12 30</option>
            <option>16 00</option>
            <option>17 14</option>
            <option>17 48</option>
            <option>19 30</option>
            <option>21 57</option>
            <option>00 45</option>

        </select>
    </div>
    <div>
        <label> Время/Дата прибытия </label>
        <select>
            <option>10 00 </option>
            <option>12 30</option>
            <option>16 00</option>
            <option>17 14</option>
            <option>17 48</option>
            <option>19 30</option>
            <option>21 57</option>
            <option>00 45</option>

        </select>
    </div>

    <button> SAVE </button>
</sector>

</div>
</body>
</html>
