package Panaderia21; // Declara que esta clase pertenece al paquete Panaderia21

import java.util.Scanner; // Importa la clase Scanner para la entrada de datos del usuario

public class Panadero extends Empleado { // Define la clase Panadero que hereda de Empleado

    // Constructor de la clase Panadero
    Panadero(String nombre) {
        this.setNombre(nombre); // Establece el nombre del panadero usando el método setNombre heredado de Empleado
        System.out.println("El panadero " + this.getNombre() + " se reporta para hornear..."); // Mensaje de bienvenida para el panadero
    }

    // Método para hornear donas y brownies
    public void hornear(Pan dona, Pan brownie) {
        Scanner scanner = new Scanner(System.in); // Crea una instancia de Scanner para leer la entrada del usuario
        int opcion; // Variable para almacenar la opción seleccionada por el usuario
        int cantidad; // Variable para almacenar la cantidad de pan a hornear

        do {
            mostrarMenuHorneado(); // Muestra el menú de opciones para hornear

            opcion = scanner.nextInt(); // Lee la opción seleccionada por el usuario

            if (opcion == 1) {
                // Hornear Donas
                System.out.println("¿Cuantas Donas desea hornear?"); // Solicita al usuario la cantidad de donas a hornear
                cantidad = scanner.nextInt(); // Lee la cantidad de donas
                dona.hornear(cantidad); // Llama al método hornear de la instancia de Pan para donas
                System.out.println("Donas horneadas exitosamente. Total en inventario: " + dona.getStock()); // Mensaje de éxito y muestra el stock actualizado
            } else if (opcion == 2) {
                // Hornear Brownies
                System.out.println("¿Cuantos Brownies desea hornear?"); // Solicita al usuario la cantidad de brownies a hornear
                cantidad = scanner.nextInt(); // Lee la cantidad de brownies
                brownie.hornear(cantidad); // Llama al método hornear de la instancia de Pan para brownies
                System.out.println("Brownies horneados exitosamente. Total en inventario: " + brownie.getStock()); // Mensaje de éxito y muestra el stock actualizado
            } else if (opcion == 0) {
                System.out.println("Saliendo del proceso de horneado..."); // Mensaje al salir del proceso de horneado
            } else {
                System.out.println("Opción no válida. Intente de nuevo."); // Mensaje de error si la opción no es válida
            }

        } while (opcion != 0); // Repite el ciclo hasta que el usuario seleccione la opción 0 para salir
    }

    // Método privado para mostrar el menú de opciones de horneado
    private void mostrarMenuHorneado() {
        System.out.println("\nSeleccione el tipo de pan a hornear:"); // Muestra el mensaje para seleccionar el tipo de pan
        System.out.println("1. Donas"); // Opción para hornear donas
        System.out.println("2. Brownies"); // Opción para hornear brownies
        System.out.println("0. Salir"); // Opción para salir del proceso de horneado
    }
}
