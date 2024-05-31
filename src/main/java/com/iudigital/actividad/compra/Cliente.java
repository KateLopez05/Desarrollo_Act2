
package com.iudigital.actividad.compra;

import com.iudigital.actividad.modelos.ClienteProducto;
import com.iudigital.actividad.modelos.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Cliente que simula compras de distintos clientes utilizando la clase Cajera.
 */
public class Cliente {

    /**
     * Método principal para simular compras de dos clientes con diferentes productos.
     *
     * @param args Argumentos de la línea de comandos (no utilizado).
     */
    public static void main(String[] args) {

        // Lista de productos disponibles para la venta
        List<Producto> productos = new ArrayList<>();

        // Se agregan productos a la lista de productos disponibles
        setProductos(productos);

        // Creación de dos clientes con sus respectivos nombres
        ClienteProducto cliente1 = new ClienteProducto("andres Valencia");
        ClienteProducto cliente2 = new ClienteProducto("mariana martinez");

        // Agregar productos al carrito del cliente 1
        cliente1.agregarProducto(new Producto("Piña", 2000, 5));
        cliente1.agregarProducto(new Producto("cilantro", 500, 10));
        cliente1.agregarProducto(new Producto("kumis", 3500, 5));

        // Agregar productos al carrito del cliente 2
        cliente2.agregarProducto(new Producto("zanahoria", 400, 10));
        cliente2.agregarProducto(new Producto("arroz", 3700, 2));
        cliente2.agregarProducto(new Producto("sal", 2000, 10));

        // Obtener el tiempo inicial de la compra
        long tiempoInicial = System.currentTimeMillis();

        // Creación de dos cajeras
        Cajera cajera1 = new Cajera("katerin");
        Cajera cajera2 = new Cajera("vanesa");

        // Procesar compra del cliente 1 con la cajera 1
        cajera1.procesarCompra(cliente1, tiempoInicial);

        // Procesar compra del cliente 2 con la cajera 2
        cajera2.procesarCompra(cliente2, tiempoInicial);
    }

    /**
     * Agrega productos a la lista de productos disponibles.
     *
     * @param productos La lista de productos a la cual se agregarán nuevos productos.
     */
    private static void setProductos(List<Producto> productos) {
        Producto producto1 = new Producto("panes", 7000, 2);
        Producto producto2 = new Producto("mantequilla", 5000, 5);
        Producto producto3 = new Producto("lentejas", 2000, 10);

        // Agregar productos a la lista de productos disponibles
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }
    
    
}
