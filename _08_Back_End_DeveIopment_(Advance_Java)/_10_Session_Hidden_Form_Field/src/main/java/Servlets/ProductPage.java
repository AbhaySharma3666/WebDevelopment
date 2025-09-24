package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/product")
public class ProductPage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        String n = req.getParameter("textboxname");

        pw.println("<html><body>");

        if (n != null && !n.isEmpty()) {
            pw.println("<h3>" + n + " Welcome to Product Page...</h3>");
        } else {
            pw.println("<h3>Welcome to Product Page... (No Name Found)</h3>");
        }

        pw.println("</body></html>");
    }
}
