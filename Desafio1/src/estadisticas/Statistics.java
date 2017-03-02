/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticas;
import java.util.*;

/**
 *
 * @author sanch
 */
public class Statistics {
    public static void main(String[] args)
    {
        double DNum1, DNum2, DNum3; //Variables para almacenar los numeros
        double DMedia, DVarianza, DDesviacionEstandar; //Variables de resultados
        Scanner reader = new Scanner(System.in); //Variable para leer entrada por teclado
        
        System.out.println("Programa para calcular media, varianza y desviacion estandar de 3 numeros");
        System.out.print("Ingrese el primer valor: ");
        DNum1 = reader.nextDouble();
        System.out.print("Ingrese el segundo valor: ");
        DNum2 = reader.nextDouble();
        System.out.print("Ingrese el tercer valor : ");
        DNum3 = reader.nextDouble();
        
        DMedia = (DNum1 + DNum2 + DNum3) / 3;
        DVarianza = ((Math.pow(DNum1 - DMedia, 2)) + (Math.pow(DNum2 - DMedia, 2)) + (Math.pow(DNum3 - DMedia, 2))) / 3;
        DDesviacionEstandar = Math.sqrt(DVarianza);
        
        System.out.println("Media: " + DMedia);
        System.out.println("Varianza: " + DVarianza);
        System.out.println("Desviacion Estandar: " + DDesviacionEstandar);
    }
}
