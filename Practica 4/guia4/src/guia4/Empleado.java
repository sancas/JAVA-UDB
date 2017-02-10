/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;
import java.util.*;

/**
 *
 * @author sanch
 */
public class Empleado {
    private String nombre;
    private double salario;
    private Date fechacontratacion;
    
    public Empleado(String n, double s, int anio, int mes, int dia)
    {
        nombre = n;
        salario = s;
        GregorianCalendar calendario = new GregorianCalendar(anio, mes -1, dia);
        fechacontratacion = calendario.getTime();
    }
    
    public String obtenerNombre()
    {
        return nombre;
    }
    
    public double obtenerSalario()
    {
        return salario;
    }
    
    public Date obtenerFechaContratacion()
    {
        return fechacontratacion;
    }
    
    public void aumentarSalario(double porcentaje)
    {
        double aumento = salario * porcentaje / 100;
        salario += aumento;
    }
}
