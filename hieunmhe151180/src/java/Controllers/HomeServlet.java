/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Genres;
import Models.GenresDAO;
import Models.Movies;
import Models.MoviesDAO;
import Models.Person;
import Models.PersonDAO;
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
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            ArrayList<Movies> movies = new MoviesDAO().GetMovies();
            ArrayList<Genres> genres = new GenresDAO().GetGenres();
            ArrayList<Rates> rates = new RatesDAO().GetRates();
            req.setAttribute("movies", movies);
            req.setAttribute("rates", rates);
            req.setAttribute("genres", genres);
            req.getRequestDispatcher("index.jsp").forward(req, resp);

    }
}
