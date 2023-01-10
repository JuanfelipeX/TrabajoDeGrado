/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.trabajoGrado.repository;

import com.trabajoGrado.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author pipes
 */
public interface RoleRepository extends MongoRepository<Role, String> {

    Role findByRole(String role);
}