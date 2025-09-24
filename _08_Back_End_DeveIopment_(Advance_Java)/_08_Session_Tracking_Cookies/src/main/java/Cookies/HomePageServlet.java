package Cookies;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class HomePageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        String name = req.getParameter("nametextbox");

        pw.println(name + " You Are On Home Page !!");

        Cookie co = new Cookie("SavedName",name);
        resp.addCookie(co);

        pw.println("<a href='product'><br>Go To Product Page</a>");

    }
}
