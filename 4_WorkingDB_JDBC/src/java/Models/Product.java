/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author hieud
 */
public class Product {

    private int proId;
    private String proName;
    private int catId;
    private String unit;
    private double price;
    private short inStock;
    private short onOrder;
    private short reOrder;
    private boolean discontinued;

    public Product(int proId, String proName, int catId, String unit, double price, short inStock, short onOrder, short reOrder, boolean discontinued) {
        this.proId = proId;
        this.proName = proName;
        this.catId = catId;
        this.unit = unit;
        this.price = price;
        this.inStock = inStock;
        this.onOrder = onOrder;
        this.reOrder = reOrder;
        this.discontinued = discontinued;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public short getInStock() {
        return inStock;
    }

    public void setInStock(short inStock) {
        this.inStock = inStock;
    }

    public short getOnOrder() {
        return onOrder;
    }

    public void setOnOrder(short onOrder) {
        this.onOrder = onOrder;
    }

    public short getReOrder() {
        return reOrder;
    }

    public void setReOrder(short reOrder) {
        this.reOrder = reOrder;
    }

    public boolean isDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }

    @Override
    public String toString() {
        return "Product{" + "proId=" + proId + ", proName=" + proName + ", catId=" + catId + ", unit=" + unit + ", price=" + price + ", inStock=" + inStock + ", onOrder=" + onOrder + ", reOrder=" + reOrder + ", discontinued=" + discontinued + '}';
    }

  
}
