/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author sanch
 */
public class Alumno {
    public String SNombre;
    public double DNotaPeriodo1;
    public double DNotaPeriodo2;
    public double DNotaPeriodo3;
    
    public double CalcularPromedio()
    {
        return (DNotaPeriodo1 + DNotaPeriodo2 + DNotaPeriodo3) / 3;
    }
}
