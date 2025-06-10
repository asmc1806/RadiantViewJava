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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cb00270
 */
@Entity
@Table(name = "cita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c"),
    @NamedQuery(name = "Cita.findByIDCita", query = "SELECT c FROM Cita c WHERE c.iDCita = :iDCita"),
    @NamedQuery(name = "Cita.findByNroCita", query = "SELECT c FROM Cita c WHERE c.nroCita = :nroCita"),
    @NamedQuery(name = "Cita.findByUsuarioPaciente", query = "SELECT c FROM Cita c WHERE c.usuarioPaciente = :usuarioPaciente"),
    @NamedQuery(name = "Cita.findByUsuarioRecepcion", query = "SELECT c FROM Cita c WHERE c.usuarioRecepcion = :usuarioRecepcion"),
    @NamedQuery(name = "Cita.findByFecha", query = "SELECT c FROM Cita c WHERE c.fecha = :fecha")})
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Cita")
    private Integer iDCita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Nro_Cita")
    private int nroCita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Usuario_Paciente")
    private int usuarioPaciente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Usuario_Recepcion")
    private int usuarioRecepcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public Cita() {
    }

    public Cita(Integer iDCita) {
        this.iDCita = iDCita;
    }

    public Cita(Integer iDCita, int nroCita, int usuarioPaciente, int usuarioRecepcion, Date fecha) {
        this.iDCita = iDCita;
        this.nroCita = nroCita;
        this.usuarioPaciente = usuarioPaciente;
        this.usuarioRecepcion = usuarioRecepcion;
        this.fecha = fecha;
    }

    public Integer getIDCita() {
        return iDCita;
    }

    public void setIDCita(Integer iDCita) {
        this.iDCita = iDCita;
    }

    public int getNroCita() {
        return nroCita;
    }

    public void setNroCita(int nroCita) {
        this.nroCita = nroCita;
    }

    public int getUsuarioPaciente() {
        return usuarioPaciente;
    }

    public void setUsuarioPaciente(int usuarioPaciente) {
        this.usuarioPaciente = usuarioPaciente;
    }

    public int getUsuarioRecepcion() {
        return usuarioRecepcion;
    }

    public void setUsuarioRecepcion(int usuarioRecepcion) {
        this.usuarioRecepcion = usuarioRecepcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCita != null ? iDCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.iDCita == null && other.iDCita != null) || (this.iDCita != null && !this.iDCita.equals(other.iDCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.login01.entities.Cita[ iDCita=" + iDCita + " ]";
    }
    
}
