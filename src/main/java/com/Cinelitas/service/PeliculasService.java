/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.service;

import com.Cinelitas.entity.Peliculas;
import com.Cinelitas.repository.PeliculasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mpaul
 */
@Service
public class PeliculasService implements IPeliculasService{
    
    @Autowired
    private PeliculasRepository peliculasRepository;
    
    @Override
    public List<Peliculas> getAllPeliculas() {
        return (List<Peliculas>)peliculasRepository.findAll();
    }
    
    @Override
    public Peliculas getPeliculasById(long id) {
        return peliculasRepository.findById(id).orElse(null);
    }
    
    @Override
    public void savePeliculas(Peliculas peliculas) {
        peliculasRepository.save(peliculas);
    }
    
    @Override
    public void delete(long id) {
        peliculasRepository.deleteById(id);
    }
    
    
    
}
