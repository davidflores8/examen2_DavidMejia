/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nadina Mazzoni
 */
public class adminTecnico {
    File archivo;
    ArrayList<Tecnico>tecnicos;

    public adminTecnico(String path) {
        archivo=new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Tecnico> getTecnicos() {
        return tecnicos;
    }

    public void setTecnicos(ArrayList<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }
    
     public void escribirArchivo() throws IOException
    {
        FileWriter fw=null; 
        BufferedWriter bw=null;
        try
        {
            fw=new FileWriter(archivo, true);
            bw =new BufferedWriter(fw);
            for (Tecnico t:tecnicos)
            {
                bw.write(t.getNombre()+";");
                bw.write(t.getEdad()+";");
                bw.write(t.getGenero()+";");
//                bw.newLine();
            }
            bw.flush();
        }
        catch(Exception e)
        {
            bw.close();
            fw.close();
            e.printStackTrace();
        }
    }
    
         public void cargarArchivo() throws FileNotFoundException
    {
        Scanner sc=null;
        tecnicos=new ArrayList();
        if (archivo.exists())
        {
            try
            {
                sc=new Scanner (archivo);
                sc.useDelimiter(";");
                while(sc.hasNext())
                {
                    tecnicos.add(new Tecnico(sc.next(), sc.nextInt(),sc.next()));
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    
    
    
    
}
