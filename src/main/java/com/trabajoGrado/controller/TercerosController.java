/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajoGrado.controller;

import com.trabajoGrado.model.Terceros;
import com.trabajoGrado.service.TercerosService;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author pipes
 */
@RestController
@RequestMapping("api/")
@RequiredArgsConstructor
public class TercerosController {

    private final TercerosService tercerosService;

    @PostMapping("/terceros")
    public void save(@RequestBody Terceros terceros) {
        tercerosService.save(terceros);
    }

    @GetMapping("/terceros")
    public List<Terceros> findAll(RedirectAttributes redirectAttrs) {
        redirectAttrs
                .addFlashAttribute("mensaje", "Agregado correctamente")
                .addFlashAttribute("clase", "success");
        return tercerosService.findAll();
    }

    @GetMapping("/terceros/{id}")
    public Terceros findById(@PathVariable Integer id) {
        return tercerosService.findById(id).get();
    }

    @DeleteMapping("/terceros/{id}")
    public void deleteById(@PathVariable Integer id) {
        tercerosService.deleteById(id);
    }

    @PutMapping("terceros")
    public void update(@RequestBody Terceros terceros) {
        tercerosService.save(terceros);
    }
}
