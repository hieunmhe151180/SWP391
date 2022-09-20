
package Controllers;

import Models.Movies;
import Models.MoviesDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MoviesUpdate extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Movies movies = new MoviesDAO().getMoviesById(id);
        req.setAttribute("movies", movies);
        req.getRequestDispatcher("../movies-update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int MovieId = Integer.parseInt(req.getParameter("MovieId"));
        String Title = req.getParameter("Title");
        int Year = Integer.parseInt(req.getParameter("Year"));
        String Image = req.getParameter("Image");
        String Description = req.getParameter("Description");
        int GenreID = Integer.parseInt(req.getParameter("GenreID"));
        Movies m = new Movies(MovieId, Title, Year, Image, Description, GenreID);
        if(new MoviesDAO().updateMovies(m)>0){
            resp.sendRedirect("movies");
        }
    }
}
