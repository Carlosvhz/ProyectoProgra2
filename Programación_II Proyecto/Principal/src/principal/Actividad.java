/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.Serializable;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Actividad extends Thread implements Serializable{
    
    private int minutosRecordatorio;
    private String titulo;
    private Date fecha;
    private boolean recordar, mostrar;
    
    public Actividad() {
    }

    public Actividad(Date Fecha, int minutosRecordatorio, String titulo, boolean recordar) {
        this.minutosRecordatorio = minutosRecordatorio;
        this.titulo = titulo;
        this.recordar = recordar;
        this.mostrar = true;
        this.fecha = Fecha;
    }

    public boolean isRecordar() {
        return recordar;
    }

    public void setRecordar(boolean recordar) {
        this.recordar = recordar;
    }

    public int getMinutosRecordatorio() {
        return minutosRecordatorio;
    }

    public void setMinutosRecordatorio(int minutosRecordatorio) {
        this.minutosRecordatorio = minutosRecordatorio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isMostrar() {
        return mostrar;
    }

    public void setMostrar(boolean mostrar) {
        this.mostrar = mostrar;
    }
}
