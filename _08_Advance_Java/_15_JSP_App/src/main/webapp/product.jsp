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
		/*String n = (String)session.getAttribute("savedName");*/
		String n = (String)pageContext.getAttribute("savedName", PageContext.SESSION_SCOPE);
		out.println(n + " You are on Product Page.");
	%>
	<br>
	<a href="contact.jsp" >Go To contact page</a>
</body>
</html>