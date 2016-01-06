<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<html>
<head>
<meta http-equiv="refresh"
		content="<%=session.getMaxInactiveInterval()%>; url=timeOut"
>
<meta http-equiv="Cache-Control"
		content="no-cache, no-store, must-revalidate"
/>
<meta http-equiv="Pragma" content="no-cache" /> <%-- only required for browsers which dont support cache-control header --%>
<meta http-equiv="Expires" content="0" />
</head>
<body>
		<h3>
				<p>
						<font color="red"><a href="/painTest/logout">Logout</a></font>
						<a href="/painTest/restricted/home">Home</a>
				</p>
				Hi
				<%=session.getAttribute("user")%>, welcome to the fantasy world.<br>
		</h3>
</body>
</html>
