/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author EfrainHS
 */
public class Cita {
    private Integer idCita;
    private Date fecha;
    private Time hora;
    private String observaciones;
    private Integer idPaciente;
    private Integer idDoctor;

    public Cita() {
    }

    public Cita(Integer idCita, Date fecha, Time hora, String observaciones, Integer idPaciente, Integer idDoctor) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.observaciones = observaciones;
        this.idPaciente = idPaciente;
        this.idDoctor = idDoctor;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Integer idDoctor) {
        this.idDoctor = idDoctor;
    }
    
    
}
