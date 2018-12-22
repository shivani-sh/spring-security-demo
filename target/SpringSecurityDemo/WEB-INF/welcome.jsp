<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page session="true" %>
<html>
<body>
<h1>Title : ${title}</h1>
<h1>Message : ${message}</h1>

<c:url value="/logout" var="logoutUrl"/>

<!-- csrt for log out-->
<c:url value="/logout" var="logoutUrl" />
<form id="logout" action="${logoutUrl}" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
<c:if test="${pageContext.request.userPrincipal.name != null}">
    <a href="javascript:document.getElementById('logout').submit()">Logout</a>
</c:if>


</body>
</html>