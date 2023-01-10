/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajoGrado.service;

import com.trabajoGrado.model.Terceros;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.trabajoGrado.repository.TercerosRepository;

/**
 *
 * @author pipes
 */
@Service
@RequiredArgsConstructor
public class TercerosService {

    private final TercerosRepository tercerosRepository;

    public void save(Terceros terceros) {
        tercerosRepository.save(terceros);
    }

    public List<Terceros> findAll() {
        return tercerosRepository.findAll();
    }

    public Optional<Terceros> findById(Integer id) {
        return tercerosRepository.findById(id);
    }

    public void deleteById(Integer id) {
        tercerosRepository.deleteById(id);
    }
}
