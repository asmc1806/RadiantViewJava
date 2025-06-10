/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.login01.services;

import com.mycompany.login01.entities.TipoRol;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cb00270
 */
@Local
public interface TipoRolFacadeLocal {

    void create(TipoRol tipoRol);

    void edit(TipoRol tipoRol);

    void remove(TipoRol tipoRol);

    TipoRol find(Object id);

    List<TipoRol> findAll();

    List<TipoRol> findRange(int[] range);

    int count();
    
}
