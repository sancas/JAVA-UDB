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
public class PersonaBean {
    private String nombre;
    private int edad;

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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getTipo() {
        if (edad < 40)
            return "joven";
        return "no joven";
    }
    
    public boolean getJoven() {
        if (edad < 40) {
            return true;
        }
            return false;
    }
}
