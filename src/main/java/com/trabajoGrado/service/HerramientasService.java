/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajoGrado.service;

import com.trabajoGrado.model.Herramientas;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.trabajoGrado.repository.HerramientasRepository;

/**
 *
 * @author pipes
 */
@Service
@RequiredArgsConstructor
public class HerramientasService {

    private final HerramientasRepository herramientasRepository;

    public void save(Herramientas herramientas) {
        herramientasRepository.save(herramientas);
    }

    public List<Herramientas> findAll() {
        return herramientasRepository.findAll();
    }

    public Optional<Herramientas> findById(String id) {
        return herramientasRepository.findById(id);
    }
    
     public boolean exist(String email) {
        return herramientasRepository.existsByNombre(email);
    }

    public Optional<Herramientas> updatedId(Herramientas req, String id) {
        Optional<Herramientas> herramientas = herramientasRepository.findById(id);
        if (herramientas != null) {
            herramientasRepository.save(req);
        }
        return herramientas;
    }

    public void deleteById(String id) {
        herramientasRepository.deleteById(id);
    }
}
