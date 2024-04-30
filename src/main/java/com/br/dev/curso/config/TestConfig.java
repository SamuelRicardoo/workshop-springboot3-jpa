package com.br.dev.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.br.dev.curso.entities.User;
import com.br.dev.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null,"samuel", "samuel@gmail","9999","432");
		User user2 = new User(null,"teste", "teste@gmail","t","55");
		
		repository.saveAll(Arrays.asList(user1, user2));

	}
	
	

}
