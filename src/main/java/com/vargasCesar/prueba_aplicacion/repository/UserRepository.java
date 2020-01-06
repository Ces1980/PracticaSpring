package com.vargasCesar.prueba_aplicacion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vargasCesar.prueba_aplicacion.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
