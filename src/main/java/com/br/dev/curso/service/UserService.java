package com.br.dev.curso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.dev.curso.entities.User;
import com.br.dev.curso.repositories.UserRepository;

@Service /*pode ser @Component/ @Repository*/
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	
	
	
	
	
	
	
	
	

}
