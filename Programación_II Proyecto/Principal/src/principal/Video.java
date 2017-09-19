/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.BorderLayout;
import java.awt.Component;
import java.io.File;
import java.net.URL;
import java.util.Date;
import javax.media.Manager;
import javax.media.Player;
import javax.swing.JPanel;

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
    
    
    public void Componente (URL urlMedios){
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        Manager.setHint(Manager.LIGHTWEIGHT_RENDERER, true);
        try {
            Player reproductor = Manager.createRealizedPlayer(urlMedios);
            Component video = reproductor.getVisualComponent();
            Component controles = reproductor.getControlPanelComponent();
            if (video!=null) {
                panel.add(video, BorderLayout.CENTER);
            }
            if (controles!=null) {
                panel.add(controles, BorderLayout.SOUTH);
            }
            reproductor.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
