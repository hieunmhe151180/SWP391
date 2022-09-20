
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hieud
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("txtUser").trim();
        String password = req.getParameter("txtPass").trim();
        String check = req.getParameter("chkRemember").trim();
        String iUser = req.getServletContext().getInitParameter("user");
        String iPass = req.getServletContext().getInitParameter("password");
        if (user.equals(iUser) && password.equals(iPass)) {

            //tao ra cookie va luu gia tri cua user va password 
            if(check!=null){
                Cookie uCookie = new Cookie("u", user);
                Cookie pCookie = new Cookie("p", password);
                uCookie.setMaxAge(60*60*24);
                pCookie.setMaxAge(60*60*24);
            }
            resp.sendRedirect("welcome");
        } else {
            resp.sendRedirect("Login.html");
        }
    }

}
