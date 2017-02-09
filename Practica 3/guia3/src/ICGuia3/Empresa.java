/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICGuia3;

import java.util.*;
/**
 *
 * @author Usuario
 */
public class Empresa {
    public static void main(String[] args)
    {
        int numEmpleados;
        String nombres[];
        double salarios[];
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Numero de empleados: ");
        numEmpleados = reader.nextInt();
        
        nombres = new String[numEmpleados];
        salarios = new double[numEmpleados];
        
        for (int j = 0; j < numEmpleados; j++)
        {
            reader.nextLine();
            System.out.print("Empleado " + (j+1) + "\nNombre: ");
            nombres[j] = reader.nextLine();
            System.out.print("Salario: ");
            salarios[j] = reader.nextDouble();
        }
        
        String leftAlignFormat = "| %-15s | %.2f |%n";
        System.out.format("+-----------------+---------+%n");
        System.out.format("| Empleado        | Salario |%n");
        System.out.format("+-----------------+---------+%n");
        for (int i = 0; i < numEmpleados; i++) {
            System.out.format(leftAlignFormat, nombres[i], salarios[i]);
        }
        System.out.format("+-----------------+---------+%n");
    }
}
