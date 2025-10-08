<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Insert</title>
    <style>
        table {
            border: 5px solid green;
            border-collapse: collapse;
            margin: auto;
        }
        th, td {
            border: 1px solid green;
            padding: 10px 15px;
            text-align: center;
        }
        th {
            font-weight: bold;
        }
        h2, h3 {
            text-align: center;
        }
    </style>
</head>
<body>

<%
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    boolean insertSuccess = false;

    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    String email = request.getParameter("email");
    String country = request.getParameter("country");

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb", "root", "");

        if (id != null && name != null && password != null && email != null && country != null
            && !id.isEmpty() && !name.isEmpty() && !password.isEmpty() && !email.isEmpty() && !country.isEmpty()) {
            
            String q = "INSERT INTO emptbl (id, name, password, email, country) VALUES (?, ?, ?, ?, ?)";
            ps = con.prepareStatement(q);
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, password);
            ps.setString(4, email);
            ps.setString(5, country);
            int i = ps.executeUpdate();

            if (i > 0) {
                insertSuccess = true;
            }
            ps.close();
        }

        // Fetch records after insertion
        String q1 = "SELECT * FROM emptbl";
        ps = con.prepareStatement(q1);
        rs = ps.executeQuery();

%>

<% if (insertSuccess) { %>
    <h3 style="color: green;">Employee data saved successfully!</h3>
<% } %>

<h2>Employee Records</h2>
<table>
    <tr>
        <th>Emp ID</th>
        <th>Name</th>
        <th>Password</th>
        <th>Email</th>
        <th>Country</th>
    </tr>
<%
    while (rs.next()) {
%>
    <tr>
        <td><%= rs.getString("id") %></td>
        <td><%= rs.getString("name") %></td>
        <td><%= rs.getString("password") %></td>
        <td><%= rs.getString("email") %></td>
        <td><%= rs.getString("country") %></td>
    </tr>
<%
    }
    } catch (Exception e) {
        out.println("<h3 style='color:red;text-align:center;'>Error: " + e.getMessage() + "</h3>");
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (ps != null) ps.close(); } catch (Exception e) {}
        try { if (con != null) con.close(); } catch (Exception e) {}
    }
%>
</table>

</body>
</html>
