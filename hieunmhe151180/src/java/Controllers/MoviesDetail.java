
package Controllers;

import Models.Movies;
import Models.MoviesDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MoviesDetail extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int mid = Integer.parseInt(req.getParameter("mid"));
        Movies movies = new MoviesDAO().getMoviesById(mid);
        req.setAttribute("movies", movies);
        req.getRequestDispatcher("movies-detail.jsp").forward(req, resp);
    }
}