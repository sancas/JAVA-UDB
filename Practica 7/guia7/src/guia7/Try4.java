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
public class Try4 {
    public static void main(String[] args)
    {
        int[] array = new int[20];
        try
        {
            String s = null;
            s.equals("QQQQ");
        }
        catch (ArrayIndexOutOfBoundsException excepcion)
        {
            System.out.println(" Error de incide en un array");
        }
        catch (ArithmeticException excepcion)
        {
            System.out.println("Error Aritmetico");
        }
        catch (Exception excepcion)
        {
            System.out.println("Se ha generado un error que no es de indices, ni Aritmetico");
            System.out.println("El objeto error es de tipo " + excepcion);
        }
    }
}
