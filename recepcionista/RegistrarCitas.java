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
public class RegistrarCitas implements Serializable {

    private String paciente;
    private String fecha;
    private String motivo;

    
    public String getPaciente() { return paciente; }
    public void setPaciente(String paciente) { this.paciente = paciente; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public void registrarCita() {
        FacesContext context = FacesContext.getCurrentInstance();

        

        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                "Cita registrada exitosamente", null));

        
        this.paciente = "";
        this.fecha = "";
        this.motivo = "";
    }
}