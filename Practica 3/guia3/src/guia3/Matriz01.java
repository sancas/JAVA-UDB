/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

/**
 *
 * @author sanch
 */
public class Matriz01 {
    public static void main(String args[])
    {
        int dias_del_mes[];
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
        System.out.println("Abril tiene " + dias_del_mes[3] + " días");
    }
}
