<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
    <title>Dodaj pojazd</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/mystyle.css" />">
</head>
<body>
<h2 class="header">
    Dodaj pojazd
</h2>
<div>
    <sf:form commandName="car">
        <p style="text-align: center; margin-top: 0"><b>Dane pojazdu</b></p>
        <label for="brand">Marka</label><br>
        <sf:input path="brand"/><sf:errors path="brand"/> <br>
        <label for="model">Model</label><br>
        <sf:input path="model"/><sf:errors path="model"/><br>
        <label for="registrationNumber">Nr rejestracyjny</label><br>
        <sf:input path="registrationNumber"/><sf:errors path="registrationNumber"/><br>
        <label for="numOfKilometers">Liczba przejechanych kilometrów</label><br>
        <input id="numOfKilometers" type="text" name="numberOfKilometers"/><br>
        <input type="submit" value="Dodaj"/><br>
    </sf:form>
</div>
</body>
</html>
