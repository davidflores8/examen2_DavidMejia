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
public class Pantalla extends Parte{
    String tactil;
    String tipo;

    public Pantalla() {
    }

    public Pantalla(String tactil, String tipo, int tiempo, String id) {
        super(tiempo, id);
        this.tactil = tactil;
        this.tipo = tipo;
    }

    public String getTactil() {
        return tactil;
    }

    public void setTactil(String tactil) {
        this.tactil = tactil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String toString()
    {
        return super.toString();
    }
    
}
