package com.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    public static final int MAX_PRODUCTOS = 10;
    private int contadorProducto;

    public Orden(){
        ++ Orden.contadorOrdenes;
        this.idOrden = contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if (this.contadorProducto < Orden.MAX_PRODUCTOS){
        productos[this.contadorProducto ++] = producto;
        } else {
            System.out.println("No es posible agregar más productos a esta orden");
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProducto; i++) {
                total += this.productos[i].getPrecio();
        }
        return  total;
    }

    public void mostratOrden(){
        System.out.println("Id de la Orden: " + this.idOrden);
        System.out.println("Productos: ");
        for (int i = 0; i < this.contadorProducto; i++) {
                System.out.println(this.productos[i].toString());
        }
        System.out.println("El total es:");
        System.out.println("$ " + calcularTotal());

    }

}
