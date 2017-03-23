/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8;

/**
 *
 * @author sanch
 */
public class MultiThreadingDemo implements Runnable {
    
    @Override
    public void run() {
        System.out.println("Estado activo");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MultiThreadingDemo obj = new MultiThreadingDemo();
        Thread tobj = new Thread(obj);
        tobj.start();
    }
    
}
