/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author IlPaco
 */
public class Compra {
    private Producto producto;
    private int cantidad;
    private int precio;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Compra(Producto producto, int cantidad, int precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Compra() {
        this.producto = new Producto("Sin Descripcion", 0, 0);
        this.cantidad = 1;
        this.precio = 0;
    }

    @Override
    public String toString() {
        return "Compra: " + "producto: " + producto + " cantidad: " + cantidad + " precio: " + precio;
    }
    
    
    
}
