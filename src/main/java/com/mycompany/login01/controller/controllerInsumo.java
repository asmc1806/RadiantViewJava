/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.login01.controller;

import com.mycompany.login01.entities.TipoInsumos;
import com.mycompany.login01.services.TipoInsumosFacadeLocal;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author cb00270
 */
@Named(value = "controllerInsumos")
@SessionScoped
public class controllerInsumo implements Serializable {

    TipoInsumos tin = new TipoInsumos();
    @EJB
    TipoInsumosFacadeLocal Ifl;

    public TipoInsumos getIn() {
        return tin;
    }

    public void setIn(TipoInsumos in) {
        this.tin = in;
    }
    
    public List<TipoInsumos> obtenerTipoInsumos(){
        try {
            return this.Ifl.findAll();
        } catch (Exception e) {
            
        }
        return null;
    }
    
    public controllerInsumo() {
        
    }
    
    public String crearInsumoP1(){
        tin = new TipoInsumos();
        return "/views/Insumos/crearinsumo.xhtml?faces-redirect?true";
    }
    
    public void crearInsumoP2(){
        try {
            this.Ifl.create(tin);
            FacesContext fc = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO,"Insumo registrado correctamente","MSG_INFO");
            fc.addMessage(null, fm);
            tin = new TipoInsumos();
        } catch (Exception ex) {
            
        }
    }
    
    public String editarInsumoP1(TipoInsumos Tin){
        this.tin = Tin;
        return "/views/Insumos/crearinsumo.xhtml?faces-redirect?true";
    }
    
    public void editarInsumoP2(){
        try {
            this.Ifl.edit(tin);
            FacesContext fc = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO,"Insumo editado correctamente","MSG_INFO");
            fc.addMessage(null, fm);
        } catch (Exception e) {
            System.out.println("Error:" +e);
        }
    }
    
    public void eliminarInsumo(TipoInsumos Tin){
        try {
            this.Ifl.remove(Tin);
            FacesContext fc = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO,"Insumo eliminado correctamente","MSG_INFO");
            fc.addMessage(null, fm);
        } catch (Exception e) {
        }
    }
}
