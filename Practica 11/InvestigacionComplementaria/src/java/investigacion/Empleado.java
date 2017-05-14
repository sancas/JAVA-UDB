/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investigacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sanch
 */
public class Empleado {
    private String lname_txt;
    private String fname_txt;
    private int employee_num;
    private String address1_txt;
    private String address2_txt;
    private String city;
    private String state;
    private String zip;
    private String phone;

    /**
     * @return the lname_txt
     */
    public String getLname_txt() {
        return lname_txt;
    }

    /**
     * @param lname_txt the lname_txt to set
     */
    public void setLname_txt(String lname_txt) {
        this.lname_txt = lname_txt;
    }

    /**
     * @return the fname_txt
     */
    public String getFname_txt() {
        return fname_txt;
    }

    /**
     * @param fname_txt the fname_txt to set
     */
    public void setFname_txt(String fname_txt) {
        this.fname_txt = fname_txt;
    }

    /**
     * @return the employee_num
     */
    public int getEmployee_num() {
        return employee_num;
    }

    /**
     * @param employee_num the employee_num to set
     */
    public void setEmployee_num(int employee_num) {
        this.employee_num = employee_num;
    }

    /**
     * @return the address1_txt
     */
    public String getAddress1_txt() {
        return address1_txt;
    }

    /**
     * @param address1_txt the address1_txt to set
     */
    public void setAddress1_txt(String address1_txt) {
        this.address1_txt = address1_txt;
    }

    /**
     * @return the address2_txt
     */
    public String getAddress2_txt() {
        return address2_txt;
    }

    /**
     * @param address2_txt the address2_txt to set
     */
    public void setAddress2_txt(String address2_txt) {
        this.address2_txt = address2_txt;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void guardarEmpleado(Empleado employee) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_employees", "root", "");
            String str = "INSERT INTO employees(employee_num, fname_txt, lname_txt, address1_txt, address2_txt, city, state, zip, phone) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = con.prepareStatement(str);
            preparedStmt.setInt(1, employee.getEmployee_num());
            preparedStmt.setString(2, employee.getFname_txt());
            preparedStmt.setString(3, employee.getLname_txt());
            preparedStmt.setString(4, employee.getAddress1_txt());
            preparedStmt.setString(5, employee.getAddress2_txt());
            preparedStmt.setString(6, employee.getCity());
            preparedStmt.setString(7, employee.getState());
            preparedStmt.setString(8, employee.getZip());
            preparedStmt.setString(9, employee.getPhone());
            preparedStmt.executeQuery();
            con.close();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarEmpleado(int employee_num) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_employees", "root", "");
            String str = "DELETE employees WHERE employee_num = ?";
            PreparedStatement preparedStmt = con.prepareStatement(str);
            preparedStmt.setInt(1, employee_num);
            preparedStmt.executeQuery();
            con.close();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarEmpleado(Empleado employee, int employee_num)
    {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_employees", "root", "");
            String str = "UPDATE employees SET fname_txt = '?', lname_txt = '?',"
                    + " address1_txt = '?', address2_txt = '?', city = '?', state = '?',"
                    + " zip = '?', phone = '?' WHERE employee_num = ?";
            PreparedStatement preparedStmt = con.prepareStatement(str);
            preparedStmt.setString(1, employee.getFname_txt());
            preparedStmt.setString(2, employee.getLname_txt());
            preparedStmt.setString(3, employee.getAddress1_txt());
            preparedStmt.setString(4, employee.getAddress2_txt());
            preparedStmt.setString(5, employee.getCity());
            preparedStmt.setString(6, employee.getState());
            preparedStmt.setString(7, employee.getZip());
            preparedStmt.setString(8, employee.getPhone());
            preparedStmt.setInt(9, employee_num);
            preparedStmt.executeQuery();
            con.close();
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
