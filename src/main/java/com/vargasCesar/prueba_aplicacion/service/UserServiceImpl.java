package com.vargasCesar.prueba_aplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vargasCesar.prueba_aplicacion.entity.User;
import com.vargasCesar.prueba_aplicacion.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repository;
	
	@Override
	public Iterable<User> getAllUsers() {
		return repository.findAll();
	}

}
