/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printer;
import java.util.*;
/**
 *
 * @author sanch
 */
public class ImagePrinting {
    public static void main(String[] args)
    {
        char CCaracter; //Variable para almacenar el caracter deseado
        int opc; //Variable de control para dibujar el dibujo correcto
        Scanner reader = new Scanner(System.in); //Variable para leer datos del teclado
        
        System.out.println("El siguiente programa imprime 3 tipos de figuras flecha, triangulo o cuadrado segun corresponda");
        System.out.println("1. Flecha");
        System.out.println("2. Triangulo");
        System.out.println("3. Cuadrado");
        System.out.print("Escoga una opcion: ");
        opc = reader.nextInt();
        System.out.print("Caracter deseado: ");
        CCaracter = reader.next().charAt(0);
        switch (opc) {
            case 1:
                printArrow(CCaracter);
                break;
            case 2:
                printTriangle(CCaracter);
                break;
            case 3:
                printSquare(CCaracter);
                break;
            default:
                System.out.println("No escogio una opcion valida");
                break;
        }
    }
    
    public static void printArrow(char caracter)
    {
        System.out.println("          " + caracter);
        System.out.println("           " + caracter);
        System.out.println("            " + caracter);
        for (int x = 0; x < 13; x++)
            System.out.print(caracter);
        System.out.println(caracter);
        System.out.println("            " + caracter);
        System.out.println("           " + caracter);
        System.out.println("          " + caracter);
    }
    
    public static void printTriangle(char caracter)
    {
        System.out.println("     " + caracter);
        System.out.println("    " + caracter + " " + caracter);
        System.out.println("   " + caracter + "   " + caracter);
        System.out.println("  " + caracter + "     " + caracter);
        System.out.println(" " + caracter + "       " + caracter);
        for (int x = 0; x < 11; x++)
            System.out.print(caracter);
        System.out.println();
    }
    
    public static void printSquare(char caracter)
    {
        for(int x = 0; x < 10; x++)
            System.out.print(caracter);
        System.out.println();
        for(int x = 0; x < 5; x++)
            System.out.println(caracter + "        " + caracter);
        for(int x = 0; x < 10; x++)
            System.out.print(caracter);
        System.out.println();
    }
}
