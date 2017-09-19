/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.*;
import java.io.*;
/**
 *
 * @author carlo
 */
public class AdministradorUsuarios {
    private Usuario usuario;
    private File archivo;

    public AdministradorUsuarios(){
    }
    
    public AdministradorUsuarios(Usuario usuario){
        this.usuario = usuario;
        this.archivo = new File ("./Usuarios");
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    // Modificar metodo
    public ArrayList cargarUsuarios() throws IOException{
        File archivo = new File("./Usuarios");
        ArrayList<Usuario> retornar = new ArrayList();
        File [] usuarios = archivo.listFiles();
        if (usuarios.length==0) {
            return retornar;
        }else{
            FileInputStream fi=null;
            ObjectInputStream ob=null;
            try {
                for (File u : usuarios) {
                    fi = new FileInputStream(u);
                    ob = new ObjectInputStream(fi);
                    retornar.add((Usuario)ob.readObject());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            fi.close();
            ob.close();
            }
        return retornar;
    }
    
    
        //Crea directorio del usuario
    public void crearDirectorioArchivo(){
        try {
            FileOutputStream salida = new FileOutputStream(archivo.getPath()+"/"+usuario.getNickname()+".txt");
            ObjectOutputStream op = new ObjectOutputStream(salida);
            op.writeObject(usuario);
            op.flush();
            op.close();
            salida.close();
        } catch (Exception e) {
        }
    }

    public void escribirUsuario(){
        FileOutputStream fo = null;
        ObjectOutputStream ob = null;
        try {
            fo = new FileOutputStream(archivo.getPath()+"/"+usuario.getNickname()+".txt", false);
            ob = new ObjectOutputStream(fo);
            ob.writeObject(usuario);
            ob.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            ob.close();
            fo.close();
        } catch (Exception e) {
        }
    }
}
