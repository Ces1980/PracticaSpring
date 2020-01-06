package com.vargasCesar.prueba_aplicacion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vargasCesar.prueba_aplicacion.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
