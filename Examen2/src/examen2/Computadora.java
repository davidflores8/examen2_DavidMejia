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
public class Computadora {
    String serie;
    int año;
    String color;
    RAM ram;
    Disco_duro disco_duro;
    Bateria bateria;
    Teclado teclado;
    Pantalla pantalla;
    Procesador procesador;

    public Computadora() {
    }

    
    public Computadora(String serie, int año, String color) {
        this.serie = serie;
        this.año = año;
        this.color = color;
    }

    public Computadora(String serie, int año, String color, RAM ram, Disco_duro disco_duro, Bateria bateria, Teclado teclado, Pantalla pantalla, Procesador procesador) {
        this.serie = serie;
        this.año = año;
        this.color = color;
        this.ram = ram;
        this.disco_duro = disco_duro;
        this.bateria = bateria;
        this.teclado = teclado;
        this.pantalla = pantalla;
        this.procesador = procesador;
    }
    
    

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Disco_duro getDisco_duro() {
        return disco_duro;
    }

    public void setDisco_duro(Disco_duro disco_duro) {
        this.disco_duro = disco_duro;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }
    

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString()
    {
        return serie;
    }
    
    
}
