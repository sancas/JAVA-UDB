/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICGuia3;

import java.util.*;
/**
 *
 * @author sanch
 */
public class GraficoBarrasNotas {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int array[] = new int[11];
        System.out.println("Distribucion de Notas");
        for (int contador = 0; contador < array.length; contador++)
        {
            if (contador == 10)
                System.out.printf("Astericos del %d: ", 100);
            else
                System.out.printf("Asteriscos del %02d-%02d: ", contador * 10, contador * 10 + 9);
            array[contador] = reader.nextInt();
        }
        for (int contador = 0; contador < array.length; contador++)
        {
            if (contador == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", contador * 10, contador * 10 + 9);
            for (int asteriscos = 0; asteriscos < array[contador]; asteriscos++)
                System.out.print("*");
            System.out.println();
        }
    }
}
