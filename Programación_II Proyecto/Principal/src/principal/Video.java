/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author carlo
 */
public class Video extends Publicacion{
    
    private URL url;
    
    public Video(URL url, Date fecha){
        super(fecha);
        this.url = url;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    @Override
    public String toString() {
        SimpleDateFormat formato = new SimpleDateFormat("YY/MM/dd");
        return "Video, publicada el "+super.getFecha();
    }

}
