/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.sql.Date;

/**
 *
 * @author EfrainHS
 */
public class Dieta {
    private Integer idDieta;
    private String nombre;
    private String calorias;
    private Date fecha;

    public Dieta() {
    }

    public Dieta(Integer idDieta, String nombre, String calorias, Date fecha) {
        this.idDieta = idDieta;
        this.nombre = nombre;
        this.calorias = calorias;
        this.fecha = fecha;
    }

    public Integer getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(Integer idDieta) {
        this.idDieta = idDieta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalorias() {
        return calorias;
    }

    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
