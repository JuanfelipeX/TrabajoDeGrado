/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.trabajoGrado.repository;

import com.trabajoGrado.model.Terceros;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pipes
 */
@Repository
public interface TercerosRepository extends MongoRepository<Terceros, Integer>{ 
    
}
