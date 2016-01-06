<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/WEB-INF/views/commonPage.jsp" %>

<html>
<head>

	<title>Fraud Website</title>
</head>
<body>
<h3>Fraud website, it sends a GET request to another website which a normal user cannot see</h3>
<br><br>
You can see the batman image but you cant see what went behind the scene. Check console Man!<br>
<img src="http://localhost:8080/painTest/fraud?creationTime=<%= session.getCreationTime() %>" width="0" height="0" >
<img  src="images/batman.PNG">

</body>
</html>
