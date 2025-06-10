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
import javax.persistence.Lob;
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
@Table(name = "tipo_examen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoExamen.findAll", query = "SELECT t FROM TipoExamen t"),
    @NamedQuery(name = "TipoExamen.findByIDTipoExamen", query = "SELECT t FROM TipoExamen t WHERE t.iDTipoExamen = :iDTipoExamen"),
    @NamedQuery(name = "TipoExamen.findByNombreExamen", query = "SELECT t FROM TipoExamen t WHERE t.nombreExamen = :nombreExamen")})
public class TipoExamen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Tipo_Examen")
    private Integer iDTipoExamen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "Nombre_Examen")
    private String nombreExamen;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Descripcion_Examen")
    private String descripcionExamen;

    public TipoExamen() {
    }

    public TipoExamen(Integer iDTipoExamen) {
        this.iDTipoExamen = iDTipoExamen;
    }

    public TipoExamen(Integer iDTipoExamen, String nombreExamen, String descripcionExamen) {
        this.iDTipoExamen = iDTipoExamen;
        this.nombreExamen = nombreExamen;
        this.descripcionExamen = descripcionExamen;
    }

    public Integer getIDTipoExamen() {
        return iDTipoExamen;
    }

    public void setIDTipoExamen(Integer iDTipoExamen) {
        this.iDTipoExamen = iDTipoExamen;
    }

    public String getNombreExamen() {
        return nombreExamen;
    }

    public void setNombreExamen(String nombreExamen) {
        this.nombreExamen = nombreExamen;
    }

    public String getDescripcionExamen() {
        return descripcionExamen;
    }

    public void setDescripcionExamen(String descripcionExamen) {
        this.descripcionExamen = descripcionExamen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDTipoExamen != null ? iDTipoExamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoExamen)) {
            return false;
        }
        TipoExamen other = (TipoExamen) object;
        if ((this.iDTipoExamen == null && other.iDTipoExamen != null) || (this.iDTipoExamen != null && !this.iDTipoExamen.equals(other.iDTipoExamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.login01.entities.TipoExamen[ iDTipoExamen=" + iDTipoExamen + " ]";
    }
    
}
