<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/WEB-INF/views/commonPage.jsp" %>
<html>
<head>
	<title>CSRF Result</title>
</head>
<body>

<% String errorMessage= (String)request.getAttribute("errorMessage"); 
	if(errorMessage==null)
	{
		out.print("No csrf man!");
	}
	else
	{
		out.println("Dude its csrf");
	}
%>



</body>
</html>
