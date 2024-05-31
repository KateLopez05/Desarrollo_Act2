package com.iudigital.actividad.hilos;

import com.iudigital.actividad.modelos.ClienteProducto;
import com.iudigital.actividad.modelos.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase ClienteThread que simula compras de diferentes clientes utilizando hilos (threads) para procesar las compras.
 */
public class ClienteThread {

    /**
     * Método principal que simula compras de dos clientes con diferentes productos utilizando hilos separados.
     *
     * @param args Argumentos de la línea de comandos (no utilizado).
     */
    public static void main(String[] args) {

        // Lista de productos disponibles para la venta
        List<Producto> productos = new ArrayList<>();

        // Se agregan productos a la lista de productos disponibles
        setProductos(productos);

        // Creación de dos clientes con sus respectivos nombres
        ClienteProducto cliente1 = new ClienteProducto("orlando perez");
        ClienteProducto cliente2 = new ClienteProducto("jose jose");

        // Agregar productos al carrito del cliente 1
        cliente1.agregarProducto(new Producto("carne", 10000, 3));
        cliente1.agregarProducto(new Producto("harina", 1000, 10));
        cliente1.agregarProducto(new Producto("Azucar", 2500, 10));

        // Agregar productos al carrito del cliente 2
        cliente2.agregarProducto(new Producto("frijoles", 5000, 4));
        cliente2.agregarProducto(new Producto("maiz", 3800, 5));
        cliente2.agregarProducto(new Producto("Arepas", 1600, 10));

        // Obtener el tiempo inicial de la compra
        long tiempoInicial = System.currentTimeMillis();

        // Creación de dos hilos (CajeraThread) para procesar las compras de los clientes
        CajeraThread cajera1 = new CajeraThread("Katherin", cliente1, tiempoInicial);
        CajeraThread cajera2 = new CajeraThread("Vanesa", cliente2, tiempoInicial);

        // Iniciar los hilos para procesar las compras
        cajera1.start();
        cajera2.start();
    }

    /**
     * Agrega productos a la lista de productos disponibles.
     *
     * @param productos La lista de productos a la cual se agregarán nuevos productos.
     */
    private static void setProductos(List<Producto> productos) {
        // Agregar productos a la lista de productos disponibles
        Producto producto1 = new Producto("piña", 1200, 10);
        Producto producto2 = new Producto("durazno", 400, 12);
        Producto producto3 = new Producto("limones", 2500, 4);

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }
}
