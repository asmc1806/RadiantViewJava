/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login01.services;

import com.mycompany.login01.entities.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author cb00270
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_Login01_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    @Override
    public Usuario iniciarSesion(String usuario, String contrasena) {
        Query query = em.createQuery("SELECT U FROM Usuario U WHERE U.correoUsuario=:usuario AND U.contraseñaUsuario=:contrasena");
        query.setParameter("usuario", usuario);
        query.setParameter("contrasena", contrasena);
        try {
            return (Usuario) query.getSingleResult();
        } catch (Exception e) {
            Usuario usuarioVacio = new Usuario();
            return usuarioVacio;
        }
    }
    
}
