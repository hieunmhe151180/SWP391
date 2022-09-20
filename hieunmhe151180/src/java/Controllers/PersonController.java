
package Controllers;

import Models.Person;
import Models.PersonDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PersonController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("../login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("txtEmail");
        String pass  = req.getParameter("txtPass");
        
        Person p = new Person(email, pass);
        Person pResult = new PersonDAO().getPerson(p);

        
        if(pResult!=null){
            req.getSession().setAttribute("pSession", pResult);
            // Kiem tra quyen truy cap chuc nang cua nguoi dung
            if(pResult.getType()==1){ // admin            
                resp.sendRedirect("../admin/dashboard");
            }
            if(pResult.getType()==2){ // customer
                // Dieu huong ve 'index.jsp'
                resp.sendRedirect("../home");
            }
        }else{
            req.setAttribute("msg", "This account not exist.");
            req.getRequestDispatcher("../login.jsp").forward(req, resp);
        }
    }
    
}
