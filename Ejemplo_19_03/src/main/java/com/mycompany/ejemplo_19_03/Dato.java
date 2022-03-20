/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo_19_03;

/**
 *
 * @author joseg
 */
public class Dato {
    private String categoria;
    private int valor;
   
    public Dato (String categoria, int valor) {
        this.categoria = categoria;
        this.valor = valor;
    }
    
    public Dato (String categoria, String valor) {
        this.categoria = categoria;
        this.valor = Integer.parseInt(valor);
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
}
