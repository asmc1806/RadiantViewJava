/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.login01.controller;

import com.mycompany.login01.entities.Usuario;
import com.mycompany.login01.services.UsuarioFacadeLocal;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author cb00270
 */
@Named(value = "controllerUsuario")
@ViewScoped
public class controllerUsuario implements Serializable {

    Usuario usu = new Usuario();
    @EJB
    UsuarioFacadeLocal usl;

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }
    
    public List<Usuario> obtenerUsuarios(){
        try {
            return this.usl.findAll();
        } catch (Exception e) {
        }
        return null;
    }
    
    public controllerUsuario() {
    }
    
}
