package Controllers;

import Models.*; 
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class RatesList extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Lay du lieu tu Model
        Person p = (Person)req.getSession().getAttribute("pSession");
        // resp.getWriter().print(acc.getRole());
        if(p.getType()==1){
            ArrayList<Rates> rates = new RatesDAO().GetRates();
            req.setAttribute("rates", rates);
            req.getRequestDispatcher("../rates.jsp").forward(req, resp);
            
        }
        else{
            resp.sendRedirect("../home");
        }
    }
    
}
