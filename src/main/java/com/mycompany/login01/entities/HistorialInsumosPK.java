/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login01.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author cb00270
 */
@Embeddable
public class HistorialInsumosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ID_Historial_Insumo")
    private String iDHistorialInsumo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Historial_Examen_ID_Historial_Examen")
    private int historialExamenIDHistorialExamen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Tipo_Insumos_ID_Tipo_Insumos")
    private int tipoInsumosIDTipoInsumos;

    public HistorialInsumosPK() {
    }

    public HistorialInsumosPK(String iDHistorialInsumo, int historialExamenIDHistorialExamen, int tipoInsumosIDTipoInsumos) {
        this.iDHistorialInsumo = iDHistorialInsumo;
        this.historialExamenIDHistorialExamen = historialExamenIDHistorialExamen;
        this.tipoInsumosIDTipoInsumos = tipoInsumosIDTipoInsumos;
    }

    public String getIDHistorialInsumo() {
        return iDHistorialInsumo;
    }

    public void setIDHistorialInsumo(String iDHistorialInsumo) {
        this.iDHistorialInsumo = iDHistorialInsumo;
    }

    public int getHistorialExamenIDHistorialExamen() {
        return historialExamenIDHistorialExamen;
    }

    public void setHistorialExamenIDHistorialExamen(int historialExamenIDHistorialExamen) {
        this.historialExamenIDHistorialExamen = historialExamenIDHistorialExamen;
    }

    public int getTipoInsumosIDTipoInsumos() {
        return tipoInsumosIDTipoInsumos;
    }

    public void setTipoInsumosIDTipoInsumos(int tipoInsumosIDTipoInsumos) {
        this.tipoInsumosIDTipoInsumos = tipoInsumosIDTipoInsumos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDHistorialInsumo != null ? iDHistorialInsumo.hashCode() : 0);
        hash += (int) historialExamenIDHistorialExamen;
        hash += (int) tipoInsumosIDTipoInsumos;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialInsumosPK)) {
            return false;
        }
        HistorialInsumosPK other = (HistorialInsumosPK) object;
        if ((this.iDHistorialInsumo == null && other.iDHistorialInsumo != null) || (this.iDHistorialInsumo != null && !this.iDHistorialInsumo.equals(other.iDHistorialInsumo))) {
            return false;
        }
        if (this.historialExamenIDHistorialExamen != other.historialExamenIDHistorialExamen) {
            return false;
        }
        if (this.tipoInsumosIDTipoInsumos != other.tipoInsumosIDTipoInsumos) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.login01.entities.HistorialInsumosPK[ iDHistorialInsumo=" + iDHistorialInsumo + ", historialExamenIDHistorialExamen=" + historialExamenIDHistorialExamen + ", tipoInsumosIDTipoInsumos=" + tipoInsumosIDTipoInsumos + " ]";
    }
    
}
