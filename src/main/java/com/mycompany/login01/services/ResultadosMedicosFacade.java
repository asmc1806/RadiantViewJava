/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login01.services;

import com.mycompany.login01.entities.ResultadosMedicos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cb00270
 */
@Stateless
public class ResultadosMedicosFacade extends AbstractFacade<ResultadosMedicos> implements ResultadosMedicosFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_Login01_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ResultadosMedicosFacade() {
        super(ResultadosMedicos.class);
    }
    
}
