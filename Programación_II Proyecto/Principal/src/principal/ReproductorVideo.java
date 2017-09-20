/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.BorderLayout;
import java.awt.Component;
import java.net.URL;
import javax.media.Manager;
import javax.swing.JPanel;
import javax.media.Player;


/**
 *
 * @author carlo
 */
public class ReproductorVideo extends JPanel{
    
    public ReproductorVideo(URL urlMedios){
        setLayout(new BorderLayout());
        Manager.setHint(Manager.LIGHTWEIGHT_RENDERER, true);
        try {
            Player Reproductor = Manager.createRealizedPlayer(urlMedios);
            Component video = Reproductor.getVisualComponent();
            Component controles = Reproductor.getControlPanelComponent();
            if (video!=null) {
                add(video, BorderLayout.CENTER);
            }
            if (controles!=null) {
                add(controles, BorderLayout.SOUTH);
            }
            Reproductor.start();
        } catch (Exception e) {
            System.out.println(" ==== Reproductor de video ====");
            e.printStackTrace();
        }
    }
}
