<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>
    Doc
</title>
</head>
<body>
Index page

<c:if test="${not empty user}">
    ${user.login}
</c:if>
</body>
</html>

