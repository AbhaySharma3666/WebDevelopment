package Cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/product")
public class ProductPageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();

        Cookie co[] = req.getCookies();
        boolean b =false;
        String name = "";
        if (co == null) {
            pw.println("Your can't enter the name!!");
            return;
        }else {
            for (Cookie c1:co){
                String tname = c1.getName();
                if (tname.equals("SavedName")){
                    b = true;
                    name = c1.getValue();
                }
            }
        }
        if(b) {
            pw.println(name + " Welcome to product page!!");
        }else {
            pw.println("Your are a new user!!");
        }
    }
}
