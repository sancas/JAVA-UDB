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
public class Matriz01 {
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
        
        int dias_del_mes[];
        String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
        dias_del_mes = new int[12];
        dias_del_mes[0] = 31;
        dias_del_mes[1] = 28;
        dias_del_mes[2] = 31;
        dias_del_mes[3] = 30;
        dias_del_mes[4] = 31;
        dias_del_mes[5] = 30;
        dias_del_mes[6] = 31;
        dias_del_mes[7] = 31;
        dias_del_mes[8] = 30;
        dias_del_mes[9] = 31;
        dias_del_mes[10] = 30;
        dias_del_mes[11] = 31;
        
        System.out.print("Ingrese el mes(1-12): ");
        int mes = reader.nextInt();
        System.out.println("\n" + meses[mes-1] + " tiene " + dias_del_mes[mes-1] + " días");
    }
}
