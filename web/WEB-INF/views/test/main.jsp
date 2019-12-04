<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<html>
<head>
    <title>Test</title>
</head>
<body>
<sf:form action="/test/process" commandName="test" method="post">
    <sf:input path="val1"/><sf:errors path="val1"/>
    <input type="submit" value="OK"/>
</sf:form>
</body>
</html>
