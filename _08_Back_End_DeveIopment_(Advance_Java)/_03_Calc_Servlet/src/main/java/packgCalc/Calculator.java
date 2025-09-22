package packgCalc;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Calculator extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");

        PrintWriter pw = res.getWriter();
        int num1 = Integer.parseInt(req.getParameter("firstbox"));
        int num2 = Integer.parseInt(req.getParameter("secondbox"));
        String choice = req.getParameter("cal");

        pw.println("<html><body>");
        pw.println("<h2>🧮 Calculation Result</h2>");

        if ("Addition".equalsIgnoreCase(choice)) {
            pw.println("<p>Addition is: " + (num1 + num2) + "</p>");
        } else if ("Subtract".equalsIgnoreCase(choice)) {
            pw.println("<p>Subtraction is: " + (num1 - num2) + "</p>");
        } else if ("Multiply".equalsIgnoreCase(choice)) {
            pw.println("<p>Multiplication is: " + (num1 * num2) + "</p>");
        } else if ("Divide".equalsIgnoreCase(choice)) {
            if (num2 != 0) {
                pw.println("<p>Division is: " + (num1 / num2) + "</p>");
            } else {
                pw.println("<p style='color:red;'>Cannot divide by zero.</p>");
            }
        } else {
            pw.println("<p style='color:red;'>Invalid operation selected.</p>");
        }

        pw.println("</body></html>");
    }
}
