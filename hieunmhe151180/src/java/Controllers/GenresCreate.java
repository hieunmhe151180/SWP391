package Controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import Models.Genres;
import Models.GenresDAO;

public class GenresCreate extends HttpServlet {
    
     

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("../genres-create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Genres g = new Genres(
                req.getParameter("txtDescription")
        );
    
        // Goi ham o DAO de insert
        if (new GenresDAO().insertGenres(g)>0) {
            resp.sendRedirect("genres");
        }
    }
}
