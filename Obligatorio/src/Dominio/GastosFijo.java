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
public class GastosFijo {
    private String descripcion;
    private int precio;
    private String fecha;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public GastosFijo(String descripcion, int precio, String fecha) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.fecha = fecha;
    }

    public GastosFijo() {
        this.descripcion = "Sin Descripcion";
        this.precio = 0;
        this.fecha = "dd/mm/aaaa";
    }
    
    
}
