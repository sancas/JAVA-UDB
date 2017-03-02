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
public enum Equipo {
    BARCA("FC Barcelona", 1, 57), REAL_MADRID("Real Madrid", 2, 56),
    SEVILLA("Sevilla", 3, 52), ATLETICO_MADRID("Atletico Madrid", 4, 45);
    
    private String nombreClub;
    private int puestoLiga;
    private int puntosLiga;
    
    private Equipo(String nombreClub, int puestoLiga, int puntosLiga)
    {
        this.nombreClub = nombreClub;
        this.puestoLiga = puestoLiga;
        this.puntosLiga = puntosLiga;
    }
    
    public String getNombreClub()
    {
        return nombreClub;
    }
    
    public int getPuestoLiga()
    {
        return puestoLiga;
    }
    
    public int getPuntosLiga()
    {
        return puntosLiga;
    }
}