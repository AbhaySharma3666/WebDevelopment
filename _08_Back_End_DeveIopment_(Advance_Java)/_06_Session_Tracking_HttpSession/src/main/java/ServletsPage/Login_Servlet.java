package ServletsPage;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class Login_Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        String name = request.getParameter("name");

        if (name == null || name.trim().isEmpty()) {
            pw.println("<html><body>");
            pw.println("<h2>Invalid input: Name cannot be empty.</h2>");
            pw.println("</body></html>");
            return;
        }

        HttpSession session = request.getSession();
        session.setAttribute("savedSession", name);
        session.setMaxInactiveInterval(1 * 60); // Optional session timeout (6sec)

        pw.println("<html><body>");
        pw.println("<h2>Hello, " + name + "! You are on the Login Page.</h2>");
        pw.println("<a href='home'>Go To HOME Page</a>");
        pw.println("</body></html>");
    }
}