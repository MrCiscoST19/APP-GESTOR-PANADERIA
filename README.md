# APP-SISTEME-GESTION-PANADERIA
Este proyecto es un sistema integral de gestión para una panadería, diseñado para facilitar la administración de la producción, venta y control de inventarios de productos de panadería. Aquí están los detalles de cada componente:

1. **Clases Principales**:
   - **`Pan`**: Representa los productos de panadería, como donas y brownies. Incluye métodos para hornear y vender productos, así como para gestionar el stock disponible.
   - **`Empleado`**: Clase base para los empleados, con un atributo de nombre y métodos para obtener y establecer este nombre.
   - **`Cajera`**: Especialización de `Empleado` encargada de realizar ventas y manejar la caja. Incluye métodos para vender productos, calcular el total de la venta, generar folios de venta y realizar el corte de caja.
   - **`Panadero`**: Otro tipo de `Empleado`, responsable de hornear productos. Incluye métodos para manejar el proceso de horneado de donas y brownies.
   - **`Administrador`**: Hereda de `Empleado` y está encargado de la administración general. Incluye métodos para gestionar pedidos y altas, aunque estos métodos aún están por implementar.

2. **Otras Clases**:
   - **`Cliente`**: Representa al cliente que compra productos. Incluye métodos relacionados con la compra.
   - **`Venta`**: Registra los detalles de una transacción de venta, incluyendo el folio, el vendedor, el comprador, los productos vendidos, la cantidad y el total recaudado.
   - **`Pedido`**: Representa un pedido realizado a un proveedor. Incluye atributos como folio, administrador asociado, proveedor y cantidad.
   - **`Proveedor`**: Representa al proveedor de insumos, con atributos como nombre, teléfono y giro del negocio.
   - **`Giro`**: Describe el tipo de giro del proveedor.
   - **`Insumo`**: Representa los ingredientes utilizados en la panadería, con atributos como nombre y stock disponible.
   - **`Receta`**: Contiene la receta de un producto, incluyendo el nombre de la receta y los ingredientes necesarios.

3. **Funcionalidades del Sistema**:
   - **Horneado de Productos**: Permite al panadero hornear diferentes tipos de pan y gestionar el inventario de estos productos.
   - **Venta de Productos**: La cajera puede vender productos a los clientes, actualizar el inventario y registrar las ventas. Se gestiona el dinero en caja y se emiten folios de venta.
   - **Administración y Control**: El administrador gestiona pedidos, altas y otras funciones de administración. Aunque algunos métodos de administración están por implementar, el sistema en su conjunto permite una visión integral del manejo de la panadería.
   - **Estadísticas y Reportes**: Ofrece funciones para mostrar estadísticas sobre las ventas realizadas, productos en stock y el dinero recaudado en caja.

4. **Interacción del Usuario**:
   - **Menú de Opciones**: Los usuarios pueden interactuar con el sistema a través de un menú que permite elegir entre hornear productos, vender productos, realizar el corte de caja y salir del programa.
   - **Proceso de Venta**: La cajera puede registrar ventas, calcular el total de la venta, y realizar un corte de caja al final del día para verificar el dinero en caja.

En resumen, el proyecto proporciona una solución completa para la gestión de una panadería, facilitando la administración del inventario, la venta de productos y el control financiero.
