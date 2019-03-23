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
public class Parte {
    int tiempo;
    String id;

    public Parte() {
    }

    public Parte(int tiempo, String id) {
        this.tiempo = tiempo;
        this.id = id;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    public String toString()
    {
        return id;
    }
    
}
