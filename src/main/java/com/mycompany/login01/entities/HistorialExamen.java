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
@Table(name = "historial_examen")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistorialExamen.findAll", query = "SELECT h FROM HistorialExamen h"),
    @NamedQuery(name = "HistorialExamen.findByIDHistorialExamen", query = "SELECT h FROM HistorialExamen h WHERE h.iDHistorialExamen = :iDHistorialExamen"),
    @NamedQuery(name = "HistorialExamen.findByFechaHistorial", query = "SELECT h FROM HistorialExamen h WHERE h.fechaHistorial = :fechaHistorial"),
    @NamedQuery(name = "HistorialExamen.findByCostoExamen", query = "SELECT h FROM HistorialExamen h WHERE h.costoExamen = :costoExamen"),
    @NamedQuery(name = "HistorialExamen.findByUsuarioRadiologo", query = "SELECT h FROM HistorialExamen h WHERE h.usuarioRadiologo = :usuarioRadiologo"),
    @NamedQuery(name = "HistorialExamen.findByUsuarioPaciente", query = "SELECT h FROM HistorialExamen h WHERE h.usuarioPaciente = :usuarioPaciente"),
    @NamedQuery(name = "HistorialExamen.findByExamenesIDExamen", query = "SELECT h FROM HistorialExamen h WHERE h.examenesIDExamen = :examenesIDExamen"),
    @NamedQuery(name = "HistorialExamen.findByCitaIDCita", query = "SELECT h FROM HistorialExamen h WHERE h.citaIDCita = :citaIDCita")})
public class HistorialExamen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Historial_Examen")
    private Integer iDHistorialExamen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha_Historial")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHistorial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Costo_Examen")
    private long costoExamen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Usuario_Radiologo")
    private int usuarioRadiologo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Usuario_Paciente")
    private int usuarioPaciente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Examenes_ID_Examen")
    private int examenesIDExamen;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cita_ID_Cita")
    private int citaIDCita;

    public HistorialExamen() {
    }

    public HistorialExamen(Integer iDHistorialExamen) {
        this.iDHistorialExamen = iDHistorialExamen;
    }

    public HistorialExamen(Integer iDHistorialExamen, Date fechaHistorial, long costoExamen, int usuarioRadiologo, int usuarioPaciente, int examenesIDExamen, int citaIDCita) {
        this.iDHistorialExamen = iDHistorialExamen;
        this.fechaHistorial = fechaHistorial;
        this.costoExamen = costoExamen;
        this.usuarioRadiologo = usuarioRadiologo;
        this.usuarioPaciente = usuarioPaciente;
        this.examenesIDExamen = examenesIDExamen;
        this.citaIDCita = citaIDCita;
    }

    public Integer getIDHistorialExamen() {
        return iDHistorialExamen;
    }

    public void setIDHistorialExamen(Integer iDHistorialExamen) {
        this.iDHistorialExamen = iDHistorialExamen;
    }

    public Date getFechaHistorial() {
        return fechaHistorial;
    }

    public void setFechaHistorial(Date fechaHistorial) {
        this.fechaHistorial = fechaHistorial;
    }

    public long getCostoExamen() {
        return costoExamen;
    }

    public void setCostoExamen(long costoExamen) {
        this.costoExamen = costoExamen;
    }

    public int getUsuarioRadiologo() {
        return usuarioRadiologo;
    }

    public void setUsuarioRadiologo(int usuarioRadiologo) {
        this.usuarioRadiologo = usuarioRadiologo;
    }

    public int getUsuarioPaciente() {
        return usuarioPaciente;
    }

    public void setUsuarioPaciente(int usuarioPaciente) {
        this.usuarioPaciente = usuarioPaciente;
    }

    public int getExamenesIDExamen() {
        return examenesIDExamen;
    }

    public void setExamenesIDExamen(int examenesIDExamen) {
        this.examenesIDExamen = examenesIDExamen;
    }

    public int getCitaIDCita() {
        return citaIDCita;
    }

    public void setCitaIDCita(int citaIDCita) {
        this.citaIDCita = citaIDCita;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDHistorialExamen != null ? iDHistorialExamen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialExamen)) {
            return false;
        }
        HistorialExamen other = (HistorialExamen) object;
        if ((this.iDHistorialExamen == null && other.iDHistorialExamen != null) || (this.iDHistorialExamen != null && !this.iDHistorialExamen.equals(other.iDHistorialExamen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.login01.entities.HistorialExamen[ iDHistorialExamen=" + iDHistorialExamen + " ]";
    }
    
}
