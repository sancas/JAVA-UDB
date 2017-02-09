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
public class Matriz03 {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        long[] arreglo;
        arreglo = new long[100];
        int nElementos = 0;
        int j;
        long busquedaLlave;
        System.out.print("Cantidad de llaves a ingresar: ");
        int cantidadLlaves = reader.nextInt();
        for (j = 0; j < cantidadLlaves; j++)
        {
            System.out.print("\nLlave " + (j+1) + ": ");
            arreglo[j] = reader.nextInt();
            nElementos++;
        }
        for (j = 0 ; j < nElementos; j++)
            System.out.print(arreglo[j] + " ");
        System.out.println();
        System.out.print("Llave a buscar: ");
        busquedaLlave = reader.nextInt(); //Encontrar Have 53 en el arreglo
        for (j = 0; j < nElementos; j++)
            if (arreglo[j] == busquedaLlave)
                break;
        if (j == nElementos)
            System.out.println("No se encontro la llave " + busquedaLlave);
        else
            System.out.println("Se encontro llave " + busquedaLlave);
        System.out.print("Llave a eliminar: ");
        busquedaLlave = reader.nextInt(); //Borrar item 64 si se encuentra en el arreglo
        for (j = 0; j < nElementos; j++)
            if(arreglo[j] == busquedaLlave)
                break;
        if (j == nElementos)
            System.out.println("No se encontro la llave " + busquedaLlave);
        else
        {
            for (int k = j; k < nElementos - 1; k++)
                arreglo[k] = arreglo[k+1];
            nElementos--;
        }
        for (j = 0; j < nElementos; j++)
            System.out.print(arreglo[j] + " ");
        System.out.println();
    }
}
