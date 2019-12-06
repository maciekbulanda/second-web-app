<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Test</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/mystyle.css" />">
</head>
<body>
    <div id="content">
        <t:insertAttribute name="body" />
    </div>
    <div id="footer">
        <t:insertAttribute name="footer" />
    </div>
</body>
</html>
