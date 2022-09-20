package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonDAO extends DBContext {

    public Person getPerson(Person p) {
        Person result = null;
        try {
            String sql = "SELECT * FROM [Persons] WHERE Email = ? AND Password=?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, p.getEmail());
            ps.setString(2, p.getPassword());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                result = new Person(
                        rs.getInt("PersonId"),
                        rs.getString("Fullname"),
                        rs.getString("Gender"),
                        rs.getString("Email"),
                        rs.getString("Password"),
                        rs.getInt("Type"),
                        rs.getBoolean("IsActive")
                );
            }
        } catch (Exception e) {
        }
        return result;
    }

    public ArrayList<Person> getPersonList() {
        ArrayList<Person> person = new ArrayList<Person>();
        // Doc du lieu tu DB
        try {
            String sql = "select * from Persons";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int PersonID = rs.getInt("PersonID");
                String Fullname = rs.getString("Fullname");
                String Gender = rs.getString("Gender");
                String Email = rs.getString("Email");
                String Password = rs.getString("Password");
                int Type = rs.getInt("Type");
                boolean IsActive = rs.getBoolean("IsActive");
                Person p = new Person(PersonID, Fullname, Gender, Email, Password, Type, IsActive);
                person.add(p);
            }

        } catch (SQLException ex) {

        }

        return person;
    }

    public int insertPerson(Person per) {
        int count = 0;
        try {
            String sql = "INSERT INTO [dbo].[Persons]\n" +
"           ([Fullname]\n" +
"           ,[Gender]\n" +
"           ,[Email]\n" +
"           ,[Password]\n" +
"           ,[Type]\n" +
"           ,[IsActive])\n" +
"     VALUES\n" +
"           (?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, per.getFullname());
            ps.setString(2, per.getGender());
            ps.setString(3, per.getEmail());
            ps.setString(4, per.getPassword());
            ps.setInt(5, per.getType());
            ps.setBoolean(6, per.isIsActive());
            count = ps.executeUpdate();
        } catch (Exception e) {
        }
        return count;
    }

}
