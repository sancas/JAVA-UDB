/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

/**
 *
 * @author sanch
 */
public class Try3 {
    public static void main(String[] args)
    {
        int[] array = new int[20];
        try
        {
            int b = 0;
            int a = 23 / b;
        }
        catch (ArrayIndexOutOfBoundsException excepcion)
        {
            System.out.println(" Error de indice en un array");
        }
        catch (ArithmeticException excepcion)
        {
            System.out.println(" Error Aritmetico");
        }
    }
}
