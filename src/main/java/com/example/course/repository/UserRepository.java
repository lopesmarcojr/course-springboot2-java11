package com.example.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {
	

}
