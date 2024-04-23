/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciotablahash;

/**
 *
 * @author Victor
 */
public class Lista {
    private Nodo inicio;

    public void agregar(int numero) {
        Nodo nodo = new Nodo();
        nodo.setNumero(numero);
        if (inicio == null) {
            inicio = nodo;
        } else {
            Nodo tmp = inicio;
            while (tmp.getApuntador() != null) {
                tmp = tmp.getApuntador();
            }
            tmp.setApuntador(nodo);
        }
    }

    public void mostrar() {
        if (inicio == null) {
            System.out.println("La lista esta vacia");
            return;
        }
        Nodo tmp = inicio;
        System.err.println(tmp.getNumero());
        while (tmp.getApuntador() != null) {
            tmp = tmp.getApuntador();
            System.err.println(tmp.getNumero());
        }
    }
}
