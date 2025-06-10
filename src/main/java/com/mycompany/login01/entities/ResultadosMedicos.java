/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login01.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cb00270
 */
@Entity
@Table(name = "resultados_medicos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ResultadosMedicos.findAll", query = "SELECT r FROM ResultadosMedicos r"),
    @NamedQuery(name = "ResultadosMedicos.findByIDResultados", query = "SELECT r FROM ResultadosMedicos r WHERE r.iDResultados = :iDResultados"),
    @NamedQuery(name = "ResultadosMedicos.findByFechaResultado", query = "SELECT r FROM ResultadosMedicos r WHERE r.fechaResultado = :fechaResultado"),
    @NamedQuery(name = "ResultadosMedicos.findByHistorialExamenIDHistorialExamen", query = "SELECT r FROM ResultadosMedicos r WHERE r.historialExamenIDHistorialExamen = :historialExamenIDHistorialExamen")})
public class ResultadosMedicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Resultados")
    private Integer iDResultados;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Resultados")
    private String resultados;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "Archivo_Resultado")
    private byte[] archivoResultado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Resultado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaResultado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Historial_Examen_ID_Historial_Examen")
    private int historialExamenIDHistorialExamen;

    public ResultadosMedicos() {
    }

    public ResultadosMedicos(Integer iDResultados) {
        this.iDResultados = iDResultados;
    }

    public ResultadosMedicos(Integer iDResultados, String resultados, byte[] archivoResultado, Date fechaResultado, int historialExamenIDHistorialExamen) {
        this.iDResultados = iDResultados;
        this.resultados = resultados;
        this.archivoResultado = archivoResultado;
        this.fechaResultado = fechaResultado;
        this.historialExamenIDHistorialExamen = historialExamenIDHistorialExamen;
    }

    public Integer getIDResultados() {
        return iDResultados;
    }

    public void setIDResultados(Integer iDResultados) {
        this.iDResultados = iDResultados;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    public byte[] getArchivoResultado() {
        return archivoResultado;
    }

    public void setArchivoResultado(byte[] archivoResultado) {
        this.archivoResultado = archivoResultado;
    }

    public Date getFechaResultado() {
        return fechaResultado;
    }

    public void setFechaResultado(Date fechaResultado) {
        this.fechaResultado = fechaResultado;
    }

    public int getHistorialExamenIDHistorialExamen() {
        return historialExamenIDHistorialExamen;
    }

    public void setHistorialExamenIDHistorialExamen(int historialExamenIDHistorialExamen) {
        this.historialExamenIDHistorialExamen = historialExamenIDHistorialExamen;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDResultados != null ? iDResultados.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ResultadosMedicos)) {
            return false;
        }
        ResultadosMedicos other = (ResultadosMedicos) object;
        if ((this.iDResultados == null && other.iDResultados != null) || (this.iDResultados != null && !this.iDResultados.equals(other.iDResultados))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.login01.entities.ResultadosMedicos[ iDResultados=" + iDResultados + " ]";
    }
    
}
