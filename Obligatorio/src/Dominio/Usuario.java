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
public class Usuario {
    private String nombre;
    private String contraseña;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Usuario(String nombre, String contraseña, int edad) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.edad = edad;
    }

    public Usuario() {
        nombre = "Sin/Nombre";
        contraseña = "1234";
        edad = 18;
    }

    @Override
    public String toString() {
        return "Usuario: " + " nombre: " + nombre + " contrase\u00f1a: " + contraseña + " edad: " + edad;
    }
    
    
   
    
    
}
