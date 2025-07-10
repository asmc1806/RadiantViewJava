/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.login01.controller;

import com.mycompany.login01.entities.Usuario;
import com.mycompany.login01.entities.UsuarioAccion;
import com.mycompany.login01.security.PasswordUtil;
import com.mycompany.login01.services.UsuarioAccionFacadeLocal;
import com.mycompany.login01.services.UsuarioFacadeLocal;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
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
    private int rol;
    private Usuario usu = new Usuario();
    private List<UsuarioAccion> UsuarioAccion;
    @EJB
    private UsuarioFacadeLocal ufl;
    @EJB
    private UsuarioAccionFacadeLocal acfl;

    public List<UsuarioAccion> getUsuarioAccion() {
        return UsuarioAccion;
    }

    public void setUsuarioAccion(List<UsuarioAccion> UsuarioAccion) {
        this.UsuarioAccion = UsuarioAccion;
    }

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

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getRolNombre() {
        switch (this.rol) {
            case 1:
                return "Administrador";
            case 2:
                return "Recepcionista";
            case 3:
                return "Paciente";
            case 4:
                return "Radiólogo";
            default:
                return "Invitado";
        }
    }

    public String iniciarSesion() {
        this.usu = this.ufl.iniciarSesion(usuario, contrasena);
        if (usu.getCorreoUsuario() != null) {
            HttpSession sesion = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            sesion.setAttribute("usuario", usuario);
            this.rol = usu.getRolIDRol();
            sesion.setAttribute("rol", this.rol);
            this.UsuarioAccion = this.acfl.Permisos(usu);
            System.out.println("ROLLLL " + usu.getRolIDRol());
            return "/views/index.xhtml?faces-redirect=true";
        } else {
            FacesContext fc = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o Contraseña  incorrectos", "MSG_INFO");
            fc.addMessage(null, fm);
            return null;
        }
    }

    public Login() {
    }

    public String cerrarSesion() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/login.xhtml?faces-redirect=true";
    }

}
