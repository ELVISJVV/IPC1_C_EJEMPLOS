/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo_12_03_archivos;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author joseg
 */
public class AdministradorArchivos {

    public void crearArchivo(String nombre, String texto) {

        File nuevoArchivo=new File(nombre); //crear archivo
         
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter(nuevoArchivo));
            bw.write(texto); //escribir
            bw.close(); //cerrar el flujo y liberar recursos
            Desktop.getDesktop().open(nuevoArchivo);
        }catch(IOException a){
            //en caso de error
        }
    }
    
    public String obtenerTexto(String ruta) {

        String texto = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta)); 
            String linea; 
            while((linea = br.readLine()) != null) { //leer
                //área de lectura línea por línea, estructura: categoria,valor  [Salto de linea]  pollo,10
                String columnas[] = linea.split(",");
                texto += "Categoria: " + columnas[0] + "   |    Valor:" + columnas[1]+"\n";
            } 
            br.close(); //cerrar el flujo y liberar recursos
        } catch(IOException e) {
           //en caso de error 
        }
        
        return texto; //retornar lectura de las lineas concatenadas del archivo 
    }
}
