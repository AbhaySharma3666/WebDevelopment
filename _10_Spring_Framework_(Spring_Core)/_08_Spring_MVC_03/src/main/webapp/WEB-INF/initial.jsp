<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>IMain Page</title>
</head>
<body>
	<h1>View Part... </h1>
	<%
		String txt=(String)request.getAttribute("text");
		
	%>
	<h2><%= txt %></h2>
	<h3>Visit also : <a href="http://localhost:8080/_08_Spring_MVC_03/form">/form</a></h3>

</body>
</html>