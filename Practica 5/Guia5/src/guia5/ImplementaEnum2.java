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
public class ImplementaEnum2 {
    
    public static void main(String[] args)
    {
        TipoArbol maderaUsuario1 = TipoArbol.ROBLE;
        System.out.println("La madera elegida por el usuario es "
            + maderaUsuario1.toString() + "\ncon un color "
            + maderaUsuario1.getColor() + " y con un peso especifico de "
            + maderaUsuario1.getPesoEspecifico() + " kg/m3");

        System.out.println("Un palet admite 2.27 m3 de volumen. A continuacion"
            + " el peso de los palets de las distintas maderas:");
        
        for (TipoArbol tmp : TipoArbol.values()){
            System.out.println(tmp.toString() + " el palet pesa " 
                    + (2.27f * (float) tmp.getPesoEspecifico()) + " kg");
        }
    }
}
