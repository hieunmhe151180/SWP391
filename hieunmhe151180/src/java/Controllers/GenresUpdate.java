
package Controllers;

import Models.Genres;
import Models.GenresDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GenresUpdate extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Genres genres = new GenresDAO().getGenresById(id);
        req.setAttribute("genres", genres);
        req.getRequestDispatcher("../genres-update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int GenreId = Integer.parseInt(req.getParameter("GenreID"));
        String Description = req.getParameter("Description");
        Genres g = new Genres(GenreId, Description);
        if(new GenresDAO().updateGenres(g)>0){
            resp.sendRedirect("genres");
        }
    }
}
