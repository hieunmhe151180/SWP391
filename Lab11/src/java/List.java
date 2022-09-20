
import Models.Person;
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hieud
 */
public class List extends HttpServlet {

    ArrayList<Person> list = new ArrayList<Person>();

    public void init() throws ServletException {
        list.add(new Person(1, "Mr A - Update", "Female", Date.valueOf("2016-12-02")));
        list.add(new Person(2, "Mr B - Updated", "Female", Date.valueOf("2016-12-09")));
        list.add(new Person(5, "Mr C ", "Male", Date.valueOf("2016-12-07")));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("persons", list);
        req.getRequestDispatcher("list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("txtID"));
        String name = req.getParameter("txtName");
        String gender = req.getParameter("rbGender");
        Date dob = Date.valueOf(req.getParameter("txtDOB"));
        list.add(new Person(id, name, gender, dob));
        resp.sendRedirect("List");
    }

}
