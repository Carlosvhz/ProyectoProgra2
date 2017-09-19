/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Image;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author carlo
 */
public class AlbumFotos extends Publicacion{
    
    private ArrayList<Fotografia> fotos = new ArrayList();
    private String titulo;
    
    public AlbumFotos(ArrayList fotos, Date fecha, String titulo){
        super(fecha);
        this.fotos = fotos;
        this.titulo = titulo;
    }

    public ArrayList<Fotografia> getFotos() {
        return fotos;
    }

    public void setFotos(ArrayList<Fotografia> fotos) {
        this.fotos = fotos;
    }
    
    public void setFoto(Fotografia foto){
        this.fotos.add(foto);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("YY/MM/dd");
        return "Album de fotografías "+this.titulo+", "+formato.format(super.getFecha());
    }
    
    
}
