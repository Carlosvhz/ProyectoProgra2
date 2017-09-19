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
public class Usuario implements Serializable{
    
    private String nombreCompleto, Contraseña, Nickname, país;
    private Date fecha;
    private ArrayList<Usuario> Amigos = new ArrayList();    
    private ArrayList<Publicacion> misPublicaciones = new ArrayList();
    private ArrayList<Actividad> misActividades = new ArrayList();
    private ArrayList<Mensaje> misMensajes = new ArrayList();
    private ArrayList<String> solicitudes = new ArrayList();
    
    public Usuario() {
    }

    public Usuario(String nombreCompleto, String Contraseña, String Nickname, String país, Date fecha) {
        this.nombreCompleto = nombreCompleto;
        this.Contraseña = Contraseña;
        this.Nickname = Nickname;
        this.país = país;
        this.fecha = fecha;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public String getPaís() {
        return país;
    }

    public void setPaís(String país) {
        this.país = país;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    // Mutadores de los ArrayList

    public ArrayList<Usuario> getAmigos() {
        return Amigos;
    }

    public void setAmigos(ArrayList<Usuario> Amigos) {
        this.Amigos = Amigos;
    }

    public void setAmigos(Usuario amigo){
        this.Amigos.add(amigo);
    }
    
    public ArrayList<Publicacion> getMisPublicaciones() {
        return misPublicaciones;
    }

    public void setMisPublicaciones(ArrayList<Publicacion> misPublicaciones) {
        this.misPublicaciones = misPublicaciones;
    }

    public void setMiPublicacion(Publicacion p){
        this.misPublicaciones.add(p);
    }
    public ArrayList<Actividad> getMisActividades() {
        return misActividades;
    }

    public void setMisActividades(ArrayList<Actividad> misActividades) {
        this.misActividades = misActividades;
    }
    
    public void setMisActividades(Actividad actividad){
        this.misActividades.add(actividad);
    }

    public ArrayList<Mensaje> getMisMensajes() {
        return misMensajes;
    }

    public void setMisMensajes(ArrayList<Mensaje> misMensajes) {
        this.misMensajes = misMensajes;
    }

    public void setMisMensajes(Mensaje mensaje){
        this.misMensajes.add(mensaje);
    }

    public ArrayList<String> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<String> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public void setSolicitudes(String nickname){
        this.solicitudes.add(nickname);
    }
    
    @Override
    public String toString() {
        return Nickname;
    }
    
}
