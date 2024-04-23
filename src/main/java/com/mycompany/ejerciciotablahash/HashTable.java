/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciotablahash;

/**
 *
 * @author Victor
 */
public class HashTable {
    private LinkedList[] table;
    private int size;

    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList();
        }
    }

    public int hash(String name) {
        int sum = 0;
        for (char c : name.toCharArray()) {
            sum += c;
        }
        return sum % size;
    }

    public void put(Person person) {
        int index = hash(person.getName());
        table[index].set(person);
    }

    public Person get(String name) {
        int index = hash(name);
        return table[index].get(name);
    }

    public boolean remove(String name) {
        int index = hash(name);
        return table[index].remove(name);
    }

    public void printHashTable() {
        for (int i = 0; i < size; i++) {
            System.out.println("Bucket " + i + ":");
            LinkedList list = table[i];
            if (!list.isEmpty()) {
                Node current = list.start;
                while (current != null) {
                    System.out.println(current.person.getName() + ", " + current.person.getAge());
                    current = current.next;
                }
            } else {
                System.out.println("Empty");
            }
        }
    }
}
