/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplo_19_03;

/**
 *
 * @author joseg
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String cadena = "Comida,precio\npollo,10\npizza,60\ntaco,30\ntaco,30\ntaco,30"; //Cadena

        String [] lineas = cadena.split("\n"); //Separando lineas del texto
        
        String[] encabezados = lineas[0].split(","); //Obteniendo la primera fila
        
        Dato[] datos = new Dato[lineas.length-1]; //Arreglo a la medida de las lineas sin encabezado
        
        String[] columnas;
        
        for(int i=1; i< lineas.length; i++) {
            columnas = lineas[i].split(","); //Split de columnas

            datos[i-1] = new Dato(columnas[0],columnas[1]); //Colocar dato en clase datos
        }
        
        for(Dato dato: datos) {
            System.out.println("Categoria: "+dato.getCategoria() + " Valor: "+dato.getValor()); //Recorrido del arreglo construido
        }
      
    }
    
}
