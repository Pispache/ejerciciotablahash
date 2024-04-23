/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejerciciotablahash;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class EJercicioTablaHash {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de buckets para la tabla hash:");
        int numberOfBuckets = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        HashTable hashTable = new HashTable(numberOfBuckets);

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Insertar");
            System.out.println("2. Buscar");
            System.out.println("3. Eliminar");
            System.out.println("4. Listar");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Insertar ---");
                    System.out.println("Ingrese el nombre de la persona:");
                    String name = scanner.nextLine();
                    System.out.println("Ingrese la edad de la persona:");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea

                    Person person = new Person(name, age);
                    hashTable.put(person);
                    break;
                case 2:
                    System.out.println("\n--- Buscar ---");
                    System.out.println("Ingrese el nombre de la persona a buscar:");
                    String searchName = scanner.nextLine();

                    Person foundPerson = hashTable.get(searchName);
                    if (foundPerson != null) {
                        System.out.println("Persona encontrada: " + foundPerson.getName() + ", " + foundPerson.getAge());
                        System.out.println("En el bucket: " + hashTable.hash(searchName));
                    } else {
                        System.out.println("No se encontró ninguna persona con ese nombre.");
                    }
                    break;
                case 3:
                    System.out.println("\n--- Eliminar ---");
                    System.out.println("Ingrese el nombre de la persona a eliminar:");
                    String deleteName = scanner.nextLine();

                    boolean removed = hashTable.remove(deleteName);
                    if (removed) {
                        System.out.println("Persona eliminada exitosamente.");
                    } else {
                        System.out.println("No se encontró ninguna persona con ese nombre para eliminar.");
                    }
                    break;
                case 4:
                    System.out.println("\n--- Listar ---");
                    hashTable.printHashTable();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
