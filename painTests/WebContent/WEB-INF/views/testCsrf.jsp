<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/WEB-INF/views/commonPage.jsp"%>
<html>
<head>
<title>Test CSRF</title>
</head>
<body>
		<h3> Demystify CSRF</h3>
		<form action="csrf" method="get">
				Input - <input type="text" name="name" > <input type="submit">
				<input type="hidden" name="timeStamp" value="<%= session.getCreationTime()%>">
		</form>
		
</body>
</html>
