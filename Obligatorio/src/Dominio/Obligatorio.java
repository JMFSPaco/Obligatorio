/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;

/**
 *
 * @author IlPaco
 */
public class Obligatorio {

    /**
     * @param args the command line arguments
     */
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Compra> listaCompras;
    private ArrayList<GastosFijo> listaGastosFijos;
    private ArrayList<String> listaGastosMensuales;

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(ArrayList<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public ArrayList<GastosFijo> getListaGastosFijos() {
        return listaGastosFijos;
    }

    public void setListaGastosFijos(ArrayList<GastosFijo> listaGastosFijos) {
        this.listaGastosFijos = listaGastosFijos;
    }

    public ArrayList<String> getListaGastosMensuales() {
        return listaGastosMensuales;
    }

    public void setListaGastosMensuales(ArrayList<String> listaGastosMensuales) {
        this.listaGastosMensuales = listaGastosMensuales;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
