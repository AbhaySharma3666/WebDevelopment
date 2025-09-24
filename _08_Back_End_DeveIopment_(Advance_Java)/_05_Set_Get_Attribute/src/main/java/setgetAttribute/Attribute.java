package setgetAttribute;
// in this we print the output in another java class then print

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/addURL")
public class Attribute extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter pw = response.getWriter();
        int n1 = Integer.parseInt(request.getParameter("first"));
        int n2 = Integer.parseInt(request.getParameter("second"));
        int sum = n1+n2;

        // Set Attribute
        request.setAttribute("add",sum);

        RequestDispatcher rd = request.getRequestDispatcher("calURL");
        rd.forward(request,response);

    }

}
