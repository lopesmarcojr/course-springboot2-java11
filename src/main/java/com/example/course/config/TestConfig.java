package com.example.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.course.entities.Order;
import com.example.course.entities.Usuario;
import com.example.course.entities.enums.OrderStatus;
import com.example.course.repository.OrderRepository;
import com.example.course.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "9888888888", "123456");
		Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "899999999", "654321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:43:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),  OrderStatus.WAITING_PAYMENT, u1);
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
	}
	
	
}
