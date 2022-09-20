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
public class StudentDAO extends DBContext{
    
    public ArrayList<Student> GetStudent(){
        ArrayList<Student> students = new ArrayList<Student>();
        // Doc du lieu tu DB
        try{
            String sql = "select * from Student";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int Id = rs.getInt("ID");
                String Name = rs.getString("Name");
                String Gender = rs.getString("Gender");
                Date DOB = rs.getDate("DOB");
                Student s = new Student(Id, Name, Gender, DOB);
                students.add(s);
            }
            
        }catch(SQLException ex){
            
        }
        
        return students;
    }
public Student getStudentById(int sId) {
        Student student=null;
        try{
            String sql = "select * from Student where ID=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, sId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int Id = rs.getInt("ID");
                String Name = rs.getString("Name");
                String Gender = rs.getString("Gender");
                Date DOB = rs.getDate("DOB");
                student = new Student(Id, Name, Gender, DOB);
            }
            
        }catch(SQLException ex){}
        return student;
    }
public int updateStudent(Student s) {
        int count = 0;
        try{
            String sql = "update Student set Name=?, Gender=?, DOB=? where ID=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getGender());
            ps.setDate(3, (Date) s.getDOB());
            count = ps.executeUpdate();
        }catch(SQLException ex){}
        return count;
    }

}
