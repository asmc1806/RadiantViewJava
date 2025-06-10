/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.login01.services;

import com.mycompany.login01.entities.ResultadosMedicos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cb00270
 */
@Local
public interface ResultadosMedicosFacadeLocal {

    void create(ResultadosMedicos resultadosMedicos);

    void edit(ResultadosMedicos resultadosMedicos);

    void remove(ResultadosMedicos resultadosMedicos);

    ResultadosMedicos find(Object id);

    List<ResultadosMedicos> findAll();

    List<ResultadosMedicos> findRange(int[] range);

    int count();
    
}
