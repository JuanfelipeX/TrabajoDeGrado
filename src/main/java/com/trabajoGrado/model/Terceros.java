/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajoGrado.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author pipes
 */
@Document(value = "Terceros")
@Data
public class Terceros {
    @Id
    private Integer id;
    private String nombres;
    private String apellidos;
    private String email;
    private Integer edad;
    
}
