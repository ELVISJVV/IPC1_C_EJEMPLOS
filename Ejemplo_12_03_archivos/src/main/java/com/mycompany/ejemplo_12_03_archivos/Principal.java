/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejemplo_12_03_archivos;

/**
 *
 * @author joseg
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AdministradorArchivos admin = new AdministradorArchivos();

        //Crear archivo con nombre: archivo.csv y su contenido en la ruta del directorio actual (del proyecto)
        admin.crearArchivo("arhivo1.csv", "categoria,valor\npollo,10\npizza,60"); 
        //Obtener texto leido del archivo, ruta del directorio actual (del proyecto)
        String texto = admin.obtenerTexto("arhivo1.csv");
        System.out.println(texto);
    }
    
}
