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

@Named("novedadesRecepcionista")
@SessionScoped
public class NovedadesRecepcionista implements Serializable {

    private String titulo;
    private String descripcion;

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public void registrarNovedad() {
        FacesContext context = FacesContext.getCurrentInstance();
        

        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                "Novedad registrada exitosamente", null));

        titulo = "";
        descripcion = "";
    }
}