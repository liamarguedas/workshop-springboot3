package com.sode.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sode.course.entities.Category;
import com.sode.course.entities.Order;
import com.sode.course.entities.Product;
import com.sode.course.entities.User;
import com.sode.course.entities.enums.OrderStatus;
import com.sode.course.repositories.CategoryRepository;
import com.sode.course.repositories.OrderRepository;
import com.sode.course.repositories.ProductRepository;
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

	@Autowired
	private ProductRepository productRepository;



	@Override
	public void run(String... args) throws Exception {

		// Testing users
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "99999999999999", "123456");
		User u2 = new User(null, "Liam Brown", "liam@gmail.com", "111111111111111", "12312321");


		// Testing orders
		Order o1 = new Order(null, Instant.parse("2025-04-30T19:53:07Z"), u1, OrderStatus.PAID);
		Order o2 = new Order(null, Instant.parse("2025-04-20T19:53:07Z"), u2, OrderStatus.PAID);
		Order o3 = new Order(null, Instant.parse("2025-04-23T19:53:07Z"), u2, OrderStatus.PAID);
		
		
		// Testing categories
		Category c1 = new Category(null, "Frutas");		
		Category c2 = new Category(null, "Lacteos");		
		Category c3 = new Category(null, "Carnes");		
		Category c4 = new Category(null, "Snacks");		
		
		// Testing products
		Product p1 = new Product(null, "Banano", "Fruta Banano", 1.00, "BANANO.URL");
		Product p2 = new Product(null, "Laranja", "Fruta Laranja", 1.30, "LARANJA.URL");
		Product p3 = new Product(null, "Leche", "Lacteo Leche", 0.10, "LECHE.URL");
		Product p4 = new Product(null, "File", "Carnes File", 10.00, "FILE.URL");
		Product p5 = new Product(null, "Doritos", "Snacks Doritos", 3.00, "DORITOS.URL");
		Product p6 = new Product(null, "Manzana", "Fruta Manzana", 2.00, "MANZANA.URL");
		Product p7 = new Product(null, "Lays", "Snacks Lays", 4.00, "LAYS.URL");
		

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(c1,c2,c3,c4));
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7));
		
		p1.getCategory().add(c1);
		p2.getCategory().add(c1);
		p3.getCategory().add(c2);
		p4.getCategory().add(c3);
		p5.getCategory().add(c4);
		p6.getCategory().add(c1);
		p7.getCategory().add(c4);

		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7));
	}

}
