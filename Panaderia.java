package Panaderia21; // Declara que esta clase pertenece al paquete Panaderia21

import java.util.Scanner; // Importa la clase Scanner para la entrada de datos del usuario

public class Panaderia { // Define la clase Panaderia

    private Cajera cajera; // Atributo privado para la cajera
    private Panadero panadero; // Atributo privado para el panadero
    private Pan donas; // Atributo privado para el pan de donas
    private Pan brownie; // Atributo privado para el pan de brownies
    private Cliente cliente; // Atributo privado para el cliente
    private double caja = 0; // Atributo privado para el dinero en caja, inicializado en 0
    private Administrador admin; // Atributo privado para el administrador

    // Constructor de la clase Panaderia
    public Panaderia(String nombreAdmin, String nombrePanaderia) {
        this.cajera = new Cajera("Ximena"); // Inicializa el atributo cajera con una nueva instancia de Cajera
        this.panadero = new Panadero("Cesar"); // Inicializa el atributo panadero con una nueva instancia de Panadero
        this.donas = new Pan("donas", 1.5f); // Inicializa el atributo donas con una nueva instancia de Pan
        this.brownie = new Pan("brownie", 2.0f); // Inicializa el atributo brownie con una nueva instancia de Pan
        this.cliente = new Cliente(); // Inicializa el atributo cliente con una nueva instancia de Cliente
        this.admin = new Administrador(nombreAdmin); // Inicializa el atributo admin con una nueva instancia de Administrador
        System.out.println("Bienvenido(a) a " + nombrePanaderia); // Imprime un mensaje de bienvenida con el nombre de la panadería
    }

    // Método para ejecutar las opciones del menú
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in); // Crea una instancia de Scanner para leer la entrada del usuario
        int opcion; // Variable para almacenar la opción seleccionada por el usuario

        do {
            mostrarMenu(); // Muestra el menú de opciones al usuario
            opcion = scanner.nextInt(); // Lee la opción seleccionada por el usuario

            // Verifica si la opción ingresada es válida
            while (opcion < 1 || opcion > 4) {
                System.out.println("Opcion no válida, intente de nuevo."); // Mensaje de error si la opción no es válida
                mostrarMenu(); // Muestra el menú de opciones nuevamente
                opcion = scanner.nextInt(); // Lee una nueva opción
            }

            // Ejecuta acciones basadas en la opción seleccionada
            if (opcion == 1) {
                panadero.hornear(donas, brownie); // Llama al método hornear del panadero para hornear donas y brownies
            } else if (opcion == 2) {
                cajera.vender(donas, brownie, cliente); // Llama al método vender de la cajera para vender donas y brownies al cliente
            } else if (opcion == 3) {
                cajera.corteDeCaja(); // Llama al método corteDeCaja de la cajera para realizar el corte de caja
                mostrarEstadisticas(); // Muestra las estadísticas de ventas
            } else if (opcion == 4) {
                System.out.println("Saliendo del programa..."); // Mensaje al salir del programa
            } else {
                System.out.println("Opcion no reconocida."); // Mensaje de error si la opción no es reconocida
            }

        } while (opcion != 4); // Repite el ciclo hasta que el usuario seleccione la opción 4 para salir

        scanner.close(); // Cierra el scanner para liberar los recursos
    }

    // Método privado para mostrar el menú de opciones al usuario
    private void mostrarMenu() {
        System.out.println("Seleccione una opcion:"); // Muestra el mensaje para seleccionar una opción
        System.out.println("1. Hornear pan"); // Opción para hornear pan
        System.out.println("2. Vender pan"); // Opción para vender pan
        System.out.println("3. Corte de caja"); // Opción para realizar el corte de caja
        System.out.println("4. Salir"); // Opción para salir del programa
    }

    // Método privado para mostrar las estadísticas de ventas
    private void mostrarEstadisticas() {
        System.out.println("\nEstadísticas:"); // Título para las estadísticas
        System.out.println("Total vendido de Donas: " + donas.getStock()); // Muestra el total vendido de donas
        System.out.println("Total vendido de Brownies: " + brownie.getStock()); // Muestra el total vendido de brownies
        System.out.println("Total recaudado en caja: $" + cajera.getCaja()); // Muestra el total recaudado en caja
    }

    // Método main para iniciar la aplicación
    public static void main(String[] args) {
        Panaderia panaderia = new Panaderia("Aaron Santos", "La Panaderia Mana"); // Crea una nueva instancia de Panaderia
        panaderia.ejecutar(); // Llama al método ejecutar para iniciar la aplicación
    }
}
