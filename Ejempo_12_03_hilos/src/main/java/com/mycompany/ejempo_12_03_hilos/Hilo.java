/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejempo_12_03_hilos;

import javax.swing.JPanel;

/**
 *
 * @author joseg
 */
public class Hilo extends JPanel implements Runnable { //Hilos implementando interfaz (imitando comportamiento de la herencia multiple)
    private String nombre;    //atritubo para distinguir el inicio de los hilos

    public Hilo(String nombre) {
        this.nombre = nombre;
    }
    public void run() {
        recorrerArreglo();
    }

    public void recorrerArreglo(){
        int[] arreglo = {1,2,3,4,5,6};
        System.out.println(nombre);
        for(int numero: arreglo) {
           try {
             Thread.sleep(3000); //Pausa de 3 segundos (3000 milisegundos)
           } catch(InterruptedException e){
                //En caso de error
           }

           System.out.println(numero);
        }
        
        System.out.println("FIN " + nombre + "...");

    }
}
