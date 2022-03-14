/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplos_algoritmos_ordenamiento;


/**
 *
 * @author joseg
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Ordenador ord = new Ordenador(); //objeto con opciones de ordenamiento

        System.out.println("-------ALGORITMOS ASCENDENTES-----\n");

        int[] arreglo1 = { 5, 2, 4, 3, 1 }; 
        ord.burbujaAscendente(arreglo1);
        System.out.println("\n-----BURBUJA-----");
        ord.imprimir(arreglo1);
        System.out.println("\n-----------------\n");


        int[] arreglo2 = { 7, 3, 1, 2, 8 }; 
        ord.seleccionAscendente(arreglo2);
        System.out.println("\n----SELECCIÓN----");
        ord.imprimir(arreglo2);
        System.out.println("\n-----------------\n");

        int[] arreglo3 = { 10, 6, 5, 3, 1 }; 
        ord.insercionAscendente(arreglo3);
        System.out.println("\n----INSERSIÓN----");
        ord.imprimir(arreglo3);
        System.out.println("\n-----------------\n");


    }
    
}
