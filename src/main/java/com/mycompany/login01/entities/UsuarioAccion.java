/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login01.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cb00270
 */
@Entity
@Table(name = "usuario_accion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioAccion.findAll", query = "SELECT u FROM UsuarioAccion u"),
    @NamedQuery(name = "UsuarioAccion.findByIDUsuarioAccion", query = "SELECT u FROM UsuarioAccion u WHERE u.iDUsuarioAccion = :iDUsuarioAccion")})
public class UsuarioAccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Usuario_Accion")
    private Integer iDUsuarioAccion;
    @JoinColumn(name = "Accion_ID_Accion", referencedColumnName = "ID_Accion")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TipoAccion accionIDAccion;
    @JoinColumn(name = "Usuario_ID_Usuario", referencedColumnName = "ID_Tipo_Rol")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TipoRol usuarioIDUsuario;

    public UsuarioAccion() {
    }

    public UsuarioAccion(Integer iDUsuarioAccion) {
        this.iDUsuarioAccion = iDUsuarioAccion;
    }

    public Integer getIDUsuarioAccion() {
        return iDUsuarioAccion;
    }

    public void setIDUsuarioAccion(Integer iDUsuarioAccion) {
        this.iDUsuarioAccion = iDUsuarioAccion;
    }

    public TipoAccion getAccionIDAccion() {
        return accionIDAccion;
    }

    public void setAccionIDAccion(TipoAccion accionIDAccion) {
        this.accionIDAccion = accionIDAccion;
    }

    public TipoRol getUsuarioIDUsuario() {
        return usuarioIDUsuario;
    }

    public void setUsuarioIDUsuario(TipoRol usuarioIDUsuario) {
        this.usuarioIDUsuario = usuarioIDUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDUsuarioAccion != null ? iDUsuarioAccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioAccion)) {
            return false;
        }
        UsuarioAccion other = (UsuarioAccion) object;
        if ((this.iDUsuarioAccion == null && other.iDUsuarioAccion != null) || (this.iDUsuarioAccion != null && !this.iDUsuarioAccion.equals(other.iDUsuarioAccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.login01.entities.UsuarioAccion[ iDUsuarioAccion=" + iDUsuarioAccion + " ]";
    }

    public List<UsuarioAccion> Permisos(Usuario usu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
