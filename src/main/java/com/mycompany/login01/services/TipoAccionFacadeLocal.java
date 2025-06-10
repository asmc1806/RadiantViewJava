/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.login01.services;

import com.mycompany.login01.entities.TipoAccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cb00270
 */
@Local
public interface TipoAccionFacadeLocal {

    void create(TipoAccion tipoAccion);

    void edit(TipoAccion tipoAccion);

    void remove(TipoAccion tipoAccion);

    TipoAccion find(Object id);

    List<TipoAccion> findAll();

    List<TipoAccion> findRange(int[] range);

    int count();
    
}
