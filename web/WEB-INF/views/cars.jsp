<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Samochody</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/mystyle.css" />">
</head>
<body>
    <h2 class="header">Flota</h2>
    <table>
        <tr><th>Samochód</th><th>Nr rejestracyjny</th></tr>
        <c:forEach items="${carList}" var="car">
            <tr>
                <td>${car.brand} ${car.model}</td><td>${car.registrationNumber}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="<c:url value="/cars/carAdd"/>">Dodaj</a>
</body>
</html>
