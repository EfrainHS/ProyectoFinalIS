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
public class Doctor {
    private Integer idDoctor;
    private String nombre;
    private String apellidos;
    private String genero;
    private Date fecha;
    private String domicilio;
    private String correo;
    private String password;
    private String rol;

    public Doctor() {
    }

    public Doctor(Integer idDoctor, String nombre, String apellidos, String genero, Date fecha, String domicilio, String correo, String password, String rol) {
        this.idDoctor = idDoctor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.fecha = fecha;
        this.domicilio = domicilio;
        this.correo = correo;
        this.password = password;
        this.rol = rol;
    }

    public Integer getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Integer idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
}
