/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investigacioncomplementaria;

/**
 *
 * @author sanch
 */
public class LigaEspañola {
    public static void main(String[] args)
    {
        Equipo ligaEspanhola = Equipo.BARCA;
        System.out.println("El top4 de la liga española es el siguiente: ");
        System.out.format("# %-15s\tPTS\n", "Equipo");
        for (Equipo tmp: ligaEspanhola.values()) 
        {
            System.out.format("%1d %-15s\t%2d\n", tmp.getPuestoLiga(), tmp.getNombreClub(), tmp.getPuntosLiga());
        }
    }
}