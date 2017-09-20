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
public class PublicacionCompartida extends Publicacion implements Serializable {
 
    private Publicacion publicacion;

    public PublicacionCompartida(Publicacion publicacion, Date fecha) {
        super(fecha);
        this.publicacion = publicacion;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("YY/MM/dd");
        return "Publicacion Compartida, publicada el "+formato.format(super.getFecha());
    }
}
