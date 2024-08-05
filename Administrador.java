package Panaderia21; // Declara que esta clase pertenece al paquete Panaderia21

public class Administrador extends Empleado { // Define la clase Administrador, que extiende la clase Empleado

    Administrador(String nombre) { // Constructor de la clase Administrador que toma un parámetro de nombre
        this.setNombre(nombre); // Llama al método setNombre de la clase base Empleado para establecer el nombre del administrador
        System.out.println("El administrador " + this.getNombre()
                + // Imprime un mensaje en la consola indicando que el administrador está listo
                " listo para administrar"); // Completa el mensaje con el nombre del administrador
    }

    // Desarrollar los métodos definidos en el diagrama de clase del "Administrador".
    public void pedidos() { // Método público para gestionar pedidos (por implementar)
        // Implementación del método pedidos
    }

    public void altas() { // Método público para gestionar altas (por implementar)
        // Implementación del método altas
    }
}
