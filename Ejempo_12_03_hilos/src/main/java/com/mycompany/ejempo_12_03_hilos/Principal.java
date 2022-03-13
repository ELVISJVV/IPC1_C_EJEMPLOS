/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejempo_12_03_hilos;

/**
 *
 * @author joseg
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Hilo hilo1 = new Hilo("hilo1"); //Primer objeto tipo Hilo(hilo1), con implementación de Runnable
        Hilo hilo2 = new Hilo("hilo2"); //Segundo objeto tipo Hilo(hilo2), con implementación de Runnable
        
        Thread h1 = new Thread(hilo1); //Objeto tipo thread que recibe el hilo1
        Thread h2 = new Thread(hilo2); //Objeto tipo thread que recibe el hilo2

        h1.start(); //Iniciar el hilo1
        h2.start(); //Iniciar el hilo2

    }

    
}
