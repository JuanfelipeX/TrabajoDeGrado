/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajoGrado.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author pipes
 */
@Document(value = "herramientas")
@Data
@Table(name = "herramientas", uniqueConstraints = @UniqueConstraint(columnNames = "nombre"))
public class Herramientas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column(unique = true)
    public String nombre;
    
    private String descripcion;
    private String url;
    private String precio;
    //private Integer etiquetas;
    private String provedor;
    private String normas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
