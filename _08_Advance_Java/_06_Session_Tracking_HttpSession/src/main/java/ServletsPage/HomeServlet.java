package ServletsPage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/home")
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        HttpSession session = req.getSession();
        String name2 = (String) session.getAttribute("savedSession");

        if (name2 == null) {
            pw.println("<h2>You are not logged in. <a href='login.html'>Login here</a></h2>");
            return;
        }
        pw.println("Welcome.. " + name2);

        pw.println("<html><body>");
        pw.println("<h2>Welcome.. " + name2 + "</h2>");
        pw.println("<h3><a href='product'>Go To Product Page!!</a></h3>");
        pw.println("</body></html>");
    }
}
