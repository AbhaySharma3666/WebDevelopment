package loginServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/profileservlet")
public class ProfileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        // Always include the glassmorphism-styled link.html
        req.getRequestDispatcher("link.html").include(req, resp);

        HttpSession session = req.getSession(false);
        if (session != null && session.getAttribute("SUname") != null) {
            String uname = (String) session.getAttribute("SUname");

            // Inject welcome message into the 'welcome' div in link.html
            pw.println("<script>");
            pw.println("const welcomeDiv = document.querySelector('.welcome');");
            pw.println("welcomeDiv.innerHTML = '<h2>Welcome, " + uname + "!</h2><p>Your Personal Data here !!....</p>';");
            pw.println("welcomeDiv.style.color = 'lightgreen';");
            pw.println("</script>");
        } else {
            // Inject login warning
            pw.println("<script>");
            pw.println("document.querySelector('.welcome').innerHTML = '⚠ Please login to view your profile.';");
            pw.println("document.querySelector('.welcome').style.color = 'red';");
            pw.println("</script>");
        }
    }
}
