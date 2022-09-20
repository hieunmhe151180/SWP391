package Controllers;

import Models.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonList extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Lay du lieu tu Model
        Person p = (Person)req.getSession().getAttribute("pSession");
        // resp.getWriter().print(acc.getRole());
        if(p.getType()==1){
            ArrayList<Person> person = new PersonDAO().getPersonList();
            req.setAttribute("person", person);
            req.getRequestDispatcher("../person.jsp").forward(req, resp);
            
        }
        else{
           resp.sendRedirect("../home");
        }
    }
    
}
