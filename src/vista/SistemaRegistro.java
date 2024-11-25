/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestionLenguaje;
import java.util.Scanner;

/**
 *
 * @author Grey Cedillo
 */
public class SistemaRegistro {
    
    private GestionLenguaje gestionLenguaje;
    private Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SistemaRegistro sistema = new SistemaRegistro();
        sistema.menu();
    }
    
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("--- Menu Principal ---");
            System.out.println("1. Agregar lenguaje");
            System.out.println("2. Buscar lenguaje");
            System.out.println("3. Eliminar lenguaje");
            System.out.println("4. Mostrar lenguajes");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    agregarLenguaje();
                    break;
                case 2:
                    buscarLenguaje();
                    break;
                case 3:
                    eliminarLenguaje();
                    break;
                case 4:
                    mostrarLenguajes();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    private void agregarLenguaje() {
        System.out.print("Año de creación: ");
        int anio = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Característica principal: ");
        String caracteristica = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Utilización: ");
        String utilizacion = scanner.nextLine();
        gestionLenguaje.AgregarLenguaje(anio, caracteristica, nombre, utilizacion);
        System.out.println("Lenguaje agregado exitosamente.");
    }

    private void buscarLenguaje() {
        System.out.print("Ingrese el nombre del lenguaje a buscar: ");
        String nombre = scanner.nextLine();
        var lenguaje = gestionLenguaje.BuscarLenguaje(nombre);
        if (lenguaje != null) {
            System.out.println(lenguaje);
        } else {
            System.out.println("Lenguaje no encontrado.");
        }
    }

    private void eliminarLenguaje() {
        System.out.print("Ingrese el nombre del lenguaje a eliminar: ");
        String nombre = scanner.nextLine();
        if (gestionLenguaje.EliminarLenguaje(nombre)) {
            System.out.println("Lenguaje eliminado exitosamente.");
        } else {
            System.out.println("Lenguaje no encontrado.");
        }
    }

    private void mostrarLenguajes() {
        System.out.println("--- Lista de Lenguajes ---");
        gestionLenguaje.ImprimirLenguajes();
    }
    
}
