<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="window-target" content="_top">
<meta >
	<title>Click Jacking</title>
</head>
<% response.addHeader("X-Frame-Options", "SAMEORIGIN"); %>
<body>
<h3>Inserted Frame</h3>

</body>
</html>
