/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.login01.services;

import com.mycompany.login01.entities.TipoExamen;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cb00270
 */
@Local
public interface TipoExamenFacadeLocal {

    void create(TipoExamen tipoExamen);

    void edit(TipoExamen tipoExamen);

    void remove(TipoExamen tipoExamen);

    TipoExamen find(Object id);

    List<TipoExamen> findAll();

    List<TipoExamen> findRange(int[] range);

    int count();
    
}
