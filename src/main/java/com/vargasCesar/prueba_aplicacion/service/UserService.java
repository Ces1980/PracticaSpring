package com.vargasCesar.prueba_aplicacion.service;




import com.vargasCesar.prueba_aplicacion.entity.User;

public interface UserService {
	
	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;

}
