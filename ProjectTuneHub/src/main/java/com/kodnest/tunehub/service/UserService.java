package com.kodnest.tunehub.service;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

	
	public String addUser(User user) ;

	public boolean emailExists(String email);

	public boolean validateUser(String email, String password);

	public String getRole(String email);

	public com.kodnest.tunehub.entity.User getUser(String mail);

	public void updateUser(com.kodnest.tunehub.entity.User user);

}

