/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;
import Models.Student;
import Models.StudentDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hieud
 */
public class StudentList extends HttpServlet{

    ArrayList<Student> list = new ArrayList<Student>();
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // PP1: Trinh bay truc tiep du lieu tai doGet
        // PP2: Forward du lieu sang 1 trang .jsp
       ArrayList<Student> students = new StudentDAO().GetStudent();
        req.setAttribute("students", students);
        req.getRequestDispatcher("../list.jsp").forward(req, resp);
    }
    
}
