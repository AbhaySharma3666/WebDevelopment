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
	String n = request.getParameter("name");
	
	/*session.setAttribute("savedName", n);*/
	pageContext.setAttribute("savedName", n, PageContext.SESSION_SCOPE);
	out.print(n + " Welcome to JSP!!");
	%>
	<br>
	<a href="product.jsp">Go To Product page!!</a>
</body>
</html>