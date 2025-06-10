/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login01.services;

import com.mycompany.login01.entities.TipoExamen;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cb00270
 */
@Stateless
public class TipoExamenFacade extends AbstractFacade<TipoExamen> implements TipoExamenFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_Login01_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoExamenFacade() {
        super(TipoExamen.class);
    }
    
}
