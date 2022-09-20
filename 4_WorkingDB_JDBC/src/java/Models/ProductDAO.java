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
 * CRUD operation: Create, read, update, delete
 *
 */
public class ProductDAO extends DBContext {

    public ArrayList<Product> GetProducts() {
        ArrayList<Product> products = new ArrayList<Product>();
        //doc du lieu tu DB
        try {
            String sql = "select * from Products";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int proId = rs.getInt("ProductID");
                String proName = rs.getString("ProductName");
                int catId = rs.getInt("CategoryID");
                String unit = rs.getString("QuantityPerUnit");
                double price = rs.getDouble("UnitPrice");
                short inStock = rs.getShort("UnitsInStock");
                short onOrder = rs.getShort("UnitsOnOrder");
                short reOrder = rs.getShort("ReorderLevel");
                boolean discontinued = rs.getBoolean("Discontinued");
                Product p = new Product(proId, proName, catId, unit, price, inStock, onOrder, reOrder, discontinued);
                products.add(p);

            }

        } catch (SQLException ex) {
        }
        return products;
    }

    public Product GetProductsById(int pId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
