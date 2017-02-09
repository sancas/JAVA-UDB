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
public class Matriz02 {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        int dias_del_mes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
        System.out.print("Ingrese el mes(1-12): ");
        int mes = reader.nextInt();
        System.out.println("\n" + meses[mes-1] + " tiene " + dias_del_mes[mes-1] + " días");
    }
}
