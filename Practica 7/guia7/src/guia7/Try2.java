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
public class Try2 {
    public static void main(String[] args)
    {
        int[] array = new int[20];
        try
        {
            array[-3] = 24;
        } catch(ArrayIndexOutOfBoundsException excepcion)
        {
            System.out.println(" Error de indice en un array");
        }
    }
}
