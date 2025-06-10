/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.login01.services;

import com.mycompany.login01.entities.UsuarioAccion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author cb00270
 */
@Local
public interface UsuarioAccionFacadeLocal {

    void create(UsuarioAccion usuarioAccion);

    void edit(UsuarioAccion usuarioAccion);

    void remove(UsuarioAccion usuarioAccion);

    UsuarioAccion find(Object id);

    List<UsuarioAccion> findAll();

    List<UsuarioAccion> findRange(int[] range);

    int count();
    
}
