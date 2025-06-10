/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login01.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cb00270
 */
@Entity
@Table(name = "tipo_rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoRol.findAll", query = "SELECT t FROM TipoRol t"),
    @NamedQuery(name = "TipoRol.findByIDTipoRol", query = "SELECT t FROM TipoRol t WHERE t.iDTipoRol = :iDTipoRol"),
    @NamedQuery(name = "TipoRol.findByNombreRol", query = "SELECT t FROM TipoRol t WHERE t.nombreRol = :nombreRol")})
public class TipoRol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Tipo_Rol")
    private Integer iDTipoRol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nombre_Rol")
    private String nombreRol;

    public TipoRol() {
    }

    public TipoRol(Integer iDTipoRol) {
        this.iDTipoRol = iDTipoRol;
    }

    public TipoRol(Integer iDTipoRol, String nombreRol) {
        this.iDTipoRol = iDTipoRol;
        this.nombreRol = nombreRol;
    }

    public Integer getIDTipoRol() {
        return iDTipoRol;
    }

    public void setIDTipoRol(Integer iDTipoRol) {
        this.iDTipoRol = iDTipoRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDTipoRol != null ? iDTipoRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoRol)) {
            return false;
        }
        TipoRol other = (TipoRol) object;
        if ((this.iDTipoRol == null && other.iDTipoRol != null) || (this.iDTipoRol != null && !this.iDTipoRol.equals(other.iDTipoRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.login01.entities.TipoRol[ iDTipoRol=" + iDTipoRol + " ]";
    }
    
}
