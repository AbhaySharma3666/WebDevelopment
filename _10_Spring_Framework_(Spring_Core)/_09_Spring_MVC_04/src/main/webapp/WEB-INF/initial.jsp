<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Main Page</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background: #f9f9f9;
      margin: 0;
      padding: 40px;
      text-align: center;
    }
    h1 {
      color: #2c3e50;
      margin-bottom: 20px;
    }
    h2 {
      color: #34495e;
    }
    a {
      text-decoration: none;
      color: #007bff;
      font-weight: bold;
    }
    a:hover {
      text-decoration: underline;
    }
    .card {
      background: #fff;
      display: inline-block;
      padding: 20px 40px;
      border-radius: 10px;
      box-shadow: 0 4px 8px rgba(0,0,0,0.1);
    }
  </style>
</head>
<body>
  <div class="card">
    <h1>View Part</h1>
    <%
		String txt=(String)request.getAttribute("text");	
	%>
    <h2><%=txt%></h2>
    <h3>Visit also : 
      <a href="http://localhost:8080/_09_Spring_MVC_04/register">/register</a>
    </h3>
  </div>
</body>
</html>
