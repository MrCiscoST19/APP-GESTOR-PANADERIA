package Panaderia21; // Declara que esta clase pertenece al paquete Panaderia21

public class Insumo { // Define la clase Insumo

    // Atributos de Insumo
    private String nombre; // Atributo privado para almacenar el nombre del insumo
    private int stock; // Atributo privado para almacenar la cantidad de stock del insumo

    // Desarrollar getters y setters de todos los atributos de "Insumo".
    public String getNombre() { // Método público para obtener el nombre del insumo
        return this.nombre; // Devuelve el valor del atributo nombre
    }

    public void setNombre(String nombre) { // Método público para establecer el nombre del insumo
        this.nombre = nombre; // Asigna el valor del parámetro nombre al atributo nombre
    }

    public int getStock() { // Método público para obtener el stock del insumo
        return this.stock; // Devuelve el valor del atributo stock
    }

    public void setStock(int stock) { // Método público para establecer el stock del insumo
        this.stock = stock; // Asigna el valor del parámetro stock al atributo stock
    }
}
