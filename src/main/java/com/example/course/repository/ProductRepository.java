package com.example.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
