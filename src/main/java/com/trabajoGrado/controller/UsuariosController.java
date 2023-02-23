/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajoGrado.controller;

import com.trabajoGrado.model.Usuarios;
import com.trabajoGrado.service.UsuariosService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author pipes
 */
@RestController
@RequestMapping("api/")
@RequiredArgsConstructor
public class UsuariosController {

    private final UsuariosService usuariosService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/usuarios")
    public void save(@RequestBody Usuarios usuarios) {
        if (usuariosService.exist(usuarios.email)) {
        } else {
            usuariosService.save(usuarios);
        }
    }

    @GetMapping("/usuarios")
    public List<Usuarios> findAll(RedirectAttributes redirectAttrs) {
        redirectAttrs
                .addFlashAttribute("mensaje", "Agregado correctamente")
                .addFlashAttribute("clase", "success");
        return usuariosService.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/usuarios/{id}")
    public Usuarios findById(@PathVariable String id) {
        return usuariosService.findById(id).get();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/usuarios/correo/{email}")
    public List<Usuarios> findByEmail(@PathVariable String email) {
        return usuariosService.findByEmail(email);
    }

    @PutMapping("usuarios")
    public void update(@RequestBody Usuarios usuarios) {
        usuariosService.save(usuarios);
    }

    @DeleteMapping("/usuarios/{id}")
    public void deleteById(@PathVariable String id) {
        usuariosService.deleteById(id);
    }

}
