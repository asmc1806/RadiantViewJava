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
@Table(name = "notificacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notificacion.findAll", query = "SELECT n FROM Notificacion n"),
    @NamedQuery(name = "Notificacion.findByIDNotificacion", query = "SELECT n FROM Notificacion n WHERE n.iDNotificacion = :iDNotificacion"),
    @NamedQuery(name = "Notificacion.findByMensaje", query = "SELECT n FROM Notificacion n WHERE n.mensaje = :mensaje"),
    @NamedQuery(name = "Notificacion.findByEstado", query = "SELECT n FROM Notificacion n WHERE n.estado = :estado"),
    @NamedQuery(name = "Notificacion.findByFecha", query = "SELECT n FROM Notificacion n WHERE n.fecha = :fecha"),
    @NamedQuery(name = "Notificacion.findByUsuarioIDUsuario", query = "SELECT n FROM Notificacion n WHERE n.usuarioIDUsuario = :usuarioIDUsuario")})
public class Notificacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Notificacion")
    private Integer iDNotificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Mensaje")
    private String mensaje;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "Estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Usuario_ID_Usuario")
    private int usuarioIDUsuario;

    public Notificacion() {
    }

    public Notificacion(Integer iDNotificacion) {
        this.iDNotificacion = iDNotificacion;
    }

    public Notificacion(Integer iDNotificacion, String mensaje, String estado, Date fecha, int usuarioIDUsuario) {
        this.iDNotificacion = iDNotificacion;
        this.mensaje = mensaje;
        this.estado = estado;
        this.fecha = fecha;
        this.usuarioIDUsuario = usuarioIDUsuario;
    }

    public Integer getIDNotificacion() {
        return iDNotificacion;
    }

    public void setIDNotificacion(Integer iDNotificacion) {
        this.iDNotificacion = iDNotificacion;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getUsuarioIDUsuario() {
        return usuarioIDUsuario;
    }

    public void setUsuarioIDUsuario(int usuarioIDUsuario) {
        this.usuarioIDUsuario = usuarioIDUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDNotificacion != null ? iDNotificacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notificacion)) {
            return false;
        }
        Notificacion other = (Notificacion) object;
        if ((this.iDNotificacion == null && other.iDNotificacion != null) || (this.iDNotificacion != null && !this.iDNotificacion.equals(other.iDNotificacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.login01.entities.Notificacion[ iDNotificacion=" + iDNotificacion + " ]";
    }
    
}
