<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<html>
<head>
    <title>Dane samochodu</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/mystyle.css" />">
</head>
<body>
<div>
    <sf:form commandName="car">
        <sf:input path="brand"/><sf:errors path="brand"/><br>
        <sf:input path="model"/><sf:errors path="model"/><br>
        <sf:input path="registrationNumber"/><sf:errors path="registrationNumber"/><br>
    </sf:form>
</div>
</body>
</html>
