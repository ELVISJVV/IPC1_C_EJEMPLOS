/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplos_algoritmos_ordenamiento;

/**
 *
 * @author joseg
 */
public class Ordenador {

    /*
       Ordenamientos Ascendentes
    */
    public void burbujaAscendente(int[] arreglo) {
        int limite = arreglo.length;
        int auxiliar;

        for(int i = 0; i < limite; i++) {
            for(int j = 0; j < limite  - 1; j++ ) {
                if(arreglo[j] > arreglo[j + 1]) {
                   auxiliar = arreglo[j];
                   arreglo[j] = arreglo[j + 1];
                   arreglo[j + 1] = auxiliar;
                }
            }
        }
    } 

    public void seleccionAscendente(int[] arreglo) {
        int limite = arreglo.length;
        int auxiliar, indiceMinimo;

        for(int i = 0; i < limite; i++) {
            indiceMinimo = i;
            for(int j = i + 1; j < limite; j++ ) {
                if(arreglo[j] < arreglo[indiceMinimo]) {
                   indiceMinimo = j;
                }
            }
            auxiliar = arreglo[i];
            arreglo[i] = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = auxiliar;
        }
    } 

    public void insercionAscendente(int[] arreglo) {
        int limite = arreglo.length;
        int auxiliar;
        int pos;

        for(int i = 0; i < limite; i++) {
            pos = i;
            auxiliar = arreglo[pos];
            while((pos > 0) && arreglo[pos -1] > auxiliar){
                arreglo[pos] = arreglo[pos - 1];
                pos--;
            }
            arreglo[pos] = auxiliar;
        }
    } 

    /*
       Ordenamientos Descendentes
    */
    public void burbujaDescendente(int[] arreglo) {
        int limite = arreglo.length;
        int auxiliar;

        for(int i = 0; i < limite; i++) {
            for(int j = 0; j < limite  - 1; j++ ) {
                if(arreglo[j] < arreglo[j + 1]) { //Cambio en condición
                   auxiliar = arreglo[j];
                   arreglo[j] = arreglo[j + 1];
                   arreglo[j + 1] = auxiliar;
                }
            }
        }
    } 

    public void seleccionDescendente(int[] arreglo) {
        int limite = arreglo.length;
        int auxiliar, indiceMinimo;

        for(int i = 0; i < limite; i++) {
            indiceMinimo = i;
            for(int j = i + 1; j < limite; j++ ) {
                if(arreglo[j] > arreglo[indiceMinimo]) { //Cambio en condición
                   indiceMinimo = j;
                }
            }
            auxiliar = arreglo[i];
            arreglo[i] = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = auxiliar;
        }
    } 

    public void insercionDescendente(int[] arreglo) {
        int limite = arreglo.length;
        int auxiliar;
        int pos;

        for(int i = 0; i < limite; i++) {
            pos = i;
            auxiliar = arreglo[pos];
            while((pos > 0) && arreglo[pos -1] < auxiliar){ //Cambio en condición
                arreglo[pos] = arreglo[pos - 1];
                pos--;
            }
            arreglo[pos] = auxiliar;
        }
    } 

    public void imprimir(int[] arreglo) {
        for(int numero: arreglo) {
            System.out.print(numero + " ");
        }
    }
}
