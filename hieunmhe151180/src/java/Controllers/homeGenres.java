/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Genres;
import Models.GenresDAO;
import Models.Movies;
import Models.MoviesDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class homeGenres extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Lay du lieu tu Model
        int gId = Integer.parseInt(req.getParameter("id"));
        
        ArrayList<Movies> movies = new MoviesDAO().GetMoviesByCId(gId);
        ArrayList<Genres> genres = new GenresDAO().GetGenres();
        req.setAttribute("movies", movies);
        req.setAttribute("genres", genres);
        req.getRequestDispatcher("homeGenres.jsp").forward(req, resp);
    }
}
