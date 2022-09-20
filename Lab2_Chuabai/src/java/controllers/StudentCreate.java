/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import models.Student;
import models.StudentDAO;

/**
 *
 * @author hieud
 */
public class StudentCreate extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("../student-create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student s = new Student(
                req.getParameter("txtName"),
                Boolean.parseBoolean(req.getParameter("rbName")), 
                Date.valueOf(req.getParameter("txtDob"))
        );
        //goi ham o DAO de insert
        if(new StudentDAO().insertStudent(s)>0){
            resp.sendRedirect("list");
        }
    }
    
}
