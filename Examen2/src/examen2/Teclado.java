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
public class Teclado extends Parte{
    String material;
    String color;

    public Teclado() {
    }

    public Teclado(String material, String color, int tiempo, String id) {
        super(tiempo, id);
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String toString()
    {
        return super.toString();
    }
}
