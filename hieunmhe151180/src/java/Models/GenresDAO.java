/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author hieud
 */
public class GenresDAO extends DBContext {

    public ArrayList<Genres> GetGenres() {
        ArrayList<Genres> genres = new ArrayList<Genres>();
        // Doc du lieu tu DB
        try {
            String sql = "select * from Genres";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int GenreID = rs.getInt("GenreID");
                String Description = rs.getString("Description");
                Genres g = new Genres(GenreID, Description);
                genres.add(g);
            }

        } catch (SQLException ex) {

        }

        return genres;
    }

    public int insertGenres(Genres g) {
        int count = 0;
        try {
            String sql = "INSERT INTO [dbo].[Genres] ([Description]) VALUES(?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, g.getDescription());
            count = ps.executeUpdate();
        } catch (Exception e) {
        }
        return count;
    }

    public int DeleteGenres(int id) {
        int count = 0;
        try {
            String sql = "DELETE FROM Genres WHERE [GenreID] = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            count = ps.executeUpdate();
        } catch (Exception e) {
        }
        return count;
    }

    public Genres getGenresById(int id) {
        Genres genres = null;
        try {
            String sql = "select * from Genres where GenreID = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int GenreID = rs.getInt("GenreID");
                String Description = rs.getString("Description");
                Genres g = new Genres(GenreID, Description);
                genres = g;
            }

        } catch (SQLException ex) {
        }
        return genres;
        
    }

    public int updateGenres(Genres g) {
        int count = 0;
        try {
            String sql = "update Genres set Description=? where GenreID=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, g.getDescription());
            ps.setInt(2, g.getGenreID());
            count = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        return count;
    }

}
