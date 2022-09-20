/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.GenresDAO;
import Models.MoviesDAO;
import Models.Person;
import Models.PersonDAO;
import Models.RatesDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hieud
 */
public class DashBoardController extends HttpServlet{
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         Person p = (Person)req.getSession().getAttribute("pSession");
//         resp.getWriter().print(p.getType());
        if (p.getType() == 1) {
            RatesDAO rdao = new RatesDAO();
            MoviesDAO mdao = new MoviesDAO();
            PersonDAO pdao = new PersonDAO();
            GenresDAO gdao = new GenresDAO();
            req.setAttribute("mSize", mdao.GetMovies().size());
            req.setAttribute("pSize", pdao.getPersonList().size());
            req.setAttribute("rSize", rdao.GetRates().size());
            req.setAttribute("gSize", gdao.GetGenres().size());
            req.getRequestDispatcher("../dashboard.jsp").forward(req, resp);
        }
        else{
           resp.sendRedirect("../home");
        }

    }
}
