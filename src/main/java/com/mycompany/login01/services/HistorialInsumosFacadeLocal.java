/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.login01.services;

import com.mycompany.login01.entities.HistorialInsumos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cb00270
 */
@Local
public interface HistorialInsumosFacadeLocal {

    void create(HistorialInsumos historialInsumos);

    void edit(HistorialInsumos historialInsumos);

    void remove(HistorialInsumos historialInsumos);

    HistorialInsumos find(Object id);

    List<HistorialInsumos> findAll();

    List<HistorialInsumos> findRange(int[] range);

    int count();
    
}
