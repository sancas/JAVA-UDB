/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

/**
 *
 * @author sanch
 */
public class Matriz06 {
    public static void main(String[] args)
    {
        if (args[0].equals("-h"))
            System.out.print("Hola");
        else if (args[0].equals("-g"))
            System.out.print("Adios");
        for (int i = 1; i < args.length; i++)
            System.out.print(" " + args[i]);
        System.out.println("!");
    }
}
