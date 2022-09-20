package Controllers;

import Models.Person;
import Models.Movies;
import Models.MoviesDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class MoviesList extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Lay du lieu tu Model
        Person p = (Person)req.getSession().getAttribute("pSession");
        // resp.getWriter().print(acc.getRole());
        if(p.getType()==1){
            ArrayList<Movies> movies = new MoviesDAO().GetMovies();
            req.setAttribute("movies", movies);
            req.getRequestDispatcher("../movies.jsp").forward(req, resp);
            
        }
        else{
            resp.sendRedirect("../home");
        }
    }
    
}
