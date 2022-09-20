package Controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import Models.*;

public class signup extends HttpServlet {
    
     

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("../signup.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Person per = new Person(
                req.getParameter("Fullname"),
                req.getParameter("Gender"),
                req.getParameter("Email"),
                req.getParameter("Password"),
                2,
                Boolean.TRUE
        );
    
        // Goi ham o DAO de insert
        if (new PersonDAO().insertPerson(per)>0) {
            resp.sendRedirect("login");
        }
    }
}
