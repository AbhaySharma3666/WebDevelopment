package loginServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/logservlet")
public class LogOutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        // Invalidate session
        HttpSession session = req.getSession(false);
        if (session != null) {
            session.invalidate();
        }

        // Include the styled link.html page
        req.getRequestDispatcher("link.html").include(req, resp);

        // Inject logout message into the .welcome div
        pw.println("<script>");
        pw.println("document.querySelector('.welcome').innerHTML = '🔒 You have successfully logged out!';");
        pw.println("document.querySelector('.welcome').style.color = 'red';");
        pw.println("</script>");
    }
}
