package com.br.dev.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.dev.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
