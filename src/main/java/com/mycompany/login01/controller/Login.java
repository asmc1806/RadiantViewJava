/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.login01.controller;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author cb00270
 */
@Named(value = "login")
@SessionScoped
public class Login implements Serializable {

    private String usuario;
    private String contrasena;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public String iniciarSesion(){
        if (usuario.equals("admin") && contrasena.equals("Clave123")) {
            HttpSession sesion = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            sesion.setAttribute("usuario", usuario);
            return "inicio.xhtml?faces-redirect=true";
        }else{
            FacesContext fc = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o Contraseña  incorrectos", "MSG_INFO");
            fc.addMessage(null, fm);
            return null;
        }
    }
    
    public Login() {
    }
}
