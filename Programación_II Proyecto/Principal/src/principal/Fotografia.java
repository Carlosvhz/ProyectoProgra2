/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author carlo
 */
public class Fotografia extends Publicacion{
    
    private ImageIcon fotografia;

    public Fotografia(ImageIcon fotografia, Date fecha) {
        super(fecha);
        this.fotografia = fotografia;
    }

    public ImageIcon getFotografia() {
        return fotografia;
    }

    public void setFotografia(ImageIcon fotografia) {
        this.fotografia = fotografia;
    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("YY/MM/dd");
        SimpleDateFormat hora = new SimpleDateFormat("HH:mm");
        return "Fotrografía "+formato.format(super.getFecha())+", "+hora.format(super.getFecha());
    }
    
    
}
