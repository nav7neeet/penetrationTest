<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta >
	<title>Click Jacking</title>
</head>
<% response.addHeader("X-Frame-Options", "allow"); %>
<body>
<h3>Non-Evil Frame</h3>
<form action="nonEvilWebsite">
<input type="text"  name="test" value="yes">
<input type="submit">
</form>
</body>
</html>
