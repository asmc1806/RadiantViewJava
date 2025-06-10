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
@Table(name = "pago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pago.findAll", query = "SELECT p FROM Pago p"),
    @NamedQuery(name = "Pago.findByIDPago", query = "SELECT p FROM Pago p WHERE p.iDPago = :iDPago"),
    @NamedQuery(name = "Pago.findByMonto", query = "SELECT p FROM Pago p WHERE p.monto = :monto"),
    @NamedQuery(name = "Pago.findByFecha", query = "SELECT p FROM Pago p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Pago.findByMetodo", query = "SELECT p FROM Pago p WHERE p.metodo = :metodo"),
    @NamedQuery(name = "Pago.findByEstado", query = "SELECT p FROM Pago p WHERE p.estado = :estado"),
    @NamedQuery(name = "Pago.findByHistorialExamenIDHistorialExamen", query = "SELECT p FROM Pago p WHERE p.historialExamenIDHistorialExamen = :historialExamenIDHistorialExamen")})
public class Pago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Pago")
    private Integer iDPago;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Monto")
    private String monto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Metodo")
    private String metodo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Historial_Examen_ID_Historial_Examen")
    private int historialExamenIDHistorialExamen;

    public Pago() {
    }

    public Pago(Integer iDPago) {
        this.iDPago = iDPago;
    }

    public Pago(Integer iDPago, String monto, Date fecha, String metodo, String estado, int historialExamenIDHistorialExamen) {
        this.iDPago = iDPago;
        this.monto = monto;
        this.fecha = fecha;
        this.metodo = metodo;
        this.estado = estado;
        this.historialExamenIDHistorialExamen = historialExamenIDHistorialExamen;
    }

    public Integer getIDPago() {
        return iDPago;
    }

    public void setIDPago(Integer iDPago) {
        this.iDPago = iDPago;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
        hash += (iDPago != null ? iDPago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pago)) {
            return false;
        }
        Pago other = (Pago) object;
        if ((this.iDPago == null && other.iDPago != null) || (this.iDPago != null && !this.iDPago.equals(other.iDPago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.login01.entities.Pago[ iDPago=" + iDPago + " ]";
    }
    
}
