/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hieud
 */
public class StudentDAO extends DBContext{
    public ArrayList<Student> getStudents(){
        ArrayList<Student> students = new ArrayList<>();
        try{
           String sql = "SELECT * FROM Student";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt("Id");
                String name = rs.getString("Name");
               boolean gender = rs.getBoolean("Gender");
                Date dob = rs.getDate("DOB");
                Student s = new Student(id, name, gender, dob);
                students.add(s);
            }
        }catch (Exception e){
            
        }
        return students;
    }

    public int insertStudent(Student s) {
        int count = 0;
        try {
            String sql = "INSERT INTO Student(Name, Gender, DOB) value(?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setBoolean(2, s.isGender());
            ps.setDate(3, (Date)s.getDOB());
            count = ps.executeUpdate();
        } catch (Exception e) {
        }
        return count;
    }

    public int deleteStudent(int id) {
        int count = 0;
        try {
            String sql = "DELETE FROM Student WHERE Id=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            count = ps.executeUpdate();
        } catch (Exception e) {
        }
        return count;
        }
}
