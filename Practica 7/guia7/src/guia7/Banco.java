/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

/**
 *
 * @author sanch
 */
public class Banco {
    public static void main(String[] args) {
        VerificarCuenta c = new VerificarCuenta(101);
        System.out.println("Depositando $500...");
        c.depositar(500.00);
        try {
            System.out.println("\nRetirando $100...");
            c.retiro(100.00);
            System.out.println("\nRetirando $600...");
            c.retiro(600.00);
        } catch (FondosInsuficientesException e) {
            System.out.println("Lo lamentamos pero no quedan fondos suficientes $" + e.getAmount());
            e.printStackTrace();
        }
    }
}
