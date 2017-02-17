/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial;
import java.util.*;

/**
 *
 * @author sanch
 */
public class ArraySA120974 {
    public static void main(String[] args)
    {
        int[] arregloNumeros = new int[10]; //Arreglo de numeros
        int cantidadPares = 0; //contador de numeros pares
        int cantidadImpares = 0; //contador de numeros impares
        int cantidadCeros = 0; //contador de ceros
        double mediaPares = 0; //Media de los pares
        double mediaImpares = 0; //Media de los impares
        Scanner reader = new Scanner(System.in); //Scanner para leer informacion
        
        System.out.println("Parcial JAVA Avanzado");
        System.out.println("Cristian Antonio Sanchez Aguilar - SA120974");
        System.out.println("Arreglos.");
        
        for (int x = 0; x < 10; x++)
        {
            System.out.print("Ingrese el nuemro " + (x+1) + ": ");
            arregloNumeros[x] = reader.nextInt();
            if (arregloNumeros[x]%2 == 0)
            {
                if (arregloNumeros[x] == 0)
                    cantidadCeros++;
                else
                {
                    cantidadPares++;
                    mediaPares += arregloNumeros[x];
                }
            }
            else
            {
                cantidadImpares++;
                mediaImpares += arregloNumeros[x];
            }
        }
        
        mediaPares /= cantidadPares;
        mediaImpares /= cantidadImpares;
        
        System.out.println("Cantidad de ceros: " + cantidadCeros);
        System.out.println("Cantidad de # pares: " + cantidadPares);
        System.out.println("Cantidad de # impares: " + cantidadImpares);
        System.out.println("Media de numeros pares: " + mediaPares);
        System.out.println("Media de numeros impares: "+ mediaImpares);
    }
}
