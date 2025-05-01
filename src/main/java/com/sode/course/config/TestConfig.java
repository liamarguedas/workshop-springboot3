package com.sode.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sode.course.entities.Category;
import com.sode.course.entities.Order;
import com.sode.course.entities.User;
import com.sode.course.entities.enums.OrderStatus;
import com.sode.course.repositories.CategoryRepository;
import com.sode.course.repositories.OrderRepository;
import com.sode.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private CategoryRepository categoryRepository;


	@Override
	public void run(String... args) throws Exception {

		// Testing users
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "99999999999999", "123456");
		User u2 = new User(null, "Liam Brown", "liam@gmail.com", "111111111111111", "12312321");


		// Testing orders
		Order o1 = new Order(null, Instant.parse("2025-04-30T19:53:07Z"), u1, OrderStatus.PAID);
		Order o2 = new Order(null, Instant.parse("2025-04-20T19:53:07Z"), u2, OrderStatus.PAID);
		Order o3 = new Order(null, Instant.parse("2025-04-23T19:53:07Z"), u2, OrderStatus.PAID);
		
		
		// Category init
		Category c1 = new Category(null, "Frutas");		
		Category c2 = new Category(null, "Lacteos");		
		Category c3 = new Category(null, "Carnes");		
		Category c4 = new Category(null, "Snacks");		
		

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(c1,c2,c3,c4));
	}

}
