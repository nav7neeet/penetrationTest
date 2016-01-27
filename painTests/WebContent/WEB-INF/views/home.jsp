<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/WEB-INF/views/commonPage.jsp" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<a href="/painTest/restricted/testSql">SQL Injection</a><br>
<a href="/painTest/restricted/testXss">XSS</a><br>
<a href="/painTest/restricted/fraudWebsite">Fraud web site</a><br>
<a href="/painTest/restricted/testCsrf">CSRF</a><br>
<a href="/painTest/restricted/setInsecureCookies">Cookie Stealing</a><br>
<a href="/painTest/restricted/iframe">Click Jacking</a><br>
<a href="/painTest/restricted/admin">Role based authorisation</a><br>

</body>
</html>
