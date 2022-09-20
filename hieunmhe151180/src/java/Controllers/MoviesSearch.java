/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Genres;
import Models.GenresDAO;
import Models.Movies;
import Models.MoviesDAO;
import Models.Rates;
import Models.RatesDAO;
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
public class MoviesSearch extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Lay du lieu tu Model
        String txt = req.getParameter("txtsearch");
        ArrayList<Movies> movies = new MoviesDAO().getMoviesBySearch(txt);
        ArrayList<Genres> genres = new GenresDAO().GetGenres();
        ArrayList<Rates> rates = new RatesDAO().GetRates();
        req.setAttribute("rates", rates);
        req.setAttribute("genres", genres);
        req.setAttribute("movies", movies);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
