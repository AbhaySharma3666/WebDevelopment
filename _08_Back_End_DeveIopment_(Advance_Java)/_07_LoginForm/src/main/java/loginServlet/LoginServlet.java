package loginServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        String uname = req.getParameter("username");
        String password = req.getParameter("password");

        if ("java".equals(password)) {
            // Create session and store username
            HttpSession session = req.getSession();
            session.setAttribute("SUname", uname);

            // Include navigation page and greet user
            req.getRequestDispatcher("link.html").include(req, resp);
            pw.println("<script>");
            pw.println("document.querySelector('.welcome').innerHTML = 'Welcome, " + uname + "!';");
            pw.println("</script>");

        } else {
            // Show error and reload login page
            pw.println("<h3 style='color:red; text-align:center'>Invalid username or password!</h3>");
            req.getRequestDispatcher("Login.html").include(req, resp);
        }
    }
}
