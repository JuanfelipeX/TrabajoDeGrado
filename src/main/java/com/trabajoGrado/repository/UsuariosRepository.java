/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.trabajoGrado.repository;

import com.trabajoGrado.model.Usuarios;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pipes
 */
@Repository
public interface UsuariosRepository extends MongoRepository<Usuarios, String> {

    boolean existsByEmail(String email);

    public List<Usuarios> findByEmail(String email);

}
