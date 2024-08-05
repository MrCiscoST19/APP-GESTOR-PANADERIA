package Panaderia21; // Declara que esta clase pertenece al paquete Panaderia21

public class Pedido { // Define la clase Pedido

    // Atributos de Pedido
    String folio; // Atributo para almacenar el folio del pedido
    Administrador admin; // Atributo para almacenar el administrador que maneja el pedido
    Proveedor proveedor; // Atributo para almacenar el proveedor al que se realiza el pedido
    int cantidad; // Atributo para almacenar la cantidad de productos en el pedido

    // Método getter para obtener el folio del pedido
    public String getFolio() {
        return this.folio; // Retorna el valor del atributo folio
    }

    // Método setter para establecer el folio del pedido
    public void setFolio(String folio) {
        this.folio = folio; // Asigna el valor al atributo folio
    }

    // Método getter para obtener el administrador asociado al pedido
    public Administrador getAdmin() {
        return this.admin; // Retorna el valor del atributo admin
    }

    // Método setter para establecer el administrador asociado al pedido
    public void setAdmin(Administrador admin) {
        this.admin = admin; // Asigna el valor al atributo admin
    }

    // Método getter para obtener el proveedor asociado al pedido
    public Proveedor getProveedor() {
        return this.proveedor; // Retorna el valor del atributo proveedor
    }

    // Método setter para establecer el proveedor asociado al pedido
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor; // Asigna el valor al atributo proveedor
    }

    // Método getter para obtener la cantidad de productos en el pedido
    public int getCantidad() {
        return this.cantidad; // Retorna el valor del atributo cantidad
    }

    // Método setter para establecer la cantidad de productos en el pedido
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad; // Asigna el valor al atributo cantidad
    }
}
