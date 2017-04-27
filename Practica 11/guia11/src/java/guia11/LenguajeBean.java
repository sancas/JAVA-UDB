/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11;

/**
 *
 * @author sanch
 */
public class LenguajeBean {
    private String nombre;
    private String lenguaje;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the lenguaje
     */
    public String getLenguaje() {
        return lenguaje;
    }

    /**
     * @param lenguaje the lenguaje to set
     */
    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    public String getComentarios() {
        if(lenguaje.equals("C++"))
        {
            return "Demasiado complejo";
        }
        else if(lenguaje.equals("C#"))
        {
            return "Demasiado Microsoft para ser portable";
        }
        else if(lenguaje.equals("PHP"))
        {
            return "Demasiado WEB";
        }
        else if(lenguaje.equals("Perl"))
        {
            return "OK si te gusta el codigo incomprensible";
        }
        else
        {
            return "Lo siento, no conozco el lenguaje " + lenguaje;
        }
    }
}
