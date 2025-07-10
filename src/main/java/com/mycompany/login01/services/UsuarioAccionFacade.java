/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login01.services;

import com.mycompany.login01.entities.Usuario;
import com.mycompany.login01.entities.UsuarioAccion;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cb00270
 */
@Stateless
public class UsuarioAccionFacade extends AbstractFacade<UsuarioAccion> implements UsuarioAccionFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_Login01_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioAccionFacade() {
        super(UsuarioAccion.class);
    }

    @Override
    public List<UsuarioAccion> Permisos(Usuario usu) {
        try {
            return em.createQuery("SELECT ua FROM UsuarioAccion ua WHERE ua.usuarioIDUsuario.idUsuario = :idUsuario", UsuarioAccion.class).setParameter("idUsuario", usu.getIDUsuario()).getResultList();
            
        } catch (Exception e) {
        }
        return null;
    }
    
}
