<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<html>
<head>
    <title>Test</title>
    <style>
        label {
            display: inline-block;
            width: 80px
        }
    </style>
</head>
<body>
<sf:form action="/test/process" commandName="test" modelAttribute="test" method="post">
    <sf:label path="val1">Label: </sf:label><sf:input path="val1"/><sf:errors path="val1"/>
    <input type="submit" value="OK"/>
</sf:form>
</body>
</html>
