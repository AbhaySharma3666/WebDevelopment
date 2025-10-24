<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println("You are on product page...");
		
		/* skip current page or redirect */
		response.sendRedirect("http://www.google.com");
	%>
	

</body>
</html>