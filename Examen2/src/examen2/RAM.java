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
public class RAM extends Parte{
    String tamaño;
    String marca;

    public RAM(String tamaño, String marca, int tiempo, String id) {
        super(tiempo, id);
        this.tamaño = tamaño;
        this.marca = marca;
    }


    public RAM() {
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String toString()
    {
        return super.toString();
    }
}
