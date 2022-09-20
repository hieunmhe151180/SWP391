/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servlet;

import Models.Person;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author hieud
 */
public class List extends HttpServlet {

    ArrayList<Person> perList = new ArrayList<Person>();

    @Override
    public void init() throws ServletException {

        perList.add(new Person(1, "Mr A - Update", "Female", "2016-12-02"));
        perList.add(new Person(2, "Mr B - Updated", "Female","2016-12-09"));
        perList.add(new Person(5, "Mr C ", "Male", "2016-12-07"));

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String out = "<html><head><title><h1>List Student</h1></title></head><body>";
        out += "<table border ='1'>";
        out += "<tr>";
        out += "<th>ID</th><th>Name</th><th>Gender</th><th>DOB</th>";
        out += "</tr>";
        for (Person s : perList) {
            out += "<tr>";
            out += "<td>" + s.getID() + "</td>";
            out += "<td>" + s.getName() + "</td>";
            out += "<td>" + s.getGender() + "</td>";
            out += "<td>" + s.getDOB()+ "</td>";
            out += "</tr>";            
        }
        out += "</table>";
       out += "<a>";
       out += "Create";
       out += "</a>";
        resp.getWriter().println(out);

    }

}
