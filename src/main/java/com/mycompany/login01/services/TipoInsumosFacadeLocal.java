/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.login01.services;

import com.mycompany.login01.entities.TipoInsumos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cb00270
 */
@Local
public interface TipoInsumosFacadeLocal {

    void create(TipoInsumos tipoInsumos);

    void edit(TipoInsumos tipoInsumos);

    void remove(TipoInsumos tipoInsumos);

    TipoInsumos find(Object id);

    List<TipoInsumos> findAll();

    List<TipoInsumos> findRange(int[] range);

    int count();
    
}
