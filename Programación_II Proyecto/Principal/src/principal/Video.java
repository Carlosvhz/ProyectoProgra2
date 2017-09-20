/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import java.io.File;
import java.util.Date;


/**
 *
 * @author carlo
 */
public class Video extends Publicacion{
    
    private File archivo;
    
    public Video(File archivo, Date fecha){
        super(fecha);
        this.archivo = archivo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
}
