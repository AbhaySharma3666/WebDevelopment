<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>View Part... </h1>
	<h2>Search /myurl</h2>
	<%
		String name=(String)request.getAttribute("name");
		Integer id=(Integer)request.getAttribute("Id");
		List<String> city=(List<String>)request.getAttribute("cities");
		
	%>
	<h2>Your name is : 
		<%= name %>
	</h2>
	
	<h2>Your Id is : 
		<%= id %>
	</h2>
	
	<h3>List of cities : </h3>
		<% for(String s : city) out.println(s + "<br>"); %>
	
</body>
</html>