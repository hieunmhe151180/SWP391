/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author hieud
 */
public class Student {

    private int Id;
    private String Name;
    private boolean Gender;
    private Date DOB;

    public Student(String Name, boolean Gender, Date DOB) {
        this.Name = Name;
        this.Gender = Gender;
        this.DOB = DOB;
    }

    
    public Student(int Id, String Name, boolean Gender, Date DOB) {
        this.Id = Id;
        this.Name = Name;
        this.Gender = Gender;
        this.DOB = DOB;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    
}
