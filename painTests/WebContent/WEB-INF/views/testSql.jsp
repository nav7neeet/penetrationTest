<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="/WEB-INF/views/commonPage.jsp" %>
<html>
<head>
<title>Test SQL Injection</title>
</head>
<body>
		<h3>Demystify Sql Injection</h3>

		<form action="sql" method="post">
				First name - <input type="text" name="name"> <input
						type="submit"
				>
		</form>
</body>
</html>
