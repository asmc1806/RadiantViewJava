/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.login01.controller;

import com.mycompany.login01.entities.TipoExamen;
import com.mycompany.login01.services.TipoExamenFacadeLocal;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
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
@Named(value = "controllerExamen")
@SessionScoped
public class controllerExamen implements Serializable {

    TipoExamen Tpe = new TipoExamen();
    @EJB
    TipoExamenFacadeLocal Efl;

    public TipoExamen getTpe() {
        return Tpe;
    }

    public void setTpe(TipoExamen Tpe) {
        this.Tpe = Tpe;
    }
    
    public List<TipoExamen> obtenerTipoExamen(){
        try {
            return this.Efl.findAll();
        } catch (Exception e) {
        }
        return null;
    } 
    
    public controllerExamen() {
    }
    
    public String crearExamenP1(){
        Tpe = new TipoExamen();
        return "/views/Examen/crearexamen.xhtml?faces-redirect?true";
    }
    
    public void crearExamenP2(){
        try {
            this.Efl.create(Tpe);
            FacesContext fc = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO,"Examen registrado correctamente","MSG_INFO");
            fc.addMessage(null, fm);
            Tpe = new TipoExamen();
        } catch (Exception ex) {
            
        }
    }
    
    public String editarExamenP1(TipoExamen Tpe){
        this.Tpe = Tpe;
        return "/views/Examen/crearexamen.xhtml?faces-redirect?true";
    }
    
    public void editarExamenP2(){
        try {
            this.Efl.edit(Tpe);
            FacesContext fc = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO,"Examen editado correctamente","MSG_INFO");
            fc.addMessage(null, fm);
        } catch (Exception e) {
            System.out.println("Error:" +e);
        }
    }
    
    public void eliminarExamen(TipoExamen Tpe){
        try {
            this.Efl.remove(Tpe);
            FacesContext fc = FacesContext.getCurrentInstance();
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_INFO,"Examen eliminado correctamente","MSG_INFO");
            fc.addMessage(null, fm);
        } catch (Exception e) {
        }
    }
}
