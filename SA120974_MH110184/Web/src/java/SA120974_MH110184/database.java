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
import java.util.logging.Level;
import java.util.logging.Logger;
public class database 
{
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public database()
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
    
    public Boolean checkLogin(String uname,String pwd)
    {
        try {
            pst=con.prepareStatement("select * from estudiantes where username=? and password=?");
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
        } catch (Exception ex) {
            // TODO Auto-generated catch block
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public String getNotas(String username)
    {
        try
        {
            pst = con.prepareStatement("select t5.nombre, t1.porcentaje, t2.nota from actividadesAEvaluar t1"
            + " inner join notas t2 on t1.id = t2.idActividadesAEvaluar"
            + " inner join estudiantes t3 on t2.idEstudiante = t3.id"
            + " inner join actividadesaevaluar_materias t4 on t2.idActividadesAEvaluar = t4.idActividadesAEvaluar"
            + " inner join materias t5 on t4.idMateria = t5.id"
            + " where t3.username = '" + username + "'");
            rs = pst.executeQuery();
            String salida = "";
            String materia = "EstaEsLaClaveNoRepitanUnaMateriaConEsteN0mbre";
            int i = 0;
            while (rs.next())
            {
                if (!materia.equals(rs.getString("nombre")))
                {
                    if (materia != "EstaEsLaClaveNoRepitanUnaMateriaConEsteN0mbre")
                        salida += "</tbody></table><br />";
                    materia = rs.getString("nombre");
                    salida += "<h2>" + materia + "</h2>"
                            + "<table class=\"table table-hover\">"
                            + "<thead><tr>"
                            + "<td>Activad</td>"
                            + "<td>Porcentaje</td>"
                            + "<td>Nota</td>"
                            + "</tr></thead>"
                            + "<tbody>";
                    i = 1;
                }
                salida += "<tr>"
                        + "<td>" + i + "</td>"
                        + "<td>" + rs.getString("porcentaje") + "</td>"
                        + "<td>" + rs.getString("nota") + "</bt>"
                        + "</tr>";
                i++;
            }
            salida += "</tbody>"
                    + "</table>";
            return salida;
        } catch (SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}