package servlet_jdbc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        // HTML + CSS
        pw.println("<!DOCTYPE html>");
        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Student List</title>");
        pw.println("<style>");
        pw.println("body { font-family: Arial, sans-serif; background-color: #f5f7fa; margin: 40px; }");
        pw.println("h2 { color: #333; text-align: center; }");
        pw.println("a { display: inline-block; margin-bottom: 20px; color: #fff; background-color: #007bff; padding: 10px 20px; text-decoration: none; border-radius: 4px; }");
        pw.println("a:hover { background-color: #0056b3; }");

        pw.println("table { border-collapse: collapse; width: 100%; background-color: #ffffff; box-shadow: 0 0 10px rgba(0,0,0,0.1); }");
        pw.println("th, td { text-align: left; padding: 12px; border-bottom: 1px solid #ddd; }");
        pw.println("th { background-color: #007bff; color: white; }");
        pw.println("tr:hover { background-color: #f1f1f1; }");
        pw.println("</style>");
        pw.println("</head>");
        pw.println("<body>");

        pw.println("<a href='index.html'>➕ Add New Student</a>");
        pw.println("<h2>📋 Student List</h2>");

        List<Student_Info> list = DbOperation.getAllStudent();

        pw.println("<table>");
        pw.println("<tr>" +
                "<th>Id</th>" +
                "<th>Name</th>" +
                "<th>DOB</th>" +
                "<th>Gender</th>" +
                "<th>Email</th>" +
                "<th>Phone</th>" +
                "<th>Subject</th>" +
                "</tr>");

        for (Student_Info s : list) {
            pw.println("<tr>" +
                    "<td>" + s.getId() + "</td>" +
                    "<td>" + s.getName() + "</td>" +
                    "<td>" + s.getDob() + "</td>" +
                    "<td>" + s.getGender() + "</td>" +
                    "<td>" + s.getEmail() + "</td>" +
                    "<td>" + s.getPhone() + "</td>" +
                    "<td>" + s.getSubject() + "</td>" +
                    "</tr>");
        }

        pw.println("</table>");
        pw.println("</body>");
        pw.println("</html>");

        pw.close();
    }
}
