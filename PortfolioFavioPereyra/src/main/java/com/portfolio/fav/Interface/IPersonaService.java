/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.fav.Interface;

import com.portfolio.fav.Entity.Persona;
import java.util.List;

/**
 *
 * @author JLucian
 */
public interface IPersonaService {
    // traer lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo de persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto pero lo buscamos por id
    public void deletePersona (Long id);
            
   //buscar una persona por id
    public Persona findPersona(Long id);
    
    
    
}

