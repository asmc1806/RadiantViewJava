/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login01.security;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author cb00270
 */
public class Filtro implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException{
    }
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
        HttpServletRequest solicitud = (HttpServletRequest) request;
        HttpServletResponse respuesta = (HttpServletResponse) response;
        
        respuesta.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        respuesta.setHeader("Pragma", "no-cache");
        respuesta.setDateHeader("Expires", 0);
        
        // Valores para validacion
        HttpSession sesion = solicitud.getSession();
        String rutaSolicitud = solicitud.getRequestURI();
        String raiz = solicitud.getContextPath();
        
        //Validaciones:
        //1. Validar Sesion
        boolean validarSesion = ((sesion!=null) && (sesion.getAttribute("usuario")!=null));
        //2. Solicitud login
        boolean validarRutaLogin = (rutaSolicitud.equals(raiz + "/") || (rutaSolicitud.equals(raiz + "/login.xhtml")));
        //3. Cargue contenido
        boolean validarContenido = rutaSolicitud.contains("/resources/");
        
        if (validarSesion || validarRutaLogin || validarContenido) {
            chain.doFilter(request, response);
        }else{
            respuesta.sendRedirect(raiz);
        }
        
    }

    @Override
    public void destroy() {
        
    }

}
