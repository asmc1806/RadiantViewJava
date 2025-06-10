/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login01.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "tipo_insumos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoInsumos.findAll", query = "SELECT t FROM TipoInsumos t"),
    @NamedQuery(name = "TipoInsumos.findByIDTipoInsumos", query = "SELECT t FROM TipoInsumos t WHERE t.iDTipoInsumos = :iDTipoInsumos"),
    @NamedQuery(name = "TipoInsumos.findByNombreInsumo", query = "SELECT t FROM TipoInsumos t WHERE t.nombreInsumo = :nombreInsumo"),
    @NamedQuery(name = "TipoInsumos.findByStock", query = "SELECT t FROM TipoInsumos t WHERE t.stock = :stock")})
public class TipoInsumos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Tipo_Insumos")
    private Integer iDTipoInsumos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nombre_Insumo")
    private String nombreInsumo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Stock")
    private BigDecimal stock;

    public TipoInsumos() {
    }

    public TipoInsumos(Integer iDTipoInsumos) {
        this.iDTipoInsumos = iDTipoInsumos;
    }

    public TipoInsumos(Integer iDTipoInsumos, String nombreInsumo, BigDecimal stock) {
        this.iDTipoInsumos = iDTipoInsumos;
        this.nombreInsumo = nombreInsumo;
        this.stock = stock;
    }

    public Integer getIDTipoInsumos() {
        return iDTipoInsumos;
    }

    public void setIDTipoInsumos(Integer iDTipoInsumos) {
        this.iDTipoInsumos = iDTipoInsumos;
    }

    public String getNombreInsumo() {
        return nombreInsumo;
    }

    public void setNombreInsumo(String nombreInsumo) {
        this.nombreInsumo = nombreInsumo;
    }

    public BigDecimal getStock() {
        return stock;
    }

    public void setStock(BigDecimal stock) {
        this.stock = stock;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDTipoInsumos != null ? iDTipoInsumos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoInsumos)) {
            return false;
        }
        TipoInsumos other = (TipoInsumos) object;
        if ((this.iDTipoInsumos == null && other.iDTipoInsumos != null) || (this.iDTipoInsumos != null && !this.iDTipoInsumos.equals(other.iDTipoInsumos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.login01.entities.TipoInsumos[ iDTipoInsumos=" + iDTipoInsumos + " ]";
    }
    
}
