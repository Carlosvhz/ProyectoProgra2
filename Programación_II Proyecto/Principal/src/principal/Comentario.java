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
public class Comentario extends Publicacion{
    
    private String contenido;
    
    public Comentario(String contenido, Date fecha) {
       super(fecha);
       this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("YY/MM/dd");
        SimpleDateFormat formatoH = new SimpleDateFormat("HH:mm");
        return "Comentario, fecha: "+formato.format(super.getFecha())+", "+formatoH.format(super.getFecha());
    }
    
}
