/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

/**
 *
 * @author sanch
 */
public class Gerente extends Empleado {
    
    private double bono;
    
    public Gerente(String n, double s, int anio, int mes, int dia)
    {
        super(n, s, anio, mes, dia);
        bono = 0;
    }
    public double obtenerSalario()
    {
        double salarioBase = super.obtenerSalario();
        return salarioBase + bono;
    }
    
    public void obtenerBono(double b)
    {
        bono = b;
    }
}
