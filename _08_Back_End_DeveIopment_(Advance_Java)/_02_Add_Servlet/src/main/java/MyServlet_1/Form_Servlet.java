<<<<<<< HEAD
package MyServlet_1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/formUrl")
// we also do in web.app-->web.xml
public class Form_Servlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        // Extract form data from the request
        String fullname = request.getParameter("fullname");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String[] skills = request.getParameterValues("skills[]");

        // Set response content type
        response.setContentType("text/html");

        // Output response
        PrintWriter pw = response.getWriter();

        pw.println("<html><head><title>Form Submission</title></head><body>");
        pw.println("<h2>Welcome, " + fullname + "!</h2>");
        pw.println("<h3>Your Personal Information:</h3>");
        pw.println("<p><strong>Full Name:</strong> " + fullname + "</p>");
        pw.println("<p><strong>Date of Birth:</strong> " + dob + "</p>");
        pw.println("<p><strong>Gender:</strong> " + gender + "</p>");
        pw.println("<p><strong>Email:</strong> " + email + "</p>");
        pw.println("<p><strong>Phone Number:</strong> " + phone + "</p>");
        pw.println("<p><strong>Address:</strong> " + address + "</p>");

        // Show selected skills
        pw.println("<p><strong>Skills:</strong> ");
        if (skills != null && skills.length > 0) {
            for (String skill : skills) {
                pw.print(skill + ", ");
            }
        } else {
            pw.print("None");
        }
        pw.println("</p>");

        pw.println("</body></html>");
    }
}
=======
package MyServlet_1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/formUrl")
// we also do in web.app-->web.xml
public class Form_Servlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        // Extract form data from the request
        String fullname = request.getParameter("fullname");
        String dob = request.getParameter("dob");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");
        String[] skills = request.getParameterValues("skills[]");

        // Set response content type
        response.setContentType("text/html");

        // Output response
        PrintWriter pw = response.getWriter();

        pw.println("<html><head><title>Form Submission</title></head><body>");
        pw.println("<h2>Welcome, " + fullname + "!</h2>");
        pw.println("<h3>Your Personal Information:</h3>");
        pw.println("<p><strong>Full Name:</strong> " + fullname + "</p>");
        pw.println("<p><strong>Date of Birth:</strong> " + dob + "</p>");
        pw.println("<p><strong>Gender:</strong> " + gender + "</p>");
        pw.println("<p><strong>Email:</strong> " + email + "</p>");
        pw.println("<p><strong>Phone Number:</strong> " + phone + "</p>");
        pw.println("<p><strong>Address:</strong> " + address + "</p>");

        // Show selected skills
        pw.println("<p><strong>Skills:</strong> ");
        if (skills != null && skills.length > 0) {
            for (String skill : skills) {
                pw.print(skill + ", ");
            }
        } else {
            pw.print("None");
        }
        pw.println("</p>");

        pw.println("</body></html>");
    }
}
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
