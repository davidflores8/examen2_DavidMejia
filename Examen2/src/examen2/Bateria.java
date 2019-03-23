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
public class Bateria extends Parte{
    int capacidad_horas;
    String material;
            
    public Bateria() {
    }

    public Bateria(int capacidad_horas, String material, int tiempo, String id) {
        super(tiempo, id);
        this.capacidad_horas = capacidad_horas;
        this.material = material;
    }

    public int getCapacidad_horas() {
        return capacidad_horas;
    }

    public void setCapacidad_horas(int capacidad_horas) {
        this.capacidad_horas = capacidad_horas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public String toString()
    {
        return super.toString();
    }
    
    
    
    
    
}
