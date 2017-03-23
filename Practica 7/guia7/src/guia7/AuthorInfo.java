/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;
import java.sql.*;

/**
 *
 * @author sanch
 */
public class AuthorInfo {
    public static void main(String[] args)
    {
        try
        {
            String str = "select * from authors";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_authors", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(str);
            System.out.println("Author ID\tLast Name\t\tFirst Name\t\tCity\n");
            while(rs.next())
            {
                String id = rs.getString("au_id");
                String fname = rs.getString("au_fname");
                String lname = rs.getString("au_lname");
                String city = rs.getString("city");
                System.out.print(id+"\t\t");
                System.out.print(lname+"\t\t");
                System.out.print(fname+"\t\t\t");
                System.out.println(city+"\t\t");
            }
            con.close();
        } catch (Exception ex)
        {
            System.out.println("Error ocurred");
            System.out.println("Error: " + ex);
        }
    }
}
