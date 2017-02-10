/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;
import java.util.*;

/**
 *
 * @author Sancas
 */
public class Fraction {
    private int numerador;
    private int denominador;
    
    private Fraction()
    {
        numerador = 0;
        denominador = 1;
    }
    
    public Fraction(int n, int d)
    {
        if (d != 0) {
            numerador = n;
            denominador = d;
        }
        else
        {
            System.out.println("Error, numerador de fraccion no puede ser 0");
            System.exit(0);
        }
    }
    
    Fraction sumar(Fraction objeto)
    {
        Fraction Temporal  = new Fraction();
        Temporal.numerador = numerador*objeto.denominador + objeto.numerador*denominador;
        Temporal.denominador = denominador*objeto.denominador;
        return Temporal;
    }
    
    Fraction dividir(Fraction objeto)
    {
        Fraction Temporal = new Fraction();
        Temporal.numerador = numerador*objeto.denominador;
        Temporal.denominador = denominador*objeto.numerador;
        return Temporal;
    }
    
    Fraction multiplicar(Fraction objeto)
    {
        Fraction Temporal = new Fraction();
        Temporal.numerador = numerador*objeto.numerador;
        Temporal.denominador = denominador*objeto.denominador;
        return Temporal;
    }
    
    Fraction restar(Fraction objeto)
    {
        Fraction Temporal = new Fraction();
        Temporal.numerador = numerador*objeto.denominador - objeto.numerador*denominador;
        Temporal.denominador = denominador*objeto.denominador;
        return Temporal;
    }
    
    String obtener()
    {
        String valor = new String(numerador + "/" + denominador);
        return valor;
    }
    
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        int numerador;
        int denominador;
        System.out.print("Ingrese numerador: ");
        numerador = reader.nextInt();
        
        System.out.print("Ingrese denominador: ");
        denominador = reader.nextInt();
        
        Fraction objeto01 = new Fraction(numerador, denominador);
        
        System.out.print("Ingrese numerador: ");
        numerador = reader.nextInt();
        
        System.out.print("Ingrese denominador: ");
        denominador = reader.nextInt();
        
        Fraction objeto02 = new Fraction(numerador, denominador);
        
        System.out.print(objeto01.obtener() + " + " + objeto02.obtener() + ": ");
        Fraction objeto03 = objeto01.sumar(objeto02);
        System.out.println(objeto03.obtener());
        System.out.print(objeto01.obtener() + " - " + objeto02.obtener() + ": ");
        objeto03 = objeto01.restar(objeto02);
        System.out.println(objeto03.obtener());
        System.out.print(objeto01.obtener() + " * " + objeto02.obtener() + ": ");
        objeto03 = objeto01.multiplicar(objeto02);
        System.out.println(objeto03.obtener());
        System.out.print(objeto01.obtener() + " / " + objeto02.obtener() + ": ");
        objeto03 = objeto01.dividir(objeto02);
        System.out.println(objeto03.obtener());
        
    }
}
