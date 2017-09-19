/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author carlo
 */
public class Mensaje implements Serializable {

    private String emisor, contenido;
    private boolean estado;
    private Date fecha;

    public Mensaje(String emisor, Date fecha, String contenido) {
        this.emisor = emisor;
        this.estado = false;
        this.fecha = fecha;
        this.contenido = contenido;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        String simbolo = "";
        if (!estado) {
            simbolo = "¡NEW!";
        }
        return "Mensaje de: "+emisor+" | Fecha: "+fecha+"  "+simbolo;
    } 
}
