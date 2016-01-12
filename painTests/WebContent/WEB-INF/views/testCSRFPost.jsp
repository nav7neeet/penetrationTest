<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
	function	submitForm()
	{
		document.getElementById("testCsrf").submit();
	}
</script>

</head>
<body onload="document.forms[0].submit()">
Missile Man takes off!

<form action="/painTest/restricted/csrf" name="testCsrf" method="post">
	<input type="text" name="name" value="csrf Unleashedd">
	<input type="submit" >
</form>
</body>
</html>