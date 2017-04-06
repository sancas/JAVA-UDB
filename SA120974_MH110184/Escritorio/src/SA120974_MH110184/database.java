/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SA120974_MH110184;

/**
 *
 * @author Usuario
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class database 
{
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    database()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sa120974_mh110184","root","");
           }
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
    public Object[] materiasDocentes(String uname)
    {
        try {
            pst=con.prepareStatement("select * from docentes where username=?");
            pst.setString(1, uname);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String docenteid = rs.getString("id");
                pst = con.prepareStatement("select idMateria from docentes_materias where idDocente = " + docenteid);
                rs = pst.executeQuery();
                if(rs.next())
                {
                    String materiaid = rs.getString("idMateria");
                    pst = con.prepareStatement("select nombre from materias where id=" + materiaid);
                    rs = pst.executeQuery();
                    List miLista = new ArrayList();
                    while(rs.next())
                    {
                        miLista.add(rs.getString("nombre"));
                    }
                    return miLista.toArray();
                }
                return null;
            }
            else
            {
                return null;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("Error mientras se validaba "+e);
            return null;
        }
    }
    
    public Boolean checkLogin(String uname,String pwd)
    {
        try {
            pst=con.prepareStatement("select * from docentes where username=? and password=?");
            pst.setString(1, uname);
            pst.setString(2, pwd);
            rs=pst.executeQuery();
            if(rs.next())
            {
                return true;
            }
            else
            {
                return false;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("Error mientras se validaba "+e);
            return false;
        }
    }
}