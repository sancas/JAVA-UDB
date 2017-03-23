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
public class GestionTablaAutores {
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_authors", "root", "");
            DatabaseMetaData dbmd = con.getMetaData();
            System.out.println("\n\t\t\t BASE DE DATOS db_authors\n");
            String[] tabTypes = {"TABLE"};
            System.out.print("\t\t\tCampos de la tabla: ");
            ResultSet tablesRS = dbmd.getTables(null, null, null, tabTypes);
            while(tablesRS.next())
                System.out.println(tablesRS.getString("Table_Name"));
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Nombre Columna Tipo de Dato Tamaño del campo "
            + "Llave primaria Autoincremento");
            ResultSet primaria = dbmd.getPrimaryKeys(null, null, "authors");
            String llaveprimaria = "";
            while(primaria.next())
                llaveprimaria = primaria.getString("COLUMN_NAME");
            ResultSet rs = dbmd.getColumns(null, null, "authors", null);
            while(rs.next())
            {
                String nombreColumna = rs.getString(4);
                String tipoColumna = rs.getString(6);
                String tamanioCampo = rs.getString(7);
                String autoincremental = rs.getString(23);
                int longitud = nombreColumna.length();
                int i=16 - longitud;
                
                if (nombreColumna.equals(llaveprimaria))
                {
                    System.out.print(nombreColumna);
                    for (int j=1; j<i; j++)
                    {
                        System.out.print(" ");
                    }
                    
                    System.out.println(tipoColumna + "\t\t\t" + tamanioCampo
                        + "\t\tYES\t\t" + autoincremental);
                }
                else
                {
                    System.out.print(nombreColumna);
                    for (int j=1; j<i; j++)
                    {
                        System.out.print(" ");
                    }
                    
                    System.out.println(tipoColumna + "\t\t\t" + tamanioCampo
                        + "\t\tNO\t\t" + autoincremental);
                }
            }
            System.out.println("-------------------------------------------------------------------------------");
            con.close();
        } catch(Exception e)
        {
            System.out.println("Error: " + e);
        }
    }
}
