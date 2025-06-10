/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login01.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "historial_insumos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistorialInsumos.findAll", query = "SELECT h FROM HistorialInsumos h"),
    @NamedQuery(name = "HistorialInsumos.findByIDHistorialInsumo", query = "SELECT h FROM HistorialInsumos h WHERE h.historialInsumosPK.iDHistorialInsumo = :iDHistorialInsumo"),
    @NamedQuery(name = "HistorialInsumos.findByHistorialExamenIDHistorialExamen", query = "SELECT h FROM HistorialInsumos h WHERE h.historialInsumosPK.historialExamenIDHistorialExamen = :historialExamenIDHistorialExamen"),
    @NamedQuery(name = "HistorialInsumos.findByTipoInsumosIDTipoInsumos", query = "SELECT h FROM HistorialInsumos h WHERE h.historialInsumosPK.tipoInsumosIDTipoInsumos = :tipoInsumosIDTipoInsumos"),
    @NamedQuery(name = "HistorialInsumos.findByCantidadUsada", query = "SELECT h FROM HistorialInsumos h WHERE h.cantidadUsada = :cantidadUsada")})
public class HistorialInsumos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HistorialInsumosPK historialInsumosPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Cantidad_Usada")
    private String cantidadUsada;

    public HistorialInsumos() {
    }

    public HistorialInsumos(HistorialInsumosPK historialInsumosPK) {
        this.historialInsumosPK = historialInsumosPK;
    }

    public HistorialInsumos(HistorialInsumosPK historialInsumosPK, String cantidadUsada) {
        this.historialInsumosPK = historialInsumosPK;
        this.cantidadUsada = cantidadUsada;
    }

    public HistorialInsumos(String iDHistorialInsumo, int historialExamenIDHistorialExamen, int tipoInsumosIDTipoInsumos) {
        this.historialInsumosPK = new HistorialInsumosPK(iDHistorialInsumo, historialExamenIDHistorialExamen, tipoInsumosIDTipoInsumos);
    }

    public HistorialInsumosPK getHistorialInsumosPK() {
        return historialInsumosPK;
    }

    public void setHistorialInsumosPK(HistorialInsumosPK historialInsumosPK) {
        this.historialInsumosPK = historialInsumosPK;
    }

    public String getCantidadUsada() {
        return cantidadUsada;
    }

    public void setCantidadUsada(String cantidadUsada) {
        this.cantidadUsada = cantidadUsada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historialInsumosPK != null ? historialInsumosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialInsumos)) {
            return false;
        }
        HistorialInsumos other = (HistorialInsumos) object;
        if ((this.historialInsumosPK == null && other.historialInsumosPK != null) || (this.historialInsumosPK != null && !this.historialInsumosPK.equals(other.historialInsumosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.login01.entities.HistorialInsumos[ historialInsumosPK=" + historialInsumosPK + " ]";
    }
    
}
