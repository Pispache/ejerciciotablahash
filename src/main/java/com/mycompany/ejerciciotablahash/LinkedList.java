/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciotablahash;

/**
 *
 * @author Victor
 */
public class LinkedList {
     Node start, end;

    public void set(Person person) {
        Node node = new Node(person);
        if (start == null) {
            start = node;
            end = node;
        } else {
            end.next = node;
            end = node;
        }
    }

//    public Person get(int age) {
//        Node current = start;
//        while (current != null) {
//            if (current.person.getAge() == age) {
//                return current.person;
//            }
//            current = current.next;
//        }
//        return null;
//    }
    public Person get(String name) {
    Node current = start;
    while (current != null) {
        if (current.person.getName().equals(name)) {
            return current.person;
        }
        current = current.next;
    }
    return null;
}


    public boolean isEmpty() {
        return start == null;
    }

    public boolean remove(String name) {
        if (start == null) {
            return false; // La lista está vacía, no hay nada que eliminar
        }

        // Si el nodo a eliminar es el primer nodo
        if (start.person.getName().equals(name)) {
            if (start == end) {
                // Si solo hay un nodo en la lista
                start = end = null;
            } else {
                start = start.next;
            }
            return true;
        }

        // Buscar el nodo a eliminar
        Node previous = start;
        Node current = start.next;
        while (current != null) {
            if (current.person.getName().equals(name)) {
                if (current == end) {
                    // Si el nodo a eliminar es el último nodo
                    end = previous;
                    end.next = null;
                } else {
                    // Si el nodo a eliminar está en el medio de la lista
                    previous.next = current.next;
                }
                return true;
            }
            previous = current;
            current = current.next;
        }

        return false; // No se encontró el elemento a eliminar
    }
}
