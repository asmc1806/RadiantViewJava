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
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIDUsuario", query = "SELECT u FROM Usuario u WHERE u.iDUsuario = :iDUsuario"),
    @NamedQuery(name = "Usuario.findByTipoDocumento", query = "SELECT u FROM Usuario u WHERE u.tipoDocumento = :tipoDocumento"),
    @NamedQuery(name = "Usuario.findByNombresUsuario", query = "SELECT u FROM Usuario u WHERE u.nombresUsuario = :nombresUsuario"),
    @NamedQuery(name = "Usuario.findByApellidosUsuario", query = "SELECT u FROM Usuario u WHERE u.apellidosUsuario = :apellidosUsuario"),
    @NamedQuery(name = "Usuario.findByTelefonoUsuario", query = "SELECT u FROM Usuario u WHERE u.telefonoUsuario = :telefonoUsuario"),
    @NamedQuery(name = "Usuario.findByEdad", query = "SELECT u FROM Usuario u WHERE u.edad = :edad"),
    @NamedQuery(name = "Usuario.findByCorreoUsuario", query = "SELECT u FROM Usuario u WHERE u.correoUsuario = :correoUsuario"),
    @NamedQuery(name = "Usuario.findByContrase\u00f1aUsuario", query = "SELECT u FROM Usuario u WHERE u.contrase\u00f1aUsuario = :contrase\u00f1aUsuario"),
    @NamedQuery(name = "Usuario.findByRolIDRol", query = "SELECT u FROM Usuario u WHERE u.rolIDRol = :rolIDRol")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Usuario")
    private Integer iDUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "Tipo_Documento")
    private String tipoDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 90)
    @Column(name = "Nombres_Usuario")
    private String nombresUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 90)
    @Column(name = "Apellidos_Usuario")
    private String apellidosUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "Telefono_Usuario")
    private String telefonoUsuario;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Direccion_Usuario")
    private String direccionUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Edad")
    private int edad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 120)
    @Column(name = "Correo_Usuario")
    private String correoUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "Contrase\u00f1a_Usuario")
    private String contraseñaUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Rol_ID_Rol")
    private int rolIDRol;

    public Usuario() {
    }

    public Usuario(Integer iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    public Usuario(Integer iDUsuario, String tipoDocumento, String nombresUsuario, String apellidosUsuario, String telefonoUsuario, String direccionUsuario, int edad, String correoUsuario, String contraseñaUsuario, int rolIDRol) {
        this.iDUsuario = iDUsuario;
        this.tipoDocumento = tipoDocumento;
        this.nombresUsuario = nombresUsuario;
        this.apellidosUsuario = apellidosUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.direccionUsuario = direccionUsuario;
        this.edad = edad;
        this.correoUsuario = correoUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
        this.rolIDRol = rolIDRol;
    }

    public Integer getIDUsuario() {
        return iDUsuario;
    }

    public void setIDUsuario(Integer iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombresUsuario() {
        return nombresUsuario;
    }

    public void setNombresUsuario(String nombresUsuario) {
        this.nombresUsuario = nombresUsuario;
    }

    public String getApellidosUsuario() {
        return apellidosUsuario;
    }

    public void setApellidosUsuario(String apellidosUsuario) {
        this.apellidosUsuario = apellidosUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

    public int getRolIDRol() {
        return rolIDRol;
    }

    public void setRolIDRol(int rolIDRol) {
        this.rolIDRol = rolIDRol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDUsuario != null ? iDUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.iDUsuario == null && other.iDUsuario != null) || (this.iDUsuario != null && !this.iDUsuario.equals(other.iDUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.login01.entities.Usuario[ iDUsuario=" + iDUsuario + " ]";
    }
    
}
