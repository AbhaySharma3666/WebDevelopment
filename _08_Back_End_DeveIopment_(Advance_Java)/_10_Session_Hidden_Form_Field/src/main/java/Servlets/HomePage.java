package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class HomePage extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        String n = req.getParameter("nametextbox");

        pw.println("<html><body>");
        pw.println("<h3>" + n + " Welcome to home page...</h3>");

        // Correct form tag (missing closing '>')
        pw.println("<form action='product'>");

        pw.println("<input type='hidden' name='textboxname' value='" + n + "'>");
        pw.println("<br>");
        pw.println("<input type='submit' value='Submit'>");
        pw.println("</form>"); // Close the form tag
        pw.println("</body></html>");
    }
}
