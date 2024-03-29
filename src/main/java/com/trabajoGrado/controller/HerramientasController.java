/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajoGrado.controller;

import com.trabajoGrado.model.Herramientas;
import com.trabajoGrado.service.HerramientasService;
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
public class HerramientasController {

    private final HerramientasService herramientasService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/herramientas")
    public void save(@RequestBody Herramientas herramientas) {
        if (herramientasService.exist(herramientas.nombre)) {
        } else {
            herramientasService.save(herramientas);
        }
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/herramientas")
    public List<Herramientas> findAll(RedirectAttributes redirectAttrs) {
        redirectAttrs
                .addFlashAttribute("mensaje", "Agregado correctamente")
                .addFlashAttribute("clase", "success");
        return herramientasService.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/herramientas/{id}")
    public Herramientas findById(@PathVariable String id) {
        return herramientasService.findById(id).get();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("herramientas/{id}")
    public void update(@RequestBody Herramientas herramientas, @PathVariable String id) {
        herramientasService.updatedId(herramientas, id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/herramientas/{id}")
    public void deleteById(@PathVariable String id) {
        herramientasService.deleteById(id);
    }

}
