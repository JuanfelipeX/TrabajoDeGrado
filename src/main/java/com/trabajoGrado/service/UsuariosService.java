/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajoGrado.service;

import com.trabajoGrado.model.Usuarios;
import com.trabajoGrado.repository.UsuariosRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author pipes
 */
@Service
@RequiredArgsConstructor
public class UsuariosService {

    private final UsuariosRepository usuariosRepository;

    public void save(Usuarios usuarios) {
        usuariosRepository.save(usuarios);
    }

    public List<Usuarios> findAll() {
        return usuariosRepository.findAll();
    }

    public Optional<Usuarios> findById(String id) {
        return usuariosRepository.findById(id);
    }
    
    public void deleteById(String id) {
        usuariosRepository.deleteById(id);
    }
}
