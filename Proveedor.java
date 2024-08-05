package Panaderia21; // Declara que esta clase pertenece al paquete Panaderia21

public class Proveedor { // Define la clase Proveedor

    // Atributos de Proveedor
    private String nombre; // Atributo para almacenar el nombre del proveedor
    private String telefono = "9845374567"; // Atributo para almacenar el teléfono del proveedor, con un valor por defecto
    public Giro giro; // Atributo para almacenar la instancia de Giro relacionada con el proveedor

    // Método getter para obtener el nombre del proveedor
    public String getNombre() {
        return this.nombre; // Retorna el valor del atributo nombre
    }

    // Método setter para establecer el nombre del proveedor
    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna el valor al atributo nombre
    }

    // Método getter para obtener el teléfono del proveedor
    public String getTelefono() {
        return this.telefono; // Retorna el valor del atributo telefono
    }

    // Método setter para establecer el teléfono del proveedor
    public void setTelefono(String telefono) {
        this.telefono = telefono; // Asigna el valor al atributo telefono
    }

    // Método getter para obtener el Giro del proveedor
    public Giro getGiro() {
        return this.giro; // Retorna el valor del atributo giro
    }

    // Método setter para establecer el Giro del proveedor
    public void setGiro(Giro giro) {
        this.giro = giro; // Asigna el valor al atributo giro
    }
}
