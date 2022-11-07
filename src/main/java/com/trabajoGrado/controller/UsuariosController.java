/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajoGrado.controller;

import com.trabajoGrado.model.Usuarios;
import com.trabajoGrado.service.UsuariosService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pipes
 */
@RestController
@RequestMapping("api/")
@RequiredArgsConstructor
public class UsuariosController {

    private final UsuariosService usuariosService;

    @PostMapping("/usuarios")
    public void save(@RequestBody Usuarios usuarios) {
        usuariosService.save(usuarios);
    }

    @GetMapping("/usuarios")
    public List<Usuarios> findAll() {
        return usuariosService.findAll();
    }

    @GetMapping("/usuarios/{id}")
    public Usuarios findById(@PathVariable Integer id) {
        return usuariosService.findById(id).get();
    }

    @DeleteMapping("/usuarios/{id}")
    public void deleteById(@PathVariable Integer id) {
        usuariosService.deleteById(id);
    }

    @PutMapping("usuarios")
    public void update(@RequestBody Usuarios usuarios) {
        usuariosService.save(usuarios);
    }

}
