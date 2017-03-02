/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor;
import java.util.*;

/**
 *
 * @author sanch
 */
public class SecToHHMMSS {
    
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in); //Variable para capturar entrada de teclado
        int ISegundosIniciales; //Cantidad de segundos que se ingresa el usuario
        int ISegundos; //Segundos en formato HH:MM:SS
        int IMinutos = 0; //Minutos en formato HH:MM:SS
        int IHoras = 0; //Horas en formato HH:MM:SS
        String SHora; //Cadena que contendra la hora convertida en formato HH:MM:SS
        
        System.out.println("Programa para convertir gran numero de segundos a formato HH:MM:SS");
        System.out.print("Ingrese el numero de segundos: ");
        ISegundosIniciales = reader.nextInt();
        
        ISegundos = ISegundosIniciales % 60;
        IMinutos = (ISegundosIniciales - ISegundos) / 60;
        IHoras = (IMinutos - (IMinutos % 60)) / 60;
        IMinutos = IMinutos%60;
        
        SHora = IHoras + ":" + IMinutos + ":" + ISegundos;
        System.out.println("El tiempo es: " + SHora);
    }
}
