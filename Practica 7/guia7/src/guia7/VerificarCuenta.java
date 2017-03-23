/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import java.io.*;

/**
 *
 * @author sanch
 */
public class VerificarCuenta {
    private double balance;
    private int numero;
    
    public VerificarCuenta(int numero) {
        this.numero = numero;
    }
    
    public void depositar(double amount) {
        balance += amount;
    }
    
    public void retiro(double amount) throws FondosInsuficientesException {
        if(amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new FondosInsuficientesException(needs);
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public int getNumer() {
        return numero;
    }
}
