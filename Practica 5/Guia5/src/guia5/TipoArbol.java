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
public enum TipoArbol {
    ROBLE ("Castaño verdoso", 800),
    CAOBA ("Marrón oscuro", 770),
    NOGAL ("Marrón rojizo", 820),
    CEREZO ("Marrón cereza", 790),
    BOJ ("Marrón negruzco", 675);
    
    private final String color;
    private final int pesoEspecifico;
    
    TipoArbol (String color, int pesoEspecifico) 
    {
        this.color = color;
        this.pesoEspecifico = pesoEspecifico;
    }
    
    public String getColor() {
        return color;
    }
    
    public int getPesoEspecifico() {
        return pesoEspecifico;
    }
}
