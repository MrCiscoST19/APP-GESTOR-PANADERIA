package Panaderia21; // Declara que esta clase pertenece al paquete Panaderia21

public class Empleado { // Define la clase Empleado
    // Atributos del empleado

    public String nombre; // Atributo público para almacenar el nombre del empleado

    // Desarrollar getters y setters de todos los atributos de "Empleado".
    public void setNombre(String nombre) { // Método público para establecer el nombre del empleado
        this.nombre = nombre; // Asigna el valor del parámetro nombre al atributo nombre
    }

    public String getNombre() { // Método público para obtener el nombre del empleado
        return this.nombre; // Devuelve el valor del atributo nombre
    }
}
