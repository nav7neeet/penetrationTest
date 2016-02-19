<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/WEB-INF/views/commonPage.jsp"%>
<html>
<head>
<title>Test CSRF</title>
</head>
<body>
		<h3> Demystify CSRF</h3>
		<form action="csrf" method="get">
				Email - <input type="text" name="email" > <input type="submit" value="update email">
				<input type="hidden" name="antiCSRFToken" value="<%= session.getCreationTime()%>">
		</form>
		
</body>
</html>
