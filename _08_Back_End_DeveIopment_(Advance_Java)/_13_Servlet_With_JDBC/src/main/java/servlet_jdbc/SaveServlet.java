package servlet_jdbc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        try {
            String name = req.getParameter("full-name");
            String dob = req.getParameter("birthday");
            String gender = req.getParameter("gender");
            String email = req.getParameter("email");
            String phone = req.getParameter("phone");
            String subject = req.getParameter("subject");

            // Debug: Print received parameters
            System.out.println("Received - Name: " + name + ", DOB: " + dob + ", Gender: " + gender + ", Email: " + email + ", Phone: " + phone + ", Subject: " + subject);

            Student_Info si = new Student_Info();
            si.setName(name);
            si.setDob(dob);
            si.setGender(gender);
            si.setEmail(email);
            si.setPhone(phone);
            si.setSubject(subject);

            int status = DbOperation.save(si);

            if (status > 0) {
                pw.println("<h2>Record saved Successfully!</h2>");
                req.getRequestDispatcher("index.html").include(req, resp);
            } else {
                pw.println("<h2>Sorry!! Unable to save Record</h2>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            pw.println("<h2>Error: " + e.getMessage() + "</h2>");
        }
    }
}
