/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria;

/**
 *
 * @author joseg
 */

public class Pizza {
    
    private String[] ingredientes; //Atributo privado, arreglo tipo String de ingredientes de la pizza
    private String tipoMasa; //Atributo privado, variable String para el tipo de masa de la pizza
    private String especialidad; //Atributo privado, variable String para la especialidad de la pizza (no utilizado aún)
    private String tamano; //Atributo privado, variable String para el tamaño de pizza (no utilizado aún)
    private double precio; //Atributo privado, variable double para el precio de la pizza


    /*
     * Constructor sobrecargado para Pizza, recibe un arreglo String de ingredientes y otros parámetros para inicializar los atributos del objeto
     * Uso de this para hacer referencia a los atributos globales que pertenecen al objeto y no a los parámetros. Esto permite diferenciar a que identificador nos referimos
    */

    public Pizza(
                 String[] ingredientes, 
                 String tipoMasa, 
                 String especialidad, 
                 String tamano, 
                 double precio
                ) {

      this.ingredientes = ingredientes;
      this.tipoMasa = tipoMasa;
      this.especialidad = especialidad;
      this.tamano = tamano;
      this.precio = precio;
    }

    /*
     * Constructor sobrecargado para Pizza, recibe un String de ingredientes y otros parámetros para inicializar los atributos del objeto
     * Realiza un Split (separación de una cadena en partes dado un separador, en este caso ",") para extraer los ingredientes en un arreglo tipo String
    */

    public Pizza(
                 String ingredientes, 
                 String tipoMasa, 
                 String especialidad, 
                 String tamano, 
                 double precio
                ) {
      this.ingredientes = ingredientes.split(","); //Separar ingredientes por coma y devolver un nuevo arreglo tipo String con los ingredientes separados
      this.tipoMasa = tipoMasa;
      this.especialidad = especialidad;
      this.tamano = tamano;
      this.precio = precio;
    }

    /*
     * Getters para obtener el valor de los atributos privados
     * Setters para modificar el valor de los atributos privados
    */
 
    //Setter para tipoMasa   
    public void setTipoMasa(String tipoMasa) {
      this.tipoMasa = tipoMasa;
    }

    //Getter para tipoMasa
    public String getTipoMasa() {
      return tipoMasa;
    }

    //Setter para Precio   
    public void setPrecio(double precio) {
      this.precio = precio;
    }

    //Getter para Precio   
    public double getPrecio() {
      return precio;
    }


    /*
     * Método que imprime los ingredientes del objeto creado
     * Recorrido del arreglo mediante ciclo For Each
    */

    public void mostrarIngredientes() {
      for(String ingrediente: ingredientes) { //Ciclo For Each (Para cada ingrediente (tipo String) en arreglo (tipo String) de ingredientes)
         System.out.println(ingrediente); //Imprimir ingrediente
      }
    }
    
}
