package com.mycompany.pizzeria;

/**
 *
 * @author joseg
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String[] ingredientes = new String[5]; //Declaración de arreglo String de ingredientes
         Pizza objeto_pizza1 = new Pizza(ingredientes, "Pan pizza", "Delux", "Grande", 50.5); //Creación de bjeto pizza 1 - Método sobrecargado que recibe un arreglo de Strings como primer parámetro
         Pizza objeto_pizza2 = new Pizza("salsa,queso,piña", "Clásica", "Hawaiana", "Mediana", 55.5); //Creación de bjeto pizza 2 - Método sobrecargado que recibe un String y realiza un Split
         Pizza objeto_pizza3 = new Pizza("salsa,queso,piña", "Clásica", "5 Carnes", "Personal", 30.5); //Creación de bjeto pizza 3  - Método sobrecargado que recibe un String y realiza un Split
           
         //Utilización de métodos estáticos, no necesito crear una instancia u objeto (Pizzeria objetoPizzeria = new Pizzeria) para utilizarlos.
         Pizzeria.colocarPizza(objeto_pizza1); //Llamada al método estático colocarPizza de la clase Pizzería, se le envía un objeto tipo Pizza (objetoPizza1) como parámetro
         Pizzeria.colocarPizza(objeto_pizza2); //Otra llamada a colocarPizza
         Pizzeria.colocarPizza(objeto_pizza3); //Otra llamada a colocarPizza

         Pizzeria.modificarPizzas("Clásica", "Pan pizza"); //LLamada al método estático modificarPizzas de Pizzeria

         Pizzeria.mostrarPizzas(); //Llamada al método estático mostrarPizzas de Pizzeria
    }
    
}
