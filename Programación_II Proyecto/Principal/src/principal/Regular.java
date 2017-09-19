/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author carlo
 */
public class Regular extends Usuario{

    public Regular() {
    }

    public Regular(String nombreCompleto, String Contraseña, String Nickname, String país, Date fecha) {
        super(nombreCompleto, Contraseña, Nickname, país, fecha);
    }
    
}
