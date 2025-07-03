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
@Named("cajaRecepcionista")
@SessionScoped
public class CajaRecepcionista implements Serializable {

    private String paciente;
    private String monto;

    public String getPaciente() { return paciente; }
    public void setPaciente(String paciente) { this.paciente = paciente; }

    public String getMonto() { return monto; }
    public void setMonto(String monto) { this.monto = monto; }

    public void registrarPago() {
        FacesContext context = FacesContext.getCurrentInstance();
        

        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                "Pago registrado exitosamente", null));

        paciente = "";
        monto = "";
    }
}