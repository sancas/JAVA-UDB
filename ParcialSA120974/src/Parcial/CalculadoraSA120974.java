/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial;

import java.util.*;

/**
 *
 * @author Cristian Sanchez
 */
public class CalculadoraSA120974 {
    
    private static double numero1 = 0; //Almacenador del numero 1
    private static double numero2 = 0; //Almacenador del numero 2
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in); //Objeto Scanner para pedir datos por consola
        double DResultado; //Almacenador del resultado numerico
        String SResultado; //Almacena la cadena a imprimir
        int opc = 99; //Variable de control para determinar la operacion
        // 1 - Ingresar numeros
        // 2 - Sumar
        // 3 - Restar
        // 4 - Multiplicar
        // 5 - Dividir
        // 6 - Salir
        do
        {
            SResultado = "";
            if (opc != 99)
                clearScreen();
            System.out.println("Parcial JAVA Avanzado");
            System.out.println("Cristian Antonio Sanchez Aguilar - SA120974");
            System.out.println("Calculadora basica.");
            System.out.println("1. Ingresar numeros.");
            System.out.println("2. Sumar numeros.");
            System.out.println("3. Restar numeros.");
            System.out.println("4. Multiplicar numeros.");
            System.out.println("5. Dividir numeros.");
            System.out.println("6. Salir.");
            System.out.print("Escoga una opcion: ");
            opc = reader.nextInt();
            switch (opc)
            {
                case 1:
                    capturarNumeros();
                    break;
                case 2:
                    DResultado = sumar(numero1, numero2);
                    SResultado = "La suma entre " + numero1 + " y " + numero2 + " es: " + DResultado;
                    break;
                case 3:
                    DResultado = restar(numero1, numero2);
                    SResultado = "La resta entre " + numero1 + " y " + numero2 + " es: " + DResultado;
                    break;
                case 4:
                    DResultado = multiplicar(numero1, numero2);
                    SResultado = "La multiplicacion entre " + numero1 + " y " + numero2 + " es: " + DResultado;
                    break;
                case 5:
                    if (numero2 == 0)
                        SResultado = "La division no se puede realizar ya que el dividiendo es 0";
                    else
                    {
                        DResultado = dividir(numero1, numero2);
                        SResultado = "La division entre " + numero1 + " y " + numero2 + " es: " + DResultado;
                    }
                    break;
                case 6:
                    SResultado = "Que tenga un buen dia";
                    break;
                default:
                    SResultado = "Esa opcion no es valida";
            }
            System.out.println(SResultado);
            System.out.println("Presione <ENTER> para continuar...");
            reader.nextLine();
            reader.nextLine();
        } while (opc != 6);
    }
    
    //Metodo para capturar los 2 numeros
    public static void capturarNumeros()
    {
        clearScreen();
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese el numero 1:");
        numero1 = reader.nextDouble();
        System.out.print("Ingrese el numero 2:");
        numero2 = reader.nextDouble();
    }
    
    //Metodo para limpiar la consola
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }  
    
    //Metodo para sumar 2 numeros
    public static double sumar(double numero1, double numero2)
    {
        return numero1 + numero2;
    }
    
    //Metodo para restar 2 numeros
    public static double restar(double numero1, double numero2)
    {
        return numero1 - numero2;
    }
    
    //Metodo para multiplicar 2 numeros
    public static double multiplicar(double numero1, double numero2)
    {
        return numero1 * numero2;
    }
    
    //Metodo para dividir 2 numeros
    public static double dividir(double numero1, double numero2)
    {
        if (numero2 != 0)
            return numero1 / numero2;
        else
            return 0; //regresa 0 si el dividiendo es 0
    }
}
