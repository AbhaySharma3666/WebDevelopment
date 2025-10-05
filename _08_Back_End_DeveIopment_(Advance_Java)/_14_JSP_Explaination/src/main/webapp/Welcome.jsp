<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Default JSP Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 40px;
        }

        h1 {
            color: #333;
        }

        p {
            color: #555;
        }

        a {
            text-decoration: none;
            color: #007bff;
        }

        a:hover {
            color: #0056b3;
        }
    </style>
</head>
<body>

    <h1>Welcome to My JSP Page</h1>
    <p>This is a basic JSP template with HTML and embedded Java code.</p>

    <hr>

    <h3>Current Date & Time:</h3>
    <%
        java.util.Date date = new java.util.Date();
        out.print("Date: " + date + "<br>");
    %>
    <%! int x =10; %>    <%
        String n = request.getParameter("name");
        out.println("Welcome....." + n + "<br>");

        out.println("Scriptlet tag : " + x + "<br>");
    %>
    <%= "Expression tag : " + x + "<br>" %>

    <a href="index.html">Back to Home</a>

</body>
</html>
