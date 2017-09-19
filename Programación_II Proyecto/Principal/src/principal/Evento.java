/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Evento extends Actividad{
    
    private Date horaInicio, horaFinalizacion;

    public Evento() {
    }

    public Evento(Date horaInicio, Date horaFinalizacion) {
        this.horaInicio = horaInicio;
        this.horaFinalizacion = horaFinalizacion;
    }

    public Evento(Date horaInicio, Date horaFinalizacion, int minutosRecordatorio, String titulo, boolean recordar, Date fecha) {
        super(fecha, minutosRecordatorio, titulo, recordar);
        this.horaInicio = horaInicio;
        this.horaFinalizacion = horaFinalizacion;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFinalizacion() {
        return horaFinalizacion;
    }

    public void setHoraFinalizacion(Date horaFinalizacion) {
        this.horaFinalizacion = horaFinalizacion;
    }

    
    
    @Override
    public void run(){
        long cont = super.getMinutosRecordatorio()*60;
        try {
            while(cont>=0){
                cont--;
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (isRecordar()&&isMostrar()) {
            JOptionPane.showMessageDialog(null, "Recuerdo que el evento "+super.getTitulo()+"Tiene\n"
                    +"Hora de inicio: "+horaInicio.getHours()+":"+horaInicio.getMinutes()+"\n"
                    +"Hora de finalización: "+horaFinalizacion.getHours()+":"+horaFinalizacion.getMinutes());
        }
    }
    
}
