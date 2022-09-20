/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author hieud
 */
public class RatesDAO extends DBContext{

    public ArrayList<Rates> GetRates() {
    ArrayList<Rates> rates = new ArrayList<Rates>();
        // Doc du lieu tu DB
        try {
            String sql = "select * from Rates";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int MovieID = rs.getInt("MovieID");
                int PersonID = rs.getInt("PersonID");
                String Comment = rs.getString("Comment");
                int NumericRating = rs.getInt("NumericRating");
                Date Time = rs.getDate("Time");
                Rates r = new Rates(MovieID, PersonID, Comment, NumericRating, Time);
                rates.add(r);
            }

        } catch (SQLException ex) {

        }

        return rates;
        }
    
}
