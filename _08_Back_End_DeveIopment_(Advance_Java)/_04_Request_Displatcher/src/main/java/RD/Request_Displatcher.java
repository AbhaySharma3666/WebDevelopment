<<<<<<< HEAD
package RD;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/formURL")
public class Request_Displatcher extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String user = request.getParameter("uname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String checkbox = request.getParameter("check");

        PrintWriter pw = response.getWriter();

        if (checkbox != null){
            pw.println("Registration is Successfully completed");
            pw.println("FName : "+ fname);
            pw.println("LName : "+ lname);
            pw.println("Username : "+ user);
            pw.println("Email : "+ email);
            pw.println("Password : "+ password);

            RequestDispatcher rd = request.getRequestDispatcher("successURL");
            rd.forward(request,response);
        }
        else {
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.include(request,response);
            pw.println("Please check Accept Term & Condition");
        }


    }
}
=======
package RD;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/formURL")
public class Request_Displatcher extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String user = request.getParameter("uname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String checkbox = request.getParameter("check");

        PrintWriter pw = response.getWriter();

        if (checkbox != null){
            pw.println("Registration is Successfully completed");
            pw.println("FName : "+ fname);
            pw.println("LName : "+ lname);
            pw.println("Username : "+ user);
            pw.println("Email : "+ email);
            pw.println("Password : "+ password);

            RequestDispatcher rd = request.getRequestDispatcher("successURL");
            rd.forward(request,response);
        }
        else {
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.include(request,response);
            pw.println("Please check Accept Term & Condition");
        }


    }
}
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
