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
public class Orden {
    Computadora computadora;
    Tecnico tecnico;
    String id;

    public Orden() {
    }

    public Orden(Computadora computadora, Tecnico tecnico) {
        this.computadora = computadora;
        this.tecnico = tecnico;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
    
    public String toString()
    {
        return id;
    }
    
}
