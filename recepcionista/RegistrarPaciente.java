/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login01.recepcionista;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Samu
 */
@Named(value = "registrarPaciente")
@SessionScoped
public class RegistrarPaciente implements Serializable {

    private String nombre;
    private String correo;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void registrarPaciente() {
        FacesContext context = FacesContext.getCurrentInstance();

        

        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, 
                "Paciente registrado con éxito", null));

        
        this.nombre = "";
        this.correo = "";
        this.telefono = "";
    }
}