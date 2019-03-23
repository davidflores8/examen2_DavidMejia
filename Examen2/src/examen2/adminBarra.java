/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2;

import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nadina Mazzoni
 */
public class adminBarra extends Thread{
    JProgressBar barra;
    Computadora computadora;
    boolean vive;
    boolean avanzar;
    int total;
    String turno;
    boolean centinela;
    JTable tabla;

    public adminBarra(JProgressBar barra, Computadora computadora, JTable tabla) {
        this.barra = barra;
        this.computadora = computadora;
        this.vive=true;
        this.avanzar=true;
        this.turno="ram";
        this.centinela=true;
        this.tabla=tabla;
    }

    public boolean isCentinela() {
        return centinela;
    }

    public void setCentinela(boolean centinela) {
        this.centinela = centinela;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
   
    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvazar(boolean avanzar) {
        this.avanzar = avanzar;
    }
    
    public void run()
    {
        barra.setMaximum(computadora.getRam().getTiempo());
        while(vive)
        {
           centinela=true;
            if (avanzar)
            {
               if(turno.equalsIgnoreCase("ram"))
               {
                   barra.setValue(barra.getValue()+1);
                   barra.setString("Ensamblando RAM");
                   if(barra.getValue()==computadora.getRam().getTiempo())
                   {
                       barra.setValue(0);
                       turno="disco duro";
                       barra.setMaximum(computadora.getDisco_duro().getTiempo());
                       centinela=false;
                       Tabla();
                   }
               }
               else if(turno.equalsIgnoreCase("disco duro"))
               {
                   barra.setValue(barra.getValue()+1);
                   barra.setString("Disco duro");
                   if(barra.getValue()==computadora.getDisco_duro().getTiempo())
                   {
                       barra.setValue(0);
                       turno="bateria";
                       barra.setMaximum(computadora.getBateria().getTiempo());
                       centinela=false;
                       Tabla();
                   }
               }
               else if(turno.equalsIgnoreCase("bateria"))
               {
                   barra.setValue(barra.getValue()+1);
                   barra.setString("Ensamblando Bateria");
                   if(barra.getValue()==computadora.getBateria().getTiempo())
                   {
                       barra.setValue(0);
                       turno="teclado";
                       barra.setMaximum(computadora.getTeclado().getTiempo());
                       centinela=false;
                       Tabla();
                   }
               }
               else if(turno.equalsIgnoreCase("teclado"))
               {
                   barra.setValue(barra.getValue()+1);
                   barra.setString("Ensamblando Teclado");
                   if(barra.getValue()==computadora.getTeclado().getTiempo())
                   {
                       barra.setValue(0);
                       turno="pantalla";
                       barra.setMaximum(computadora.getPantalla().getTiempo());
                       centinela=false;
                       Tabla();
                   }
               }
               else if(turno.equalsIgnoreCase("pantalla"))
               {
                   barra.setValue(barra.getValue()+1);
                   barra.setString("Ensamblando Pantalla");
                   if(barra.getValue()==computadora.getPantalla().getTiempo())
                   {
                       barra.setValue(0);
                       turno="procesador";
                       barra.setMaximum(computadora.getProcesador().getTiempo());
                       centinela=false;
                       Tabla();
                   }
               }
               else if(turno.equalsIgnoreCase("procesador"))
               {
                   barra.setValue(barra.getValue()+1);
                   barra.setString("Ensamblando Procesador");
                   if(barra.getValue()==computadora.getProcesador().getTiempo())
                   {
                       barra.setValue(0);
                       turno="";
                       centinela=false;
                       Tabla();
                       
                   }
               }
              centinela=true; 
            }
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
            
        }
    }
    
    public void Tabla()
    {
        DefaultTableModel modelo=(DefaultTableModel)tabla.getModel();
        if(turno.equals("disco duro") && centinela==false)
        {
            Object[]newrow={computadora.getRam(), computadora.getRam().getTiempo()};
            modelo.addRow(newrow);
            tabla.setModel(modelo);
        }
       else if(turno.equals("bateria") && centinela==false)
        {
            Object[]newrow={computadora.getDisco_duro(), computadora.getDisco_duro().getTiempo()};
            modelo.addRow(newrow);
            tabla.setModel(modelo);
        }
        else if(turno.equals("teclado") && centinela==false)
        {
            Object[]newrow={computadora.getBateria(), computadora.getBateria().getTiempo()};
            modelo.addRow(newrow);
            tabla.setModel(modelo);
        }
        else if(turno.equals("pantalla") && centinela==false)
        {
            Object[]newrow={computadora.getTeclado(), computadora.getTeclado().getTiempo()};
            modelo.addRow(newrow);
            tabla.setModel(modelo);
        }
        else if(turno.equals("procesador") && centinela==false)
        {
            Object[]newrow={computadora.getPantalla(), computadora.getPantalla().getTiempo()};
            modelo.addRow(newrow);
            tabla.setModel(modelo);
        }
        else if(turno.equals("") && centinela==false)
        {
            Object[]newrow={computadora.getProcesador(), computadora.getProcesador().getTiempo()};
            modelo.addRow(newrow);
            tabla.setModel(modelo);
        }
        else
        {
            
        }
        
    }
    
    
    
    
    
    
}
