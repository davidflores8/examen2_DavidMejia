/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Nadina Mazzoni
 */
public class adminComputadoras {
    File archivo;
    ArrayList<Computadora>computadoras=new ArrayList();
    
    public adminComputadoras(String path) {
        archivo=new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Computadora> getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(ArrayList<Computadora> computadoras) {
        this.computadoras = computadoras;
    }
    
    public void cargarArchivo()
    {
        
    }
    
    public void escribirArchivo()
    {
        
    }
    
}
