<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>View Part... </h1>
	<%
		String txt=(String)request.getAttribute("text");
		
	%>
	<h2>Search : 
		<%= txt %>
	</h2>
	<h3>Visit also /myurl : <a href="http://localhost:8080/_07_Spring_MVC_02/myurl">myurl</a></h3>

</body>
</html>