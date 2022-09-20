/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.umportfolio.um.Interface;

import com.umportfolio.um.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traemos una lista de personas
    public List<Persona>getPersona();
    
    //guardamos un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto(usuario) por id
    public void deletePersona(Long id);
    
    //buscar una persona por id
    public Persona findPersona(Long id);
}
