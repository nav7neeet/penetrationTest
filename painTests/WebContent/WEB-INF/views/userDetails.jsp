<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
		<h3>User details...</h3>

		<%
			List list = (List) request.getAttribute("details");
			Iterator iterator = list.iterator();
			int c=0;
			while (iterator.hasNext())
			{
				out.print(iterator.next()+" ");
				c++;
				if(c==3)
				{
					c=0;
					out.print("<br><br>");
				}
			}
		%>



</body>
</html>
