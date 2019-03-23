/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

/**
 *
 * @author Nadina Mazzoni
 */
public class Tecnico {
    String nombre;
    int edad;
    String genero;
    int cantidad_computadoras;

    public Tecnico() {
    }

    public Tecnico(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
//        this.cantidad_computadoras =0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidad_computadoras() {
        return cantidad_computadoras;
    }

    public void setCantidad_computadoras(int cantidad_computadoras) {
        this.cantidad_computadoras = cantidad_computadoras;
    }
    
    public String toString()
    {
        return nombre;
    }
    
}
