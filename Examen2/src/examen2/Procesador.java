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
public class Procesador extends Parte{
    int nucleos;
    int velocidad;

    public Procesador() {
    }

    public Procesador(int nucleos, int velocidad, int tiempo, String id) {
        super(tiempo, id);
        this.nucleos = nucleos;
        this.velocidad = velocidad;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public String toString()
    {
        return super.toString();
    }
    
    
}
