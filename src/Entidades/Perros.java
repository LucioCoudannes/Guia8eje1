/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author A288808
 */
public class Perros {
    
    private String nombre;
    private String raza;
    private String apodo;
    private Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Perros(String nombre, String raza, String apodo, Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.apodo = apodo;
        this.edad = edad;
    }

    public Perros() {
    }
    
    
    
}
