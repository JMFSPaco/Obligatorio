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
public class Producto {
    private String descripcion;
    private int cantidadMinima;
    private int cantidadActual;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    

    public Producto(String descripcion, int cantidadMinima, int cantidadActual) {
        this.descripcion = descripcion;
        this.cantidadMinima = cantidadMinima;
        this.cantidadActual = cantidadActual;
    }

    public Producto() {
        this.descripcion = "Sin Descripcion";
        this.cantidadMinima = 0;
        this.cantidadActual = 0;
    }

    @Override
    public String toString() {
        return "Producto: " + "descripcion: " + descripcion + " cantidadMinima: "
                + cantidadMinima + " cantidadActual: " + cantidadActual;
    }
    
    
    
    
}
