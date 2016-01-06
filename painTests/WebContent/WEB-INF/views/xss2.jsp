<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/WEB-INF/views/commonPage.jsp"%>
<html>
<head>

<title>XSS</title>
<%
	String name = (String) request.getAttribute("userInput");
%>
</head>
<body>
		<h4>Using user input in attribute without quotes</h4>
		<br>
		<a href=http://www.google.com /<%=name%>> Google</a>

</body>
</html>
