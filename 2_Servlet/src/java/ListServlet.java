
import Model.Student;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hieud
 */
public class ListServlet extends HttpServlet {

    ArrayList<Student> stuList = new ArrayList<Student>();

    @Override
    public void init() throws ServletException {

        stuList.add(new Student("HE151180", "Nguyen Minh Hieu", 21));
        stuList.add(new Student("HE1533180", "Nguyen Minh", 22));
        stuList.add(new Student("HE15221180", "Nguyen Hieu", 23));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//nhan du lieu tu client gui len
        String roll = req.getParameter("txtRoll").trim();
        String name = req.getParameter("txtName").trim();
        int age = Integer.parseInt(req.getParameter("txtAge"));
        //them doi tuong nay vao stuList
        stuList.add(new Student(roll, name, age));
        //dieu huong ve servlet 'ListServlet'
        resp.sendRedirect("List");
    }

    /**
     * *
     * Xu ly tiep nhan request tu client (front-end) gui len thong qua URL
     *
     * @param req - doi tuong dong vai tro tiep nhan nhung du lieu tu client gui
     * len
     * @param resp - doi tuong xu ly tra ve du lieu cho client
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        resp.setContentType("text/html;charset=UTF-8");

        //tao 1 danh sach kieu Student: Roll(String); Name(String), Age(Int)
        //nhap thong tin gom  sinh vien
        //in danh sach sinh vien theo cau truc bang
        String out = "<html><head><title><h1>List Student</h1></title></head><body>";
        out += "<table border ='1'>";
        out += "<tr>";
        out += "<th>Roll</th><th>Name</th><th>Age</th>";
        out += "</tr>";
        for (Student s : stuList) {
            out += "<tr>";
            out += "<td>" + s.getRollSV() + "</td>";
            out += "<td>" + s.getTenSV() + "</td>";
            out += "<td>" + s.getAge() + "</td>";
            out += "</tr>";
        }
        out += "</table>";
        resp.getWriter().println(out);

    }

}
