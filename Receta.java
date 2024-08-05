package Panaderia21; // Declara que esta clase pertenece al paquete Panaderia21

public class Receta { // Define la clase Receta

    // Atributos de Receta
    private String nombre; // Atributo privado para almacenar el nombre de la receta
    Insumo ingrediente; // Atributo para almacenar el ingrediente de tipo Insumo utilizado en la receta

    // Método getter para obtener el nombre de la receta
    public String getNombre() {
        return this.nombre; // Retorna el valor del atributo nombre
    }

    // Método setter para establecer el nombre de la receta
    public void setNombre(String nombre) {
        this.nombre = nombre; // Asigna el valor al atributo nombre
    }

    // Método getter para obtener el ingrediente de la receta
    public Insumo getIngrediente() {
        return this.ingrediente; // Retorna el valor del atributo ingrediente
    }

    // Método setter para establecer el ingrediente de la receta
    public void setIngrediente(Insumo ingrediente) {
        this.ingrediente = ingrediente; // Asigna el valor al atributo ingrediente
    }
}
