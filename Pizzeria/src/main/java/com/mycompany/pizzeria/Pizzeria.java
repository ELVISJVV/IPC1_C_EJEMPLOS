/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pizzeria;

/**
 *
 * @author joseg
 */
public class Pizzeria {

  /*
    * Ejemplo de implementación de static
    * Los métodos y atributos estáticos no necesitan de la creación de una instancia u objeto (Pizzeria objetoPizzeria = new Pizzeria()) para ser utilizados
    * Estos métodos y atributos estáticos son únicos para cada clase
  */
 
 
  public static Pizza[] estateria = new Pizza[100]; //Atributo estático declarado e inicializado a nivel de clase (ambito global) de tipo Pizza. Es público y accesible de todos lados

  public Pizzeria () { //Constructor Pizzeria no utilizado aún
  }
    
  /**
   * Este método colocarPizza recibe un objeto tipo pizza y lo coloca en un espacio disponible del arreglo
   * El parámetro nueva_pizza es un objeto tipo pizza a colocar dentro del arreglo (llamado estatnteria) de pizzas
   * Hace un recorrido por todo el arreglo buscando un espacio null (vacio o que aún no tiene un objeto referenciado)
   * Cuando encuentra un espacion null coloca el objeto en esa posición y finaliza el método con una sentencia return
   * Si la posición del arreglo es null se sabe que está vacía y disponible aún
  */
  public static void colocarPizza(Pizza nueva_pizza) { 
    for(int i = 0; i < estateria.length; i++) {
        if(estateria[i] == null) {
          estateria[i] = nueva_pizza;
          return;
        }
    }
  }

  /*
   * Este método recorre el arreglo de tipo Pizza, llamado estanteria e imprime dos de los atributos de cada objeto
   * Es importante asegurar que unicamente se accedan objetos válidos en el arreglo, es decir, cuando la posición en el arreglo no es null
  */
  public static void mostrarPizzas() {
      for(Pizza pizza: estateria) { //Bucle For Each, buscar objeto pizza en estantería
         if(pizza != null) { //Asegurar la acción para objetos Pizza no nulos
            System.out.println("Tipo de masa: " + pizza.getTipoMasa() + "  Precio: " +pizza.getPrecio());
         }
      }
  }

  /*
   * Este método busca las coincidencias de un tipo de masa dentro de todos los objetos pizza, si encuentra algun objeto con este tipo de masa, sustituye el tipo de masa por otro
   * Método que recibe como parámetor un tipode masa a buscar (tipoMasa) y un tipo de masa a modificar (nuevoTipoMasa) cuando encuentre una coincidencia del tipo de masa buscado
  */

  public static void modificarPizzas(String tipoMasa, String nuevoTipoMasa) {
      for(Pizza pizza: estateria) { //Bucle For Each, buscar objeto pizza en estantería.
         if(pizza != null){ //Asegurar la acción para objetos Pizza no nulos.
            if(pizza.getTipoMasa().equals(tipoMasa)) { //Sí el tipo masa del objeto es igual al tipo masa buscado.
               pizza.setTipoMasa(nuevoTipoMasa); //Entonces colocar el nuevo tipo de masa al objeto encontrado. 
            }
         }
      }
  }
  
}
