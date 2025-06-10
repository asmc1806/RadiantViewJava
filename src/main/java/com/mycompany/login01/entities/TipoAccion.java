/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login01.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author cb00270
 */
@Entity
@Table(name = "tipo_accion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoAccion.findAll", query = "SELECT t FROM TipoAccion t"),
    @NamedQuery(name = "TipoAccion.findByIDAccion", query = "SELECT t FROM TipoAccion t WHERE t.iDAccion = :iDAccion"),
    @NamedQuery(name = "TipoAccion.findByNombreAccion", query = "SELECT t FROM TipoAccion t WHERE t.nombreAccion = :nombreAccion")})
public class TipoAccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Accion")
    private Integer iDAccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nombre_Accion")
    private String nombreAccion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "accionIDAccion", fetch = FetchType.LAZY)
    private List<UsuarioAccion> usuarioAccionList;

    public TipoAccion() {
    }

    public TipoAccion(Integer iDAccion) {
        this.iDAccion = iDAccion;
    }

    public TipoAccion(Integer iDAccion, String nombreAccion) {
        this.iDAccion = iDAccion;
        this.nombreAccion = nombreAccion;
    }

    public Integer getIDAccion() {
        return iDAccion;
    }

    public void setIDAccion(Integer iDAccion) {
        this.iDAccion = iDAccion;
    }

    public String getNombreAccion() {
        return nombreAccion;
    }

    public void setNombreAccion(String nombreAccion) {
        this.nombreAccion = nombreAccion;
    }

    @XmlTransient
    public List<UsuarioAccion> getUsuarioAccionList() {
        return usuarioAccionList;
    }

    public void setUsuarioAccionList(List<UsuarioAccion> usuarioAccionList) {
        this.usuarioAccionList = usuarioAccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDAccion != null ? iDAccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoAccion)) {
            return false;
        }
        TipoAccion other = (TipoAccion) object;
        if ((this.iDAccion == null && other.iDAccion != null) || (this.iDAccion != null && !this.iDAccion.equals(other.iDAccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.login01.entities.TipoAccion[ iDAccion=" + iDAccion + " ]";
    }
    
}
