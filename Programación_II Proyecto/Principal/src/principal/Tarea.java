/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Tarea extends Actividad{
    
    private String contenido;
    private ArrayList<String> notas = new ArrayList();

    public Tarea() {
    }
    
    
    public Tarea(String contenido, Date fecha, int minutosRecordatorio, String titulo, boolean recordar) {
        super(fecha, minutosRecordatorio, titulo, recordar);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public ArrayList<String> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<String> notas) {
        this.notas = notas;
    }

    @Override
    public void run(){
        long cont = super.getMinutosRecordatorio()*60;
        System.out.println("Cantidad de minutos: "+super.getMinutosRecordatorio());
        System.out.println("Cantidad de segundos: "+cont);
        try {
            while(cont>=0){
                System.out.println("Hilo: "+super.getTitulo()+"|| Segundo: "+cont);
                cont--;
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (isRecordar()&&isMostrar()) {
           JOptionPane.showMessageDialog(null,"Recuerde la tarea "+super.getTitulo()+" :3");
        }
    }
}
