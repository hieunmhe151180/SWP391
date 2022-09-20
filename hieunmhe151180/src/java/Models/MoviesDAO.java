/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hieud
 */
public class MoviesDAO extends DBContext {

    public ArrayList<Movies> GetMovies() {
        ArrayList<Movies> movies = new ArrayList<Movies>();
        // Doc du lieu tu DB
        try {
            String sql = "select * from Movies";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int MovieID = rs.getInt("MovieID");
                String Title = rs.getString("Title");
                int Year = rs.getInt("Year");
                String Image = rs.getString("Image");
                String Description = rs.getString("Description");
                int GenreID = rs.getInt("GenreID");
                Movies m = new Movies(MovieID, Title, Year, Image, Description, GenreID);
                movies.add(m);
            }

        } catch (SQLException ex) {

        }

        return movies;
    }

    public int insertMovies(Movies m) {
        int count = 0;
        try {
            String sql = "INSERT INTO [dbo].[Movies]\n"
                    + "           ([Title]\n"
                    + "           ,[Year]\n"
                    + "           ,[Image]\n"
                    + "           ,[Description]\n"
                    + "           ,[GenreID])\n"
                    + "     VALUES (?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, m.getTitle());
            ps.setInt(2, m.getYear());
            ps.setString(3, m.getImage());
            ps.setString(4, m.getDescription());
            ps.setInt(5, m.getGenreID());

            count = ps.executeUpdate();
        } catch (Exception e) {
        }
        return count;
    }

    public int DeleteMovies(int id) {
        int count = 0;
        try {
            String sql = "DELETE FROM Movies WHERE [MovieID] = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            count = ps.executeUpdate();
        } catch (Exception e) {
        }
        return count;
    }

    public Movies getMoviesById(int mid) {
        Movies movies = null;
        try {
            String sql = "select * from Movies where MovieId = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, mid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int MovieID = rs.getInt("MovieId");
                String Title = rs.getString("Title");
                int Year = rs.getInt("Year");
                String Image = rs.getString("Image");
                String Description = rs.getString("Description");
                int GenreID = rs.getInt("GenreID");
                Movies m = new Movies(MovieID, Title, Year, Image, Description, GenreID);
                movies = m;
            }

        } catch (SQLException ex) {
        }
        return movies;
    }

    public int updateMovies(Movies m) {
        int count = 0;
        try {
            String sql = "update Movies set Title=?, Year=?, Image =?, Description =?, GenreID =? where MovieID=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, m.getTitle());
            ps.setInt(2, m.getYear());
            ps.setString(3, m.getImage());
            ps.setString(4, m.getDescription());
            ps.setInt(5, m.getGenreID());
            ps.setInt(6, m.getMovieID());
            count = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        return count;
    }
 public ArrayList<Movies> GetMoviesByCId(int mId) {
        ArrayList<Movies> list = new ArrayList<>();
        try {
            String sql = "select * from Movies where [GenreID]=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, mId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int MovieID = rs.getInt("MovieID");
                String Title = rs.getString("Title");
                int Year = rs.getInt("Year");
                String Image = rs.getString("Image");
                String Description = rs.getString("Description");
                int GenreID = rs.getInt("GenreID");
                Movies m = new Movies(MovieID, Title, Year, Image, Description, GenreID);
                list.add(m);
            }

        } catch (SQLException ex) {
        }
        return list;
    }
 public ArrayList<Movies> getMoviesBySearch(String txt) {
        ArrayList<Movies> list = new ArrayList<>();

        String sql = "select* from [Movies] where Title like ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, "%"+ txt + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int MovieID = rs.getInt("MovieID");
                String Title = rs.getString("Title");
                int Year = rs.getInt("Year");
                String Image = rs.getString("Image");
                String Description = rs.getString("Description");
                int GenreID = rs.getInt("GenreID");
                Movies m = new Movies(MovieID, Title, Year, Image, Description, GenreID);
                list.add(m);
            }

        } catch (SQLException e) {
        }
        return list;
    }
    
}
