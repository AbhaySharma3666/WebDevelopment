package setgetAttribute;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/calURL")
public class calculation extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        response.setContentType("text.html");
        PrintWriter pw = response.getWriter();
        int n1 = Integer.parseInt(request.getParameter("first"));
        int n2 = Integer.parseInt(request.getParameter("second"));
        int multi = n1 * n2;

        pw.println("Multiply is : " + multi);
        int sum = (int) request.getAttribute("add");
        pw.println("Add is : " + sum);
    }
}
