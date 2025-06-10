/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.login01.services;

import com.mycompany.login01.entities.HistorialExamen;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cb00270
 */
@Local
public interface HistorialExamenFacadeLocal {

    void create(HistorialExamen historialExamen);

    void edit(HistorialExamen historialExamen);

    void remove(HistorialExamen historialExamen);

    HistorialExamen find(Object id);

    List<HistorialExamen> findAll();

    List<HistorialExamen> findRange(int[] range);

    int count();
    
}
