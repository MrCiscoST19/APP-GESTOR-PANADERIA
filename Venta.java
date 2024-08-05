package Panaderia21; // Declara que esta clase pertenece al paquete Panaderia21

public class Venta { // Define la clase Venta

    // Atributos de Venta
    private String folio; // Atributo privado para almacenar el folio de la venta
    private Cajera vendedor; // Atributo privado para almacenar el cajero que realizó la venta
    private Cliente comprador; // Atributo privado para almacenar el cliente que compró
    private Pan dona; // Atributo privado para almacenar el objeto de tipo Pan correspondiente a las donas
    private Pan brownie; // Atributo privado para almacenar el objeto de tipo Pan correspondiente a los brownies
    private int cantidad; // Atributo privado para almacenar la cantidad de pan vendido
    public double caja; // Atributo público para almacenar el dinero total recaudado

    // Constructor de Venta
    public Venta(String folio, Cajera vendedor, Cliente comprador, Pan dona, Pan brownie, int cantidad, double caja) {
        this.folio = folio; // Inicializa el atributo folio
        this.vendedor = vendedor; // Inicializa el atributo vendedor
        this.comprador = comprador; // Inicializa el atributo comprador
        this.dona = dona; // Inicializa el atributo dona
        this.brownie = brownie; // Inicializa el atributo brownie
        this.cantidad = cantidad; // Inicializa el atributo cantidad
        this.caja = caja; // Inicializa el atributo caja
    }

    // Getter para obtener el folio de la venta
    public String getFolio() {
        return this.folio; // Retorna el valor del atributo folio
    }

    // Setter para establecer el folio de la venta
    public void setFolio(String folio) {
        this.folio = folio; // Asigna el valor al atributo folio
    }

    // Getter para obtener el cajero que realizó la venta
    public Cajera getVendedor() {
        return this.vendedor; // Retorna el valor del atributo vendedor
    }

    // Setter para establecer el cajero que realizó la venta
    public void setVendedor(Cajera vendedor) {
        this.vendedor = vendedor; // Asigna el valor al atributo vendedor
    }

    // Getter para obtener el cliente que compró
    public Cliente getComprador() {
        return this.comprador; // Retorna el valor del atributo comprador
    }

    // Setter para establecer el cliente que compró
    public void setComprador(Cliente comprador) {
        this.comprador = comprador; // Asigna el valor al atributo comprador
    }

    // Getter para obtener el objeto Pan correspondiente a las donas
    public Pan getDona() {
        return this.dona; // Retorna el valor del atributo dona
    }

    // Setter para establecer el objeto Pan correspondiente a las donas
    public void setDona(Pan dona) {
        this.dona = dona; // Asigna el valor al atributo dona
    }

    // Getter para obtener el objeto Pan correspondiente a los brownies
    public Pan getBrownie() {
        return this.brownie; // Retorna el valor del atributo brownie
    }

    // Setter para establecer el objeto Pan correspondiente a los brownies
    public void setBrownie(Pan brownie) {
        this.brownie = brownie; // Asigna el valor al atributo brownie
    }

    // Getter para obtener la cantidad de pan vendido
    public int getCantidad() {
        return this.cantidad; // Retorna el valor del atributo cantidad
    }

    // Setter para establecer la cantidad de pan vendido
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad; // Asigna el valor al atributo cantidad
    }

    // Getter para obtener el dinero total recaudado
    public double getCaja() {
        return this.caja; // Retorna el valor del atributo caja
    }

    // Setter para establecer el dinero total recaudado
    public void setCaja(double caja) {
        this.caja = caja; // Asigna el valor al atributo caja
    }
}
