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
public class Matriz03 {
    public static void main(String[] args)
    {
        long[] arreglo;
        arreglo = new long[100];
        int nElementos = 0;
        int j;
        long busquedaLlave;
        arreglo[0] = 71;
        arreglo[1] = 100;
        arreglo[2] = 46;
        arreglo[3] = 53;
        arreglo[4] = 22;
        arreglo[5] = 75;
        arreglo[6] = 10;
        arreglo[7] = 64;
        arreglo[8] = 47;
        arreglo[9] = 33;
        nElementos = 10;
        for (j = 0 ; j < nElementos; j++)
            System.out.print(arreglo[j] + " ");
        System.out.println();
        busquedaLlave = 53; //Encontrar Have 53 en el arreglo
        for (j = 0; j < nElementos; j++)
            if (arreglo[j] == busquedaLlave)
                break;
        if (j == nElementos)
            System.out.println("No se encontro la llave " + busquedaLlave);
        else
            System.out.println("Se encontro llave " + busquedaLlave);
        busquedaLlave = 64; //Borrar item 64 si se encuentra en el arreglo
        for (j = 0; j < nElementos; j++)
            if(arreglo[j] == busquedaLlave)
                break;
        for (int k = j; k < nElementos - 1; k++)
            arreglo[k] = arreglo[k+1];
        nElementos--;
        for (j = 0; j < nElementos; j++)
            System.out.print(arreglo[j] + " ");
        System.out.println();
    }
}
