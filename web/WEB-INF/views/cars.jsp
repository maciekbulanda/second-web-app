<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Samochody</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/mystyle.css" />">
</head>
<body>
<h2>Flota</h2>
<c:forEach items="${carList}" var="car">
<li>${car.brand} ${car.model} <b>${car.registrationNumber}</b><br></li>
</c:forEach>

</body>
</html>
