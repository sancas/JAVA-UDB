/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

/**
 *
 * @author Usuario
 */
public enum Equipo {
    BARCA("FC Barcelona", 2), REAL_MADRID("Real Madrid", 1),
    ATLETICO_MADRID("Atletico Madrid", 4), VILLAREAL("Villareal", 3);
    
    private String nombreClub;
    private int puestoLiga;
    
    private Equipo(String nombreClub, int puestoLiga)
    {
        this.nombreClub = nombreClub;
        this.puestoLiga = puestoLiga;
    }
    
    public String getNombreClub()
    {
        return nombreClub;
    }
    
    public int getPuestoLiga()
    {
        return puestoLiga;
    }
}
