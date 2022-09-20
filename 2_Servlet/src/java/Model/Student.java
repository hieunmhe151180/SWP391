/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author hieud
 */
import java.util.Scanner;
public class Student {
    private String RollSV;
    private String TenSV;
    private int Age;

    public Student() {
    }

    public Student(String RollSV, String TenSV, int Age) {
        this.TenSV = RollSV;
        this.RollSV = TenSV;
        this.Age = Age;
    }

    public String getRollSV() {
        return RollSV;
    }

    public void setRollSV(String RollSV) {
        this.RollSV = RollSV;
    }

    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String TenSV) {
        this.TenSV = TenSV;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
 
    
}
