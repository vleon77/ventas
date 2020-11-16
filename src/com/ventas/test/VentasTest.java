package com.ventas.test;

import com.ventas.Orden;
import com.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Orden orden1 = new Orden();
        Producto producto1 = new Producto("teclado", 100);
        Producto producto2 = new Producto("Monitor", 300);
        Producto producto3 = new Producto("Mouse", 75);
        Producto producto4 = new Producto("Cascos", 50);

        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);

        orden1.mostratOrden();

    }
}
