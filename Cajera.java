package Panaderia21; // Declara que esta clase pertenece al paquete Panaderia21

import java.util.Scanner; // Importa la clase Scanner para leer datos de entrada del usuario

public class Cajera extends Empleado { // Define la clase Cajera, que extiende la clase Empleado

    private double caja; // Variable para almacenar el dinero en caja
    private int totalVendido; // Variable para almacenar el total de productos vendidos
    private int contadorFolios; // Contador para los folios

    // Constructor de la cajera
    public Cajera(String nombre) { // Constructor de la clase Cajera que toma un parámetro de nombre
        this.setNombre(nombre); // Establece el nombre de la cajera usando el método setNombre de la clase base Empleado
        System.out.println("La cajera " + this.getNombre() + " se reporta para atender..."); // Imprime un mensaje de bienvenida con el nombre de la cajera
        this.caja = 0; // Inicializa la caja en cero al inicio del día
        this.totalVendido = 0; // Inicializa el total vendido en cero
        this.contadorFolios = 1; // Inicializa el contador de folios en 1
    }

    // Método para realizar ventas de panes
    public void vender(Pan dona, Pan brownie, Cliente cliente) { // Método público para realizar ventas, tomando objetos de tipo Pan y Cliente
        Scanner scanner = new Scanner(System.in); // Crea un objeto Scanner para leer datos de entrada del usuario
        int cantidad; // Variable para almacenar la cantidad de productos solicitados
        boolean seguirVenta = true; // Bandera para controlar el bucle de ventas

        do {
            // Venta de donas
            System.out.println("¿Cuantas Donas desea comprar? (0 para terminar)"); // Solicita la cantidad de donas a comprar
            cantidad = scanner.nextInt(); // Lee la cantidad ingresada por el usuario
            if (cantidad > 0) { // Si la cantidad es mayor a 0
                dona.vender(cantidad); // Llama al método de venta en la clase Pan para donas
                totalVendido += cantidad; // Actualiza el total vendido
            } else if (cantidad == 0) { // Si la cantidad es 0
                seguirVenta = false; // Cambia la bandera para salir del bucle
                break; // Salir del bucle
            } else { // Si la cantidad es inválida (menor a 0)
                System.out.println("Cantidad inválida. Intente de nuevo."); // Imprime un mensaje de error
                continue; // Continúa el bucle solicitando la cantidad nuevamente
            }

            // Venta de brownies
            System.out.println("¿Cuantos Brownies desea comprar? (0 para terminar)"); // Solicita la cantidad de brownies a comprar
            cantidad = scanner.nextInt(); // Lee la cantidad ingresada por el usuario
            if (cantidad > 0) { // Si la cantidad es mayor a 0
                brownie.vender(cantidad); // Llama al método de venta en la clase Pan para brownies
                totalVendido += cantidad; // Actualiza el total vendido
            } else if (cantidad == 0) { // Si la cantidad es 0
                seguirVenta = false; // Cambia la bandera para salir del bucle
            } else { // Si la cantidad es inválida (menor a 0)
                System.out.println("Cantidad inválida. Intente de nuevo."); // Imprime un mensaje de error
                continue; // Continúa el bucle solicitando la cantidad nuevamente
            }

        } while (seguirVenta); // Continua el bucle mientras seguirVenta sea true

        // Calcular y registrar la venta si se compró algo
        if (totalVendido > 0) { // Si se ha vendido algún producto
            double totalVenta = calcularTotalVenta(dona, brownie); // Calcula el total de la venta llamando al método calcularTotalVenta
            Venta venta = new Venta(generarFolio(), this, cliente, dona, brownie, totalVendido, totalVenta); // Crea una instancia de Venta con los detalles de la venta
            registrarVenta(venta); // Registra la venta en el sistema llamando al método registrarVenta

            // Actualizar el dinero en caja
            caja += totalVenta; // Añade el total de la venta al dinero en caja

            // Incrementar contador de folios
            contadorFolios++; // Incrementa el contador de folios para la próxima venta
        }
    }

    // Método privado para calcular el total de la venta
    private double calcularTotalVenta(Pan dona, Pan brownie) { // Método privado para calcular el total de la venta
        return dona.getPrecio() * dona.getStock() + brownie.getPrecio() * brownie.getStock(); // Calcula el total basado en el precio y stock de donas y brownies
    }

    // Método privado para generar un folio único para cada venta
    private String generarFolio() { // Método privado para generar un folio único
        return "Folio" + contadorFolios; // Devuelve un string que representa el folio con el número del contador
    }

    // Método privado para imprimir un mensaje de registro de venta
    private void registrarVenta(Venta venta) { // Método privado para registrar una venta
        System.out.println("Venta registrada: Folio " + venta.getFolio()
                + // Imprime un mensaje con los detalles de la venta
                ", Productos vendidos: " + venta.getCantidad()
                + ", Total de la venta: $" + venta.getCaja());
    }

    // Método para realizar el corte de caja al final del día
    public void corteDeCaja() { // Método público para realizar el corte de caja
        System.out.println("Corte de caja realizado. Dinero en caja: $" + caja); // Imprime el total del dinero en caja al final del día
    }

    // Getter para obtener el total vendido
    public int getTotalVendido() { // Método público para obtener el total vendido
        return totalVendido; // Devuelve el total vendido
    }

    // Getter para obtener el dinero en caja
    public double getCaja() { // Método público para obtener el dinero en caja
        return caja; // Devuelve el dinero en caja
    }
}
