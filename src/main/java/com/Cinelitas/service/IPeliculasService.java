/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.service;

import com.Cinelitas.entity.Peliculas;
import java.util.List;

/**
 *
 * @author mpaul
 */
public interface IPeliculasService {
    public List<Peliculas> getAllPeliculas();
    public Peliculas getPeliculasById(long id);
    public void savePeliculas(Peliculas peliculas);
    public void delete(long id);
}
