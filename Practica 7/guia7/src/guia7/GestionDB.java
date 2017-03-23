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
public class GestionDB {
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mysql", "root", "");
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.print("Nombre DriveR:");
            System.out.println(dbmd.getDriverName());
            System.out.print("Driver Version:");
            System.out.println(dbmd.getDriverVersion());
            System.out.print("URL Conexion DB:");
            System.out.println(dbmd.getURL());
            System.out.println("Nombre Base de Datos: mysql");
            System.out.print("Nombre Usuario BD: ");
            System.out.println(dbmd.getUserName());
            System.out.print("Gestor DB: ");
            System.out.println(dbmd.getDatabaseProductName());
            System.out.print("Version Gestor DB: ");
            System.out.println(dbmd.getDatabaseProductVersion());
            String[] tabTypes = {"TABLE"};
            System.out.println("");
            System.out.println("Nombre de Tablas");
            System.out.println("--------------------");
            ResultSet tablesRS = dbmd.getTables(null, null, null, tabTypes);
            while (tablesRS.next())
                System.out.println(tablesRS.getString("Table_Name"));
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
    }
}
