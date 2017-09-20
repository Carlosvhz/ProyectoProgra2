/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author carlo
 */
public class Publicacion implements Serializable{
 
    private ArrayList<String> comentarios = new ArrayList();
    private int likes;
    private Date fecha;
    
    public Publicacion(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }
    
    public void setComentario(String comentario){
        this.comentarios.add(comentario);
    }

    public int getLikes() {
        return likes;
    }

    public void like(){
        this.likes++;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }  

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
