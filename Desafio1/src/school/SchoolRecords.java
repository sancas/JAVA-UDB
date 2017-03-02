/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;
import java.util.*;
/**
 *
 * @author sanch
 */
public class SchoolRecords {
    public static void main(String[] args)
    {
        Alumno[] Alumnos = new Alumno[4]; //Variable Alumno con todos los alumnos
        Scanner reader = new Scanner(System.in); //Variable para capturar entrada de teclado
        
        for (int x = 0; x < 4; x++) //Inicializando Alumnos
            Alumnos[x] = new Alumno();
        
        System.out.println("El siguiente programa maneja un conjunto de estudiantes con 3 notas de periodo");
        for (int x = 0; x < 4; x++)
        {
            System.out.println("### Estudiante " + (x+1) + " ###");
            System.out.print("Nombre: ");
            Alumnos[x].SNombre = reader.next();
            System.out.print("Nota primer periodo: ");
            Alumnos[x].DNotaPeriodo1 = reader.nextDouble();
            System.out.print("Nota segundo periodo: ");
            Alumnos[x].DNotaPeriodo2 = reader.nextDouble();
            System.out.print("Nota tercer periodo: ");
            Alumnos[x].DNotaPeriodo3 = reader.nextDouble();
        }
        
        System.out.println("\n### Registro de clases ###");
        System.out.println("Alumno\tP1\tP2\tPromedio");
        for (int x = 0; x < 4; x++)
            System.out.println(Alumnos[x].SNombre + "\t" + Alumnos[x].DNotaPeriodo1 + "\t" + Alumnos[x].DNotaPeriodo2 + "\t" + Alumnos[x].DNotaPeriodo3 + "\t" + Alumnos[x].CalcularPromedio());
    }
}