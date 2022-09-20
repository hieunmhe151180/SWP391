package Controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import Models.Movies;
import Models.MoviesDAO;

public class MoviesCreate extends HttpServlet {
    
     

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("../movies-create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Movies m = new Movies(
                req.getParameter("txtTitle"),
                Integer.parseInt(req.getParameter("txtYear")),
                req.getParameter("txtImage"),
                req.getParameter("txtDescription"),
                Integer.parseInt(req.getParameter("txtGenreID"))
        );
    
        // Goi ham o DAO de insert
        if (new MoviesDAO().insertMovies(m)>0) {
            resp.sendRedirect("movies");
        }
    }
}
