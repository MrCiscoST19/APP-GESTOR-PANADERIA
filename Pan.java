package Panaderia21; // Declara que esta clase pertenece al paquete Panaderia21

public class Pan { // Define la clase Pan

    private String nombre; // Atributo privado para almacenar el nombre del pan
    private float precio; // Atributo privado para almacenar el precio del pan
    private int stock; // Atributo privado para almacenar la cantidad en stock del pan

    // Constructor de la clase Pan
    public Pan(String nombre, float precio) {
        this.nombre = nombre; // Asigna el valor del parámetro nombre al atributo nombre
        this.precio = precio; // Asigna el valor del parámetro precio al atributo precio
        this.stock = 0; // Inicializa el atributo stock en 0, indicando que inicialmente no hay pan disponible
    }

    // Método para obtener el nombre del pan
    public String getNombre() {
        return nombre; // Devuelve el valor del atributo nombre
    }

    // Método para obtener el precio del pan
    public float getPrecio() {
        return precio; // Devuelve el valor del atributo precio
    }

    // Método para obtener la cantidad en stock del pan
    public int getStock() {
        return stock; // Devuelve el valor del atributo stock
    }

    // Método para hornear una cantidad determinada de pan
    public void hornear(int cantidad) {
        stock += cantidad; // Incrementa el atributo stock por la cantidad especificada
    }

    // Método para vender una cantidad determinada de pan
    public void vender(int cantidad) {
        if (stock >= cantidad) { // Verifica si hay suficiente pan en stock
            stock -= cantidad; // Decrementa el atributo stock por la cantidad vendida
        } else {
            // Mensaje en caso de que no haya suficiente pan en stock
            System.out.println("No hay suficientes " + nombre + " en inventario.");
        }
    }
}
