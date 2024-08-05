package Panaderia21; // Declara que esta clase pertenece al paquete Panaderia21

public class Giro { // Define la clase Giro

    private String descripcion; // Atributo privado para almacenar la descripción del giro

    // Desarrollar getters y setters de todos los atributos de "Giro".
    public void setDescripcion(String descripcion) { // Método público para establecer la descripción del giro
        this.descripcion = descripcion; // Asigna el valor del parámetro descripcion al atributo descripcion
    }

    public String getDescripcion() { // Método público para obtener la descripción del giro
        return this.descripcion; // Devuelve el valor del atributo descripcion
    }
}
