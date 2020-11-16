package com.ventas;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto;

    private Producto(){
         ++ Producto.contadorProducto;
         this.idProducto = contadorProducto;
    }

     public Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
     }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProducto() {
        return contadorProducto;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
