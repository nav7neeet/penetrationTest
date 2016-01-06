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
<body >
Missile Man takes off!

<div id="test" onload="alert(5)">
<form action="csrf" name="testCsrf" onload="alert(1)">
	<input type="text" name="name" value="csrf Unleashe">
	<input type="submit" >
</form>
</div>
</body>
</html>