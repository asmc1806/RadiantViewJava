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
@Table(name = "tipo_insumos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoInsumos.findAll", query = "SELECT t FROM TipoInsumos t"),
    @NamedQuery(name = "TipoInsumos.findByIDTipoInsumos", query = "SELECT t FROM TipoInsumos t WHERE t.iDTipoInsumos = :iDTipoInsumos"),
    @NamedQuery(name = "TipoInsumos.findByNombreInsumos", query = "SELECT t FROM TipoInsumos t WHERE t.nombreInsumos = :nombreInsumos"),
    @NamedQuery(name = "TipoInsumos.findByCategoriaInsumos", query = "SELECT t FROM TipoInsumos t WHERE t.categoriaInsumos = :categoriaInsumos"),
    @NamedQuery(name = "TipoInsumos.findByDescripcionInsumos", query = "SELECT t FROM TipoInsumos t WHERE t.descripcionInsumos = :descripcionInsumos"),
    @NamedQuery(name = "TipoInsumos.findByMedidaInsumos", query = "SELECT t FROM TipoInsumos t WHERE t.medidaInsumos = :medidaInsumos"),
    @NamedQuery(name = "TipoInsumos.findByStockActualInsumos", query = "SELECT t FROM TipoInsumos t WHERE t.stockActualInsumos = :stockActualInsumos"),
    @NamedQuery(name = "TipoInsumos.findByStockMinimoInsumos", query = "SELECT t FROM TipoInsumos t WHERE t.stockMinimoInsumos = :stockMinimoInsumos"),
    @NamedQuery(name = "TipoInsumos.findByEstadoInsumos", query = "SELECT t FROM TipoInsumos t WHERE t.estadoInsumos = :estadoInsumos")})
public class TipoInsumos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Tipo_Insumos")
    private Integer iDTipoInsumos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "Nombre_Insumos")
    private String nombreInsumos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Categoria_Insumos")
    private String categoriaInsumos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "Descripcion_Insumos")
    private String descripcionInsumos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Medida_Insumos")
    private String medidaInsumos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "Stock_Actual_Insumos")
    private BigDecimal stockActualInsumos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Stock_Minimo_Insumos")
    private BigDecimal stockMinimoInsumos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Estado_Insumos")
    private boolean estadoInsumos;

    public TipoInsumos() {
    }

    public TipoInsumos(Integer iDTipoInsumos) {
        this.iDTipoInsumos = iDTipoInsumos;
    }

    public TipoInsumos(Integer iDTipoInsumos, String nombreInsumos, String categoriaInsumos, String descripcionInsumos, String medidaInsumos, BigDecimal stockActualInsumos, BigDecimal stockMinimoInsumos, boolean estadoInsumos) {
        this.iDTipoInsumos = iDTipoInsumos;
        this.nombreInsumos = nombreInsumos;
        this.categoriaInsumos = categoriaInsumos;
        this.descripcionInsumos = descripcionInsumos;
        this.medidaInsumos = medidaInsumos;
        this.stockActualInsumos = stockActualInsumos;
        this.stockMinimoInsumos = stockMinimoInsumos;
        this.estadoInsumos = estadoInsumos;
    }

    public Integer getIDTipoInsumos() {
        return iDTipoInsumos;
    }

    public void setIDTipoInsumos(Integer iDTipoInsumos) {
        this.iDTipoInsumos = iDTipoInsumos;
    }

    public String getNombreInsumos() {
        return nombreInsumos;
    }

    public void setNombreInsumos(String nombreInsumos) {
        this.nombreInsumos = nombreInsumos;
    }

    public String getCategoriaInsumos() {
        return categoriaInsumos;
    }

    public void setCategoriaInsumos(String categoriaInsumos) {
        this.categoriaInsumos = categoriaInsumos;
    }

    public String getDescripcionInsumos() {
        return descripcionInsumos;
    }

    public void setDescripcionInsumos(String descripcionInsumos) {
        this.descripcionInsumos = descripcionInsumos;
    }

    public String getMedidaInsumos() {
        return medidaInsumos;
    }

    public void setMedidaInsumos(String medidaInsumos) {
        this.medidaInsumos = medidaInsumos;
    }

    public BigDecimal getStockActualInsumos() {
        return stockActualInsumos;
    }

    public void setStockActualInsumos(BigDecimal stockActualInsumos) {
        this.stockActualInsumos = stockActualInsumos;
    }

    public BigDecimal getStockMinimoInsumos() {
        return stockMinimoInsumos;
    }

    public void setStockMinimoInsumos(BigDecimal stockMinimoInsumos) {
        this.stockMinimoInsumos = stockMinimoInsumos;
    }

    public boolean getEstadoInsumos() {
        return estadoInsumos;
    }

    public void setEstadoInsumos(boolean estadoInsumos) {
        this.estadoInsumos = estadoInsumos;
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
