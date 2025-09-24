package ServletsPage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        HttpSession session = req.getSession();
        String name3 = (String) session.getAttribute("savedSession");

        if (name3 == null) {
            pw.println("<html><body>");
            pw.println("<h2>You are not logged in. <a href='login.html'>Login here</a></h2>");
            pw.println("</body></html>");
            return;
        }

        pw.println("<html><body>");
        pw.println("<h2>Welcome back, " + name3 + "! You are on the Product Page.</h2>");
        pw.println("<h3><a href='login'>Go To Login Page</a></h3>");
        pw.println("</body></html>");
    }
}
