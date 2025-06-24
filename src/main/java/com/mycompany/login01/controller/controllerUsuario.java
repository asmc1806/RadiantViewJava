/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.login01.controller;

import com.mycompany.login01.entities.TipoRol;
import com.mycompany.login01.entities.Usuario;
import com.mycompany.login01.services.TipoRolFacadeLocal;
import com.mycompany.login01.services.UsuarioFacadeLocal;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author cb00270
 */
@Named(value = "controllerUsuario")
@SessionScoped
public class controllerUsuario implements Serializable {

    Usuario usu = new Usuario();
    TipoRol tru =  new TipoRol();
    List<SelectItem> listaTipoRol;
    @EJB
    UsuarioFacadeLocal ufl;
    @EJB
    TipoRolFacadeLocal tfl;

    public Usuario getUsu() {
        return usu;
    }

    public void setUsu(Usuario usu) {
        this.usu = usu;
    }
    
    public List<Usuario> obtenerUsuarios(){
        try {
            return this.ufl.findAll();
        } catch (Exception e) {
        }
        return null;
    }
    
    public controllerUsuario() {
    }

    public TipoRol getTru() {
        return tru;
    }

    public void setTru(TipoRol tru) {
        this.tru = tru;
    }
    
    public List<SelectItem> listaTiporol(){
        listaTipoRol = new ArrayList<>();
        try {
            for (TipoRol tru : this.tfl.findAll()) {
                SelectItem item = new SelectItem(tru.getIDTipoRol(), tru.getNombreRol());
                listaTipoRol.add(item);
            }
            return listaTipoRol;
        } catch (Exception e) {
        }
        return null;
    }
    
    public String crearUsuarioP1(){
        usu = new Usuario();
        return "/views/Usuarios/crearusuario.xhtml?faces-redirect?true";
    }
    
    public void crearUsuarioP2(){
        usu.setRolIDRol(tru.getIDTipoRol());
        try {
            this.ufl.create(usu);
            FacesContext fc = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO,"Usuario registrado correctamente","MSG_INFO");
            fc.addMessage(null, fm);
            usu = new Usuario();
        } catch (Exception e) {
        }
    }
    
    public String editarUsuarioP1(Usuario usu2){
        this.usu = usu2;
        this.tru.setIDTipoRol(usu.getRolIDRol());
        return "/views/Usuarios/crearusuario.xhtml?faces-redirect?true";
    }
    
    public void editarUsuarioP2(){
        try {
            this.usu.setRolIDRol(tru.getIDTipoRol());
            this.ufl.edit(usu);
            FacesContext fc = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO,"Usuario editado correctamente","MSG_INFO");
            fc.addMessage(null, fm);
        } catch (Exception e) {
        }
    }
    
    public void eliminarUsuario(Usuario usu2){
        try {
            this.ufl.remove(usu2);
            FacesContext fc = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO,"Usuario eliminado correctamente","MSG_INFO");
            fc.addMessage(null, fm);
        } catch (Exception e) {
        }
    }
}
